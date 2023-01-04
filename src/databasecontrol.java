import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

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
    public ArrayList<String> names()
    {
        addmovie addmovie = new addmovie();
        ArrayList<String> names =new ArrayList<String>();
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/movie","deh","bedrock");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(" select name from movie;");
            while(rs.next()){

              name name =  new name(rs.getString("name"));
                names.add(name.getname());
            }

            con.close();
        }
        catch (SQLException | ClassNotFoundException throwable) {
            System.out.println(throwable);
            JOptionPane.showMessageDialog(addmovie.addMovie,"Error occurred");
        }

        return names;
    }

    public String name()
    {
        addmovie addmovie = new addmovie();
        String names ="";
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/movie","deh","bedrock");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(" select name from movie;");
            while(rs.next()){

              name name =  new name(rs.getString("name"));
                names=name.getname();
            }

            con.close();
        }
        catch (SQLException | ClassNotFoundException throwable) {
            System.out.println(throwable);
            JOptionPane.showMessageDialog(addmovie.addMovie,"Error occurred");
        }

        return names;
    }

    public String price(String name)
    {
        addmovie addmovie = new addmovie();
        String price ="";
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/movie","deh","bedrock");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select price from movie  where name='"+name+"' ;");
            while(rs.next()){

              name nam =  new name(rs.getString("price"));
                price=nam.getname();

            }

            con.close();
        }
        catch (SQLException | ClassNotFoundException throwable) {
            System.out.println(throwable);
            JOptionPane.showMessageDialog(addmovie.addMovie,"Price Error occurred");
        }

        return price;
    }
    public String time(String name)
    {
        addmovie addmovie = new addmovie();
        String time = "";
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/movie","deh","bedrock");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(" select time from movie where name ='"+name+"';");
            while(rs.next()){

              name nam =  new name(rs.getString("time"));
              time=nam.getname();
            }

            con.close();
        }
        catch (SQLException | ClassNotFoundException throwable) {
            System.out.println(throwable);
            JOptionPane.showMessageDialog(addmovie.addMovie,"time error occurred");
        }

        return time;
    }

    public int nameCount()
    {

        int result =0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/movie","deh","bedrock");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(" select count(name)from movie;");
            while(rs.next())
                result =rs.getInt(1);
            // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
    public boolean delete(String name)
    {
        boolean done;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/movie","deh","bedrock");
            Statement stmt=con.createStatement();
            stmt.execute("delete from movie where name='"+name+"';");
            con.close();
            done=true;
        }
        catch (SQLException | ClassNotFoundException throwable) {
            throwable.printStackTrace();
            done=false;
        }

        return done;
    }


    public boolean update(String name,String newName, String time,float price)
    {
        addmovie addmovie = new addmovie();
        boolean  sent = false;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/movie","deh","bedrock");
            Statement stmt=con.createStatement();
            stmt.execute("delete from movie where name='"+name+"';");
            sent= stmt.execute("insert into movie (\n" +
                        "    name,\n" +
                        "    price,\n" +
                        "    `time`)\n" +
                        "values (\n" +
                        "    '"+newName+"',\n" +
                        "    '"+time+"',\n" +
                        "    '"+price+"')\n" +
                        ";");
            con.close();
        }
        catch (SQLException | ClassNotFoundException throwable) {
            System.out.println(throwable);
            JOptionPane.showMessageDialog(addmovie.addMovie,"Failed");
        }
        return sent;
    }


}
