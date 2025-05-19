import javax.swing.*;
import java.awt.*;

public class FormUser extends JFrame {

    public FormUser() {
        setTitle("Pengelolaan Data User");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Gunakan GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 10, 5, 10);
        gbc.anchor = GridBagConstraints.WEST;

        // Label Judul
        JLabel titleLabel = new JLabel("Pengelolaan Data User");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridwidth = 2;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(titleLabel, gbc);
        gbc.gridwidth = 1;

        // Komponen form
        String[] labels = {
            "Nama Lengkap", "Username", "Email", "Password",
            "Level Akses", "Status Akun", "Foto Profil"
        };

        Component[] inputs = new Component[labels.length];

        String[] aksesOptions = {"Admin", "User"};
        String[] statusOptions = {"Aktif", "Nonaktif"};

        for (int i = 0; i < labels.length; i++) {
            gbc.gridx = 0;
            gbc.gridy = i + 1;
            panel.add(new JLabel(labels[i]), gbc);

            gbc.gridx = 1;

            switch (labels[i]) {
                case "Level Akses":
                    inputs[i] = new JComboBox<>(aksesOptions);
                    break;
                case "Status Akun":
                    inputs[i] = new JComboBox<>(statusOptions);
                    break;
                case "Password":
                    inputs[i] = new JPasswordField(15);
                    break;
                case "Foto Profil":
                    inputs[i] = new JButton("Choose File");
                    break;
                default:
                    inputs[i] = new JTextField(15);
                    break;
            }

            panel.add(inputs[i], gbc);
        }

        // Tombol Simpan dan Batal
        JPanel buttonPanel = new JPanel();
        JButton simpanButton = new JButton("Simpan");
        JButton batalButton = new JButton("Batal");

        buttonPanel.add(simpanButton);
        buttonPanel.add(batalButton);

        gbc.gridx = 0;
        gbc.gridy = labels.length + 1;
        gbc.gridwidth = 2;
        panel.add(buttonPanel, gbc);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FormUser());
    }
}
