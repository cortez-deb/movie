import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {
    Boolean session;
    JFrame loginFrame = new JFrame("LOGIN");
    JLabel username = new JLabel("Username");
    final JTextField user = new JTextField("user id");
    JLabel password = new JLabel("Password");
   final JPasswordField pass = new JPasswordField("**********");
    JButton signUp = new JButton("SignUp");
    JButton signIn = new JButton("Login");
    JButton cancel = new JButton("Cancel");

    public Boolean createLogin(){
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
                char [] Passwd = pass.getPassword();
                String passW="";
                for (int i= 0;i<Passwd.length;i++){
                    passW=passW.concat(String.valueOf(Passwd[i]));
                }
                String passWord=passW;





                if(userName.isEmpty()||passWord.isEmpty()||user==null||pass==null) {
                    JOptionPane.showMessageDialog(loginFrame,"Field empty");
                }
                else {
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
                                                        session= databasecontrol.adminlogin(userName,passWord);
                                                    if(session){
                                                        loginFrame.setVisible(false);
                                                        addmovie addmovie = new addmovie();
                                                        addmovie.createMovie();
                                                        addmovie.displayNames();
                                                    }

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

        signUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginFrame.setVisible(false);
                register register =new register();
                register.createRegister();
            }
        });
    return session;

    }
}
