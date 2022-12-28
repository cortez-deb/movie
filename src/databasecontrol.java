import javax.swing.*;
import java.sql.*;

public class databasecontrol {
    String host = "localhost";
    String user = "deh";
    String pass="bedrock";
    String db = "movie";
    int port= 3306;
    public boolean adminlogin(String user, String pass)
    {
            login login=new login();
        String result ="";
        boolean allow;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/movie","deh","bedrock");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(" select password from adminlogin where userId='"+user+"';");
            while(rs.next())
                result =rs.getString(1);
            con.close();
        }
        catch (SQLException | ClassNotFoundException throwable) {
            System.out.println(throwable);
        }
        if(result.isEmpty()){
            JOptionPane.showMessageDialog(login.loginFrame,"No such user");
            allow=false;
        }else {
            allow=true;
        }
        return allow;
    }

}
