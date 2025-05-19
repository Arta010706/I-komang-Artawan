import javax.swing.*;
import java.awt.*;

public class HistoryTransaksiPinjaman extends JFrame {

    public HistoryTransaksiPinjaman() {
        setTitle("History Transaksi Pinjaman");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // Panel utama
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Judul
        JLabel titleLabel = new JLabel("KELOLA DATA PINJAMAN/PEMBAYARAN", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 14));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(titleLabel, gbc);

        // NASABAH
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Nasabah:"), gbc);

        gbc.gridx = 1;
        JTextField nasabahField = new JTextField();
        panel.add(nasabahField, gbc);

        // TANGGAL
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Tanggal:"), gbc);

        gbc.gridx = 1;
        JComboBox<String> tanggalCombo = new JComboBox<>(new String[]{"PINJAMAN", "PEMBAYARAN"});
        panel.add(tanggalCombo, gbc);

        // TIPE
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(new JLabel("Tipe:"), gbc);

        gbc.gridx = 1;
        JRadioButton pinjamanRadio = new JRadioButton("PINJAMAN");
        ButtonGroup tipeGroup = new ButtonGroup();
        tipeGroup.add(pinjamanRadio);
        pinjamanRadio.setSelected(true);
        panel.add(pinjamanRadio, gbc);

        // Tombol SIMPAN & BATAL
        JPanel buttonPanel = new JPanel();
        JButton simpanBtn = new JButton("SIMPAN");
        JButton batalBtn = new JButton("BATAL");
        buttonPanel.add(simpanBtn);
        buttonPanel.add(batalBtn);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        panel.add(buttonPanel, gbc);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new HistoryTransaksiPinjaman());
    }
}
