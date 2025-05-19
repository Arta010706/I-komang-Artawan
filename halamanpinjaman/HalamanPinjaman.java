import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class HalamanPinjaman extends JFrame {

    public HalamanPinjaman() {
        setTitle("Halaman Pinjaman");
        setSize(600, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Panel Utama
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Sidebar
        JPanel sidebar = new JPanel();
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        sidebar.setPreferredSize(new Dimension(150, 300));

        sidebar.add(new JLabel("PINJAMAN"));
        sidebar.add(Box.createVerticalStrut(10));
        sidebar.add(new JLabel("SIMPANAN"));
        sidebar.add(Box.createVerticalStrut(10));
        sidebar.add(new JLabel("PINJAMAN"));

        // Tabel Pinjaman
        String[] columnNames = {"TANGGAL PINJAMAN", "NASABAH", "STATUS"};
        Object[][] data = {
            {"02 APRIL 2023", "NASABAH 1", "KELOLA"},
            {"04 APRIL 2023", "NASABAH 2", "KELOLA"},
            {"06 APRIL 2023", "NASABAH 3", "KELOLA"},
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 2; // hanya kolom "STATUS" (KELOLA) bisa diklik
            }
        };

        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        // Jika ingin tombol di kolom STATUS (opsional)
        table.getColumn("STATUS").setCellRenderer(new ButtonRenderer());
        table.getColumn("STATUS").setCellEditor(new ButtonEditor(new JCheckBox()));

        // Tambahkan ke frame
        mainPanel.add(sidebar, BorderLayout.WEST);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        add(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new HalamanPinjaman().setVisible(true));
    }

    // Kelas untuk tombol di kolom "STATUS"
    class ButtonRenderer extends JButton implements javax.swing.table.TableCellRenderer {
        public ButtonRenderer() {
            setText("KELOLA");
        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                                                       boolean hasFocus, int row, int column) {
            return this;
        }
    }

    class ButtonEditor extends DefaultCellEditor {
        protected JButton button;
        private String label;
        private boolean isPushed;

        public ButtonEditor(JCheckBox checkBox) {
            super(checkBox);
            button = new JButton();
            button.setOpaque(true);
            button.addActionListener(e -> fireEditingStopped());
        }

        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            label = (value == null) ? "KELOLA" : value.toString();
            button.setText(label);
            isPushed = true;
            return button;
        }

        public Object getCellEditorValue() {
            if (isPushed) {
                JOptionPane.showMessageDialog(button, "Kelola data untuk baris ini.");
            }
            isPushed = false;
            return label;
        }
    }
}
