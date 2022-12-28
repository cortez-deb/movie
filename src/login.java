import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {
    JFrame loginFrame = new JFrame("LOGIN");
    JLabel username = new JLabel("Username");
    final JTextField user = new JTextField("user id");
    JLabel password = new JLabel("Password");
   final JTextField pass = new JTextField("**********");
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

        signIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName =user.getText();

                String passWord=pass.getText();
                if(userName.isEmpty()||passWord.isEmpty()||user==null||pass==null) {
                    JOptionPane.showMessageDialog(loginFrame,"Field empty");
                }
                else {
/*
                    for (int i =0;
                         i<userName.length();
                         i++
                    ){
                        char ch = userName.charAt(i);
                        if(!(ch >='a' &&  ch<='z'|| ch >='A'&& ch <='Z')){
                            flag=false;
                            System.out.println("1st flag off ");
                            System.out.println(userName.length());
                        }}*/
                        if(userName.matches("^[a-zA-Z0-9]*$")){
                            if(userName.matches("''/#$%^&*()-+=")) {
                                JOptionPane.showMessageDialog(loginFrame,"Invalid Username");

                            }
                            else {
                                            if(passWord.matches("^[a-zA-Z0-9]*$"))
                                                    {
                                                   //database goes
                                                        databasecontrol databasecontrol =
                                                                new databasecontrol();
                                                        int login = databasecontrol.adminlogin(userName,passWord);
                                                        System.out.println(login);
                                                    }
                                            else {
                                                JOptionPane.showMessageDialog(loginFrame,"Invalid password");
                                            }


                            }
                        }
                        else {
                            JOptionPane.showMessageDialog(loginFrame,"Invalid Username");
                        }


                    }
                }

        });
    }
}
