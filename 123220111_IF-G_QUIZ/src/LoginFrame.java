/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Lenovo
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    private JTextField textFieldUsername;
    private JPasswordField passwordField;
    private JButton buttonLogin;

    public LoginFrame() {
        setTitle("Login Page");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textFieldUsername = new JTextField();
        passwordField = new JPasswordField();
        buttonLogin = new JButton("Log-in");

        setLayout(new GridLayout(5, 3, 7, 4));
      
        add(new JLabel("Username:"));
        add(textFieldUsername);
        
        add(new JLabel("Password:"));
        add(passwordField);
       
        add(new JLabel());
        add(buttonLogin);

        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String username = textFieldUsername.getText();
                String password = new String(passwordField.getPassword());

           
                if (username.equals("123220111") && password.equals("123123")) {
                    InputNilaiFrame inputNilaiFrame = new InputNilaiFrame();
                    dispose();
                } else {
                    dispose();
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        LoginFrame loginFrame = new LoginFrame();
    }
}
