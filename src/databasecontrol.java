import javax.swing.*;
import java.sql.*;

public class databasecontrol {
    String host = "localhost";
    String user = "deh";
    String pass="bedrock";
    String db = "movie";
    int port= 3306;
    public int adminlogin(String user,String pass)
    {
            login login=new login();
        int result =0;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/movie","deh","bedrock");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(" select password from adminlogin where userId='"+user+"';");
            while(rs.next())
                result =rs.getInt(1);
            con.close();
        }
        catch (SQLException | ClassNotFoundException throwable) {
            System.out.println(throwable);
            JOptionPane.showMessageDialog(login.loginFrame,"Failed to login");
        }
        return result;
    }

}
