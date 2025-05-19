import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class DetailTransaksi extends JFrame {

    public DetailTransaksi() {
        setTitle("Detail Transaksi");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Pusatkan tampilan

        // Panel utama
        JPanel panel = new JPanel(new BorderLayout());

        // Judul
        JLabel titleLabel = new JLabel("Detail Transaksi", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(titleLabel, BorderLayout.NORTH);

        // Label nama nasabah
        JLabel nasabahLabel = new JLabel("Nasabah A");
        nasabahLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.add(nasabahLabel, BorderLayout.WEST);

        // Data tabel
        String[] columnNames = {"Tanggal", "Tipe", "Jumlah"};
        Object[][] data = {
            {"03 MEI 2023", "Pinjaman", "Rp 15.000.000"},
            {"17 MEI 2023", "Pinjaman", "Rp 5.500.000"},
            {"27 MEI 2023", "Pinjam",   "Rp 3.600.000"}
        };

        JTable table = new JTable(new DefaultTableModel(data, columnNames));
        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane, BorderLayout.CENTER);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DetailTransaksi());
    }
}
