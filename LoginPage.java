import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame {
    public LoginPage() {
        // Set up the frame
        setTitle("Login Page");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create panel for login components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));

        // Add components to the panel
        JLabel userLabel = new JLabel("Username:");
        JTextField userText = new JTextField(15);
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passText = new JPasswordField(15);

        JButton loginButton = new JButton("Login");
        JLabel messageLabel = new JLabel("", SwingConstants.CENTER);

        panel.add(userLabel);
        panel.add(userText);
        panel.add(passLabel);
        panel.add(passText);
        panel.add(new JLabel());  // Placeholder for layout alignment
        panel.add(loginButton);

        // Add ActionListener to Login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passText.getPassword());

                // Check credentials (replace "admin" and "password" with desired credentials)
                if (username.equals("admin") && password.equals("password")) {
                    messageLabel.setText("Login successful!");
                } else {
                    messageLabel.setText("Invalid username or password.");
                }
            }
        });

        // Add components to frame
        add(panel, BorderLayout.CENTER);
        add(messageLabel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        // Create and display the login page
        SwingUtilities.invokeLater(() -> {
            LoginPage loginPage = new LoginPage();
            loginPage.setVisible(true);
        });
    }
}
