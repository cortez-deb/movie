import java.sql.*;

public class databasecontrol {
    String host = "localhost";
    String user = "deh";
    String pass="bedrock";
    String db = "movie";
    int port= 3306;
    public int adminlogin(String user,String pass)
    {

        int result =0;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://"+host+":"+port+"/"+db+"",""+user+"",""+pass+"");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select password from adminlogin where userID="+user+";");
            while(rs.next())
                result =rs.getInt(1);
            con.close();
        }
        catch (SQLException | ClassNotFoundException throwable) {
            throwable.printStackTrace();
        }
        return result;
    }

}
