import javax.swing.*;
import java.awt.*;

public class login extends JFrame {
    JFrame loginFrame = new JFrame("LOGIN");
    JLabel username = new JLabel("Username");
    JTextField user = new JTextField("user id");
    JLabel password = new JLabel("Password");
    JPasswordField pass = new JPasswordField("**********");
    JButton signUp = new JButton("SignUp");
    JButton signIn = new JButton("Login");
    JButton cancel = new JButton("Cancel");

    public void createLogin(){
        loginFrame.setLayout(null);
        loginFrame.setBackground(Color.darkGray);
        loginFrame.setResizable(false);
        loginFrame.setCursor(2);
        loginFrame.setSize(4300,150);
        loginFrame.setBounds(500,200,400,200);
        loginFrame.setVisible(true);
        username.setBounds(0,0,80,20);
        user.setBounds(150,5,150,20);
        password.setBounds(0,30,80,20);
        pass.setBounds(150,35,150,20);
        signUp.setBounds(0,100,100,20);
        signIn.setBounds(150,100,80,20);
        cancel.setBounds(290,100,100,20);
        signUp.setBackground(Color.GRAY);
        cancel.setBackground(Color.GRAY);
        signIn.setBackground(Color.GRAY);
        loginFrame.add(username);
        loginFrame.add(user);
        loginFrame.add(password);
        loginFrame.add(pass);
        loginFrame.add(signUp);
        loginFrame.add(signIn);
        loginFrame.add(cancel);
    }
}
