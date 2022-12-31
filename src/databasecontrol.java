import javax.swing.*;
import java.sql.*;

public class databasecontrol {
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
    public boolean insert(String name, String time,float price)
    {
            addmovie addmovie = new addmovie();
        String result ="";
        boolean  sent = false;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/movie","deh","bedrock");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(" select name from movie where name='"+name+"';");
            while(rs.next())
                result =rs.getString(1);
            System.out.println(result);
            if(result.isEmpty()){
                sent= stmt.execute("insert into movie (\n" +
                        "    name,\n" +
                        "    price,\n" +
                        "    `time`)\n" +
                        "values (\n" +
                        "    '"+name+"',\n" +
                        "    '"+time+"',\n" +
                        "    '"+price+"')\n" +
                        ";");
                sent=true;

            }else {
                sent=false;

            }
            con.close();
        }
        catch (SQLException | ClassNotFoundException throwable) {
            System.out.println(throwable);
            JOptionPane.showMessageDialog(addmovie.addMovie,"Failed");
        }
        return sent;
    }

}
