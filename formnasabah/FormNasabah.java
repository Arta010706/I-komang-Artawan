import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormNasabah extends JFrame {
    private JTextField namaField;
    private JTextField usernameField;
    private JPasswordField passwordField;

    public FormNasabah() {
        setTitle("Pengelolaan Data Nasabah");
        setSize(400, 300);
        setLocationRelativeTo(null); // Center on screen
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Panel utama
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel title = new JLabel("PENGELOLAAN DATA NASABAH");
        title.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(10, 10, 20, 10);
        panel.add(title, gbc);

        gbc.gridwidth = 1;
        gbc.insets = new Insets(5, 10, 5, 10);

        // Label dan TextField Nama
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Nama:"), gbc);

        gbc.gridx = 1;
        namaField = new JTextField(20);
        panel.add(namaField, gbc);

        // Username
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Username:"), gbc);

        gbc.gridx = 1;
        usernameField = new JTextField(20);
        panel.add(usernameField, gbc);

        // Password
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(new JLabel("Password:"), gbc);

        gbc.gridx = 1;
        passwordField = new JPasswordField(20);
        panel.add(passwordField, gbc);

        // Tombol
        gbc.gridy = 4;
        gbc.gridx = 0;
        JButton simpanButton = new JButton("SIMPAN");
        simpanButton.addActionListener(e -> simpanData());
        panel.add(simpanButton, gbc);

        gbc.gridx = 1;
        JButton batalButton = new JButton("Batal");
        batalButton.addActionListener(e -> clearForm());
        panel.add(batalButton, gbc);

        add(panel);
    }

    private void simpanData() {
        String nama = namaField.getText();
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        JOptionPane.showMessageDialog(this,
                "Data Disimpan:\nNama: " + nama + "\nUsername: " + username + "\nPassword: " + password);
    }

    private void clearForm() {
        namaField.setText("");
        usernameField.setText("");
        passwordField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FormNasabah().setVisible(true);
        });
    }
}
