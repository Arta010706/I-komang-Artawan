import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class FormMahasiswa extends JFrame implements ActionListener {
    private JTextField txtNIM, txtNama, txtAlamat, txtPhone, txtProdi;
    private JRadioButton rbPria, rbWanita;
    private JButton btnSimpan, btnUbah, btnHapus, btnBersih, btnKeluar, btnCetak;
    private JTable table;
    private DefaultTableModel tableModel;
    private ButtonGroup genderGroup;

    public FormMahasiswa() {
        setTitle("Data Mahasiswa");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 500);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblTitle = new JLabel("DATA MAHASISWA");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitle.setBounds(300, 10, 300, 30);
        add(lblTitle);

        JLabel lblNIM = new JLabel("NIM");
        lblNIM.setBounds(30, 60, 80, 25);
        add(lblNIM);

        txtNIM = new JTextField();
        txtNIM.setBounds(110, 60, 200, 25);
        add(txtNIM);

        JLabel lblNama = new JLabel("NAMA");
        lblNama.setBounds(30, 90, 80, 25);
        add(lblNama);

        txtNama = new JTextField();
        txtNama.setBounds(110, 90, 200, 25);
        add(txtNama);

        JLabel lblAlamat = new JLabel("ALAMAT");
        lblAlamat.setBounds(30, 120, 80, 25);
        add(lblAlamat);

        txtAlamat = new JTextField();
        txtAlamat.setBounds(110, 120, 200, 25);
        add(txtAlamat);

        JLabel lblJK = new JLabel("JENIS KELAMIN");
        lblJK.setBounds(330, 60, 100, 25);
        add(lblJK);

        rbPria = new JRadioButton("Pria");
        rbPria.setBounds(440, 60, 60, 25);
        rbWanita = new JRadioButton("Wanita");
        rbWanita.setBounds(510, 60, 80, 25);
        genderGroup = new ButtonGroup();
        genderGroup.add(rbPria);
        genderGroup.add(rbWanita);
        add(rbPria);
        add(rbWanita);

        JLabel lblPhone = new JLabel("PHONE");
        lblPhone.setBounds(330, 90, 80, 25);
        add(lblPhone);

        txtPhone = new JTextField();
        txtPhone.setBounds(440, 90, 200, 25);
        add(txtPhone);

        JLabel lblProdi = new JLabel("PRODI");
        lblProdi.setBounds(330, 120, 80, 25);
        add(lblProdi);

        txtProdi = new JTextField();
        txtProdi.setBounds(440, 120, 200, 25);
        add(txtProdi);

        btnSimpan = new JButton("Simpan");
        btnSimpan.setBounds(30, 160, 100, 30);
        btnSimpan.addActionListener(this);
        add(btnSimpan);

        btnUbah = new JButton("Ubah");
        btnUbah.setBounds(140, 160, 100, 30);
        btnUbah.addActionListener(this);
        add(btnUbah);

        btnHapus = new JButton("Hapus");
        btnHapus.setBounds(250, 160, 100, 30);
        btnHapus.addActionListener(this);
        add(btnHapus);

        btnBersih = new JButton("Bersihkan");
        btnBersih.setBounds(360, 160, 100, 30);
        btnBersih.addActionListener(this);
        add(btnBersih);

        btnKeluar = new JButton("Keluar");
        btnKeluar.setBounds(470, 160, 100, 30);
        btnKeluar.addActionListener(this);
        add(btnKeluar);

        btnCetak = new JButton("Cetak");
        btnCetak.setBounds(580, 160, 100, 30);
        add(btnCetak); // tidak ada aksi di cetak, dummy
        btnCetak.addActionListener(e -> JOptionPane.showMessageDialog(this, "Fitur Cetak belum tersedia"));

        // Table
        String[] columnNames = {"NIM", "Nama", "Jurusan", "No. HP", "Alamat", "Jenis Kelamin"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(30, 210, 720, 200);
        add(scrollPane);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnSimpan){
            String gender = rbPria.isSelected() ? "Laki-laki" : rbWanita.isSelected() ? "Perempuan" : "";
            tableModel.addRow(new Object[]{
                txtNIM.getText(), txtNama.getText(), gender, txtPhone.getText(), txtAlamat.getText(), txtProdi.getText()
            });
        } else if(e.getSource() == btnUbah){
            int row = table.getSelectedRow();
            if(row != -1){
                tableModel.setValueAt(txtNIM.getText(), row, 0);
                tableModel.setValueAt(txtNama.getText(), row, 1);
                tableModel.setValueAt(rbPria.isSelected() ? "Laki-laki" : "Perempuan", row, 2);
                tableModel.setValueAt(txtPhone.getText(), row, 3);
                tableModel.setValueAt(txtAlamat.getText(), row, 4);
                tableModel.setValueAt(txtProdi.getText(), row, 5);
            }
        } else if(e.getSource() == btnHapus){
            int row = table.getSelectedRow();
            if(row != -1){
                tableModel.removeRow(row);
            }
        } else if(e.getSource() == btnBersih){
            txtNIM.setText("");
            txtNama.setText("");
            txtAlamat.setText("");
            txtPhone.setText("");
            txtProdi.setText("");
            genderGroup.clearSelection();
        } else if(e.getSource() == btnKeluar){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new FormMahasiswa();
    }
}
