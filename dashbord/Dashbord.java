import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Dashbord extends JFrame {

    public Dashbord() {
        setTitle("Dashboard");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 500);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Sidebar panel
        JPanel sidebar = new JPanel();
        sidebar.setBackground(new Color(230, 230, 230));
        sidebar.setLayout(new GridLayout(4, 1));
        sidebar.setPreferredSize(new Dimension(150, getHeight()));

        JButton btnDashboard = new JButton("DASHBOARD");
        JButton btnSimpanan = new JButton("SIMPANAN");
        JButton btnPinjaman = new JButton("PINJAMAN");
        JButton btnLaporan = new JButton("LAPORAN");

        sidebar.add(btnDashboard);
        sidebar.add(btnSimpanan);
        sidebar.add(btnPinjaman);
        sidebar.add(btnLaporan);

        // Title
        JLabel title = new JLabel("DASHBOARD", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        // Content panel
        JPanel content = new JPanel();
        content.setLayout(null);

        JButton totalSimpanan = new JButton("TOTAL SIMPANAN");
        totalSimpanan.setBounds(180, 20, 150, 30);

        JButton tambahSimpanan = new JButton("TAMBAH SIMPANAN");
        tambahSimpanan.setBounds(350, 20, 180, 30);

        JTable table = new JTable();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("TANGGAL");
        model.addColumn("NASABAH");
        model.addColumn("JUMLAH");

        model.addRow(new Object[]{"10 April 2023", "Nasabah 1", "Rp 1.500.000"});
        model.addRow(new Object[]{"20 April 2023", "Nasabah 2", "Rp 2.000.000"});
        model.addRow(new Object[]{"30 April 2023", "Nasabah 3", "Rp 500.000"});

        table.setModel(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(180, 70, 500, 100);

        content.add(totalSimpanan);
        content.add(tambahSimpanan);
        content.add(scrollPane);

        // Add to frame
        add(title, BorderLayout.NORTH);
        add(sidebar, BorderLayout.WEST);
        add(content, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Dashbord().setVisible(true));
    }
}
