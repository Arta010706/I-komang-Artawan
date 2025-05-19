import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormLogin extends JFrame implements ActionListener {
    private Container container;
    private JLabel userLabel, passLabel, titleLabel;
    private JTextField userTextField;
    private JPasswordField passField;
    private JButton loginButton, resetButton;

    public FormLogin() {
        setTitle("Form Login");
        setBounds(300, 90, 400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container = getContentPane();
        container.setLayout(null);

        titleLabel = new JLabel("Login User");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setBounds(140, 10, 200, 30);
        container.add(titleLabel);

        userLabel = new JLabel("Username");
        userLabel.setBounds(50, 60, 100, 30);
        container.add(userLabel);

        userTextField = new JTextField();
        userTextField.setBounds(150, 60, 180, 30);
        container.add(userTextField);

        passLabel = new JLabel("Password");
        passLabel.setBounds(50, 100, 100, 30);
        container.add(passLabel);

        passField = new JPasswordField();
        passField.setBounds(150, 100, 180, 30);
        container.add(passField);

        loginButton = new JButton("Login");
        loginButton.setBounds(150, 150, 80, 30);
        loginButton.addActionListener(this);
        container.add(loginButton);

        resetButton = new JButton("Reset");
        resetButton.setBounds(250, 150, 80, 30);
        resetButton.addActionListener(this);
        container.add(resetButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loginButton){
            String user = userTextField.getText();
            String pass = new String(passField.getPassword());

            // Dummy login check
            if(user.equals("admin") && pass.equals("1234")){
                JOptionPane.showMessageDialog(this, "Login Berhasil");
            } else {
                JOptionPane.showMessageDialog(this, "Username atau Password salah");
            }
        }

        if(e.getSource() == resetButton){
            userTextField.setText("");
            passField.setText("");
        }
    }

    public static void main(String[] args) {
        new FormLogin();
    }
}
