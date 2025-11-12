import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing2 extends JFrame {
    private JTabbedPane jTabbedPane;
    private JTree jTree;
    private JTextField txtturunan;
    private JButton cmdtambah;
    private JTable table1, table2;

    public Swing2() {
        initComponents();
        setTitle("Percobaan GUI 2");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        jTabbedPane = new JTabbedPane();

        // Halaman 1 - dengan JTable
        JPanel panel1 = new JPanel(new BorderLayout());
        panel1.add(new JLabel("Halaman Pertama", JLabel.CENTER), BorderLayout.NORTH);
        
        // Tabel untuk halaman 1
        String[] columnNames1 = {"No", "Nama", "NIM"};
        Object[][] data1 = {
            {"1", "Andi", "101"},
            {"2", "Budi", "102"},
            {"3", "Citra", "103"},
            {"4", "Dewi", "104"},
            {"5", "Eko", "105"}
        };
        table1 = new JTable(new DefaultTableModel(data1, columnNames1));
        JScrollPane scrollPane1 = new JScrollPane(table1);
        panel1.add(scrollPane1, BorderLayout.CENTER);

        // Halaman 2 - dengan JTable berbeda
        JPanel panel2 = new JPanel(new BorderLayout());
        panel2.add(new JLabel("Halaman Kedua", JLabel.CENTER), BorderLayout.NORTH);
        
        String[] columnNames2 = {"Kode", "Mata Kuliah", "SKS"};
        Object[][] data2 = {
            {"MK001", "Pemrograman Berorientasi Objek", "3"},
            {"MK002", "Basis Data", "3"},
            {"MK003", "Jaringan Komputer", "2"},
            {"MK004", "Sistem Operasi", "3"},
            {"MK005", "Pemrograman Web", "3"}
        };
        table2 = new JTable(new DefaultTableModel(data2, columnNames2));
        JScrollPane scrollPane2 = new JScrollPane(table2);
        panel2.add(scrollPane2, BorderLayout.CENTER);

        // Halaman 3 - dengan JTree
        JPanel panel3 = new JPanel(new BorderLayout());
        panel3.add(new JLabel("Halaman Ketiga", JLabel.CENTER), BorderLayout.NORTH);

        // Membuat JTree
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Node 1");
        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Node 2");
        
        root.add(node1);
        root.add(node2);
        
        node1.add(new DefaultMutableTreeNode("Child 1"));
        node1.add(new DefaultMutableTreeNode("Child 2"));
        node2.add(new DefaultMutableTreeNode("Child 3"));

        jTree = new JTree(root);
        JScrollPane treeScroll = new JScrollPane(jTree);
        panel3.add(treeScroll, BorderLayout.CENTER);

        // Panel untuk input tree
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(new JLabel("Masukan Pewaris/Turunan:"));
        txtturunan = new JTextField(15);
        inputPanel.add(txtturunan);
        
        cmdtambah = new JButton("Tambah");
        cmdtambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tambahNode();
            }
        });
        inputPanel.add(cmdtambah);
        
        panel3.add(inputPanel, BorderLayout.SOUTH);

        // Menambahkan panel ke tabbed pane
        jTabbedPane.addTab("Halaman 1", panel1);
        jTabbedPane.addTab("Halaman 2", panel2);
        jTabbedPane.addTab("Halaman 3", panel3);

        add(jTabbedPane);
    }

    private void tambahNode() {
        String nodeText = txtturunan.getText().trim();
        if (nodeText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masukkan nama node!");
            return;
        }

        DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(nodeText);
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree.getLastSelectedPathComponent();
        
        if (selectedNode == null) {
            selectedNode = (DefaultMutableTreeNode) jTree.getModel().getRoot();
        }
        
        DefaultTreeModel model = (DefaultTreeModel) jTree.getModel();
        model.insertNodeInto(newNode, selectedNode, selectedNode.getChildCount());
        
        // Expand node yang dipilih untuk menampilkan child baru
        jTree.expandPath(jTree.getSelectionPath());
        txtturunan.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Swing2().setVisible(true);
            }
        });
    }
}
