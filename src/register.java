import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class register {
    JFrame register = new JFrame("REGISTER");
    JLabel username = new JLabel("Username");
    JTextField user = new JTextField("user name");
    JLabel email = new JLabel("Email ID");
    JTextField mail = new JTextField("email");
    JLabel password = new JLabel("Password");
    JPasswordField passwordField = new JPasswordField("*****************");
    JLabel confirmPass = new JLabel("Confirm");
    JPasswordField confirmPassword = new JPasswordField("****************");
    JLabel terms = new JLabel("Terms And Conditions");
    JTextArea getTerms = new JTextArea("""
            . Definitions.

                  "License" shall mean the terms and conditions for use, reproduction,
                  and distribution as defined by Sections 1 through 9 of this document.

                  "Licensor" shall mean the copyright owner or entity authorized by
                  the copyright owner that is granting the License.""");
    JLabel agree = new JLabel("Agree");
    JRadioButton agreed = new JRadioButton();
    JButton cancel = new JButton("CANCEL");
    JButton signup = new JButton("SignUp");



    public  void createRegister(){
        register.setLayout(null);
        register.setSize(400,500);
        register.setBounds(500,200,400,500);
        register.setBackground(Color.darkGray);
        register.setResizable(false);
        register.setVisible(true);

        username.setBounds(0,5,150,30);
        user.setBounds(150,5,150,30);
        email.setBounds(0,45,150,30);
        mail.setBounds(150,45,150,30);
        password.setBounds(0,85,150,30);
        passwordField.setBounds(150,100,150,30);
        confirmPass.setBounds(0,130,150,30);
        confirmPassword.setBounds(150,130,150,30);
        terms.setBounds(100,200,250,30);
        getTerms.setBounds(0,230,400,150);
        agree.setBounds(0,380,50,30);
        agreed.setBounds(50,384,20,20);
        cancel.setBounds(5,430,100,20);
        signup.setBounds(300,430,100,20);
        signup.setBackground(Color.lightGray);
        agreed.setBackground(Color.lightGray);
        cancel.setBackground(Color.lightGray);

        register.add(username);
        register.add(user);
        register.add(email);
        register.add(mail);
        register.add(password);
        register.add(passwordField);
        register.add(confirmPass);
        register.add(confirmPassword);
        register.add(terms);
        register.add(getTerms);
        register.add(agree);
        register.add(agreed);
        register.add(cancel);
        register.add(signup);

        signup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean userName;
                boolean PassWord;
                boolean Email;
                String username = user.getText();
                String email = mail.getText();
                char[] pass = passwordField.getPassword();
                char [] Passwd = confirmPassword.getPassword();
                String passWord="";
                String Pass="";
                for (int i= 0;i<pass.length;i++){
                    passWord=passWord.concat(String.valueOf(pass[i]));
                }
                String password=passWord;
                for (int J =0;J<Passwd.length;J++){
                    Pass= Pass.concat(String.valueOf(Passwd[J]));
                }
                String Password = Pass;
                JRadioButton agree = agreed;

                if(username.isEmpty() || email.isEmpty() || password.isEmpty()||Password.isEmpty())
                {
                    if(username.isEmpty())
                    {
                        JOptionPane.showMessageDialog(register,"username cannot be empty");

                    }else if (email.isEmpty())
                    {
                        JOptionPane.showMessageDialog(register,"email cannot be empty");

                    }
                    else if(Password.isEmpty()){
                        JOptionPane.showMessageDialog(register,"confirm password cannot be empty");

                    }else {
                        JOptionPane.showMessageDialog(register,"password cannot be empty");

                    }

                }else {
                    if(username.matches("^[a-zA-Z0-9]$")){
                            if(username.matches("''/#$%^&*()-+=")){
                                JOptionPane.showMessageDialog(register,"Invalid Username1");
                                userName = false;
                            }
                            else {
                                userName = true;
                            }
                    }else
                            {
                                JOptionPane.showMessageDialog(register,"invalid username2");
                                userName = false;

                            }

                    if(email.matches("[a-zA-Z0-9]"))
                    {
                        Email = true;
                    }
                    else {
                        JOptionPane.showMessageDialog(register,"Invalid email");
                    }












                }
            }
        });
    }

}
