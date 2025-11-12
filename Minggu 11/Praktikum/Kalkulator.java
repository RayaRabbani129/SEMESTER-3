import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator extends JFrame {
    private JTextField display;
    private double angkaPertama = 0;
    private String operator = "";
    private boolean startNewNumber = true;

    public Kalkulator() {
        setTitle("Kalkulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);
        
        initComponents();
    }

    private void initComponents() {
        // Panel utama
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(5, 5));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Display
        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        display.setText("0");
        display.setBackground(Color.WHITE);
        panel.add(display, BorderLayout.NORTH);

        // Panel untuk tombol
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));

        // Tombol-tombol kalkulator
        String[] buttons = {
            "C", "⌫", "%", "/",
            "7", "8", "9", "*",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "±", "0", ".", "="
        };

        for (String text : buttons) {
            JButton button = createButton(text);
            buttonPanel.add(button);
        }

        panel.add(buttonPanel, BorderLayout.CENTER);
        add(panel);
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 18));
        button.setFocusPainted(false);
        
        // Warna khusus untuk operator
        if ("/*-+=".contains(text)) {
            button.setBackground(new Color(255, 149, 0));
            button.setForeground(Color.WHITE);
        } else if ("C⌫%".contains(text)) {
            button.setBackground(new Color(165, 165, 165));
            button.setForeground(Color.BLACK);
        } else {
            button.setBackground(new Color(212, 212, 210));
            button.setForeground(Color.BLACK);
        }
        
        button.addActionListener(new ButtonClickListener());
        return button;
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
                // Input angka
                if (startNewNumber || display.getText().equals("0")) {
                    display.setText(command);
                    startNewNumber = false;
                } else {
                    display.setText(display.getText() + command);
                }
            } else if (command.equals(".")) {
                // Input titik desimal
                if (startNewNumber) {
                    display.setText("0.");
                    startNewNumber = false;
                } else if (!display.getText().contains(".")) {
                    display.setText(display.getText() + ".");
                }
            } else if (command.equals("C")) {
                // Clear
                display.setText("0");
                angkaPertama = 0;
                operator = "";
                startNewNumber = true;
            } else if (command.equals("⌫")) {
                // Backspace
                String currentText = display.getText();
                if (currentText.length() > 1) {
                    display.setText(currentText.substring(0, currentText.length() - 1));
                } else {
                    display.setText("0");
                    startNewNumber = true;
                }
            } else if (command.equals("±")) {
                // Plus/Minus
                double value = Double.parseDouble(display.getText());
                value = -value;
                display.setText(formatNumber(value));
            } else if (command.equals("%")) {
                // Persentase
                double value = Double.parseDouble(display.getText());
                value = value / 100;
                display.setText(formatNumber(value));
            } else if (command.equals("=")) {
                // Hitung hasil
                if (!operator.isEmpty()) {
                    double angkaKedua = Double.parseDouble(display.getText());
                    double hasil = hitung(angkaPertama, angkaKedua, operator);
                    display.setText(formatNumber(hasil));
                    operator = "";
                    startNewNumber = true;
                }
            } else {
                // Operator (+, -, *, /)
                if (!operator.isEmpty() && !startNewNumber) {
                    // Jika sudah ada operator sebelumnya, hitung dulu
                    double angkaKedua = Double.parseDouble(display.getText());
                    double hasil = hitung(angkaPertama, angkaKedua, operator);
                    display.setText(formatNumber(hasil));
                    angkaPertama = hasil;
                } else {
                    angkaPertama = Double.parseDouble(display.getText());
                }
                operator = command;
                startNewNumber = true;
            }
        }

        private double hitung(double a, double b, String op) {
            switch (op) {
                case "+": return a + b;
                case "-": return a - b;
                case "*": return a * b;
                case "/": 
                    if (b == 0) {
                        JOptionPane.showMessageDialog(null, "Tidak bisa membagi dengan nol!");
                        return 0;
                    }
                    return a / b;
                default: return b;
            }
        }

        private String formatNumber(double value) {
            if (value == (long) value) {
                return String.format("%d", (long) value);
            } else {
                return String.format("%s", value);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }
}
