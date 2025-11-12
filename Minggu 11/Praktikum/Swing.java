import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing extends JFrame {
    private String nama, nim, jeniskelamin, info, jurusan, matakuliah, semester, alamat;
    
    // Komponen GUI
    private JTextField txtname, txtnim, txtalamat;
    private JRadioButton rdLaki, rdPerempuan;
    private JCheckBox cbMK1, cbMK2;
    private JList<String> listjurusan;
    private JComboBox<String> comboxsemester;
    private JTextArea hasil;
    private JButton cmdtampil, cmdclear;
    private JPanel panel;

    public Swing() {
        initComponents();
        setTitle("Data Mahasiswa");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        panel = new JPanel();
        panel.setLayout(new GridLayout(10, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Label dan TextField untuk Nama
        panel.add(new JLabel("Nama:"));
        txtname = new JTextField();
        panel.add(txtname);

        // Label dan TextField untuk NIM
        panel.add(new JLabel("NIM:"));
        txtnim = new JTextField();
        panel.add(txtnim);

        // Label dan TextField untuk Alamat (modifikasi)
        panel.add(new JLabel("Alamat:"));
        txtalamat = new JTextField();
        panel.add(txtalamat);

        // Radio Button untuk Jenis Kelamin
        panel.add(new JLabel("Jenis Kelamin:"));
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        rdLaki = new JRadioButton("Laki-laki");
        rdPerempuan = new JRadioButton("Perempuan");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rdLaki);
        genderGroup.add(rdPerempuan);
        genderPanel.add(rdLaki);
        genderPanel.add(rdPerempuan);
        panel.add(genderPanel);

        // Checkbox untuk Mata Kuliah
        panel.add(new JLabel("Mata Kuliah:"));
        JPanel mkPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        cbMK1 = new JCheckBox("Sistem Terdistribusi");
        cbMK2 = new JCheckBox("PBO");
        mkPanel.add(cbMK1);
        mkPanel.add(cbMK2);
        panel.add(mkPanel);

        // List untuk Jurusan
        panel.add(new JLabel("Jurusan:"));
        String[] jurusans = {"D3 Teknik Informatika", "D3 Management Informatika", "D3 Telekomunikasi"};
        listjurusan = new JList<>(jurusans);
        listjurusan.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listjurusan.setSelectedIndex(0);
        JScrollPane listScroll = new JScrollPane(listjurusan);
        listScroll.setPreferredSize(new Dimension(200, 60));
        panel.add(listScroll);

        // ComboBox untuk Semester
        panel.add(new JLabel("Semester:"));
        String[] semesters = {"Semester 1", "Semester 2", "Semester 3", "Semester 4", "Semester 5", "Semester 6"};
        comboxsemester = new JComboBox<>(semesters);
        panel.add(comboxsemester);

        // TextArea untuk Hasil
        panel.add(new JLabel("Hasil:"));
        hasil = new JTextArea(5, 20);
        hasil.setEditable(false);
        JScrollPane scrollHasil = new JScrollPane(hasil);
        panel.add(scrollHasil);

        // Tombol Tampil
        cmdtampil = new JButton("Tampil");
        cmdtampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tampilkanData();
            }
        });
        panel.add(cmdtampil);

        // Tombol Clear
        cmdclear = new JButton("Clear");
        cmdclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearData();
            }
        });
        panel.add(cmdclear);

        add(panel);
    }

    private void tampilkanData() {
        // Validasi alamat (modifikasi)
        if (txtalamat.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Alamat harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        nama = txtname.getText();
        nim = txtnim.getText();
        alamat = txtalamat.getText();
        matakuliah = "";
        
        if (cbMK1.isSelected())
            matakuliah = "Sistem Terdistribusi";
        if (cbMK2.isSelected()) {
            if (!matakuliah.isEmpty()) matakuliah += ", ";
            matakuliah += "PBO";
        }
        if (matakuliah.isEmpty()) matakuliah = "Tidak ada mata kuliah yang dipilih";
        
        jeniskelamin = "";
        if (rdLaki.isSelected())
            jeniskelamin = "Laki-Laki";
        if (rdPerempuan.isSelected())
            jeniskelamin = "Perempuan";
        if (jeniskelamin.isEmpty()) jeniskelamin = "Belum dipilih";
            
        jurusan = listjurusan.getSelectedValue();
        semester = comboxsemester.getSelectedItem().toString();
        
        info = "Nama : " + nama + "\n";
        info += "NIM : " + nim + "\n";
        info += "Alamat : " + alamat + "\n";
        info += "Jenis Kelamin : " + jeniskelamin + "\n";
        info += "Jurusan : " + jurusan + "\n";
        info += "Semester : " + semester + "\n";
        info += "Mata Kuliah : " + matakuliah;
        
        hasil.setText(info);
        JOptionPane.showMessageDialog(this, info, "Data Mahasiswa", JOptionPane.INFORMATION_MESSAGE);
    }

    private void clearData() {
        txtname.setText("");
        txtnim.setText("");
        txtalamat.setText("");
        rdLaki.setSelected(false);
        rdPerempuan.setSelected(false);
        cbMK1.setSelected(false);
        cbMK2.setSelected(false);
        listjurusan.setSelectedIndex(0);
        comboxsemester.setSelectedIndex(0);
        hasil.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Swing().setVisible(true);
            }
        });
    }
}