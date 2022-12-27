import javax.swing.*;
import java.awt.*;
import java.util.jar.JarEntry;

public class addmovie {
    JFrame addMovie = new JFrame("Add Movie");
    JPanel panel = new JPanel();
    JPanel Panel = new JPanel();

    JLabel name = new JLabel("Name");
    JTextField Name = new JTextField("Title");

    JLabel time = new JLabel("Time");
    JTextField Time = new JTextField("HR:MIN");

    JLabel price = new JLabel("price");
    JTextField Price = new JTextField("Ksh");

    JButton insert = new JButton("Insert");

    JLabel movieName = new JLabel("Name");
    JLabel dbName1 = new JLabel("");
    JLabel dbName2 = new JLabel("");
    JLabel dbName3 = new JLabel("");
    JLabel dbName4 = new JLabel("");
    JLabel dbName5 = new JLabel("");
    JLabel dbName6 = new JLabel("");
    JCheckBox ch1 =new JCheckBox();
    JCheckBox ch2 =new JCheckBox();
    JCheckBox ch3 =new JCheckBox();
    JCheckBox ch4 =new JCheckBox();
    JCheckBox ch5 =new JCheckBox();
    JCheckBox ch6 =new JCheckBox();
    JButton delete = new JButton("Delete");
    JButton update1 = new JButton("Edit");
    JButton update2 = new JButton("Edit");
    JButton update3 = new JButton("Edit");
    JButton update4 = new JButton("Edit");
    JButton update5 = new JButton("Edit");
    JButton update6 = new JButton("Edit");

    JPanel updatePanel = new JPanel();
    JLabel updateName = new JLabel("Name");
    JTextField update_name = new JTextField("");
     JLabel updatePrice = new JLabel("Price");
     JTextField update_price = new JTextField();

     JLabel updateTime = new JLabel("Time");
     JTextField update_time = new JTextField("");

     JButton updateUpdate = new JButton("Update");



    public void createMovie(){
    addMovie.setBounds(200,200,800,500);

    addMovie.setBackground(Color.GRAY);
    addMovie.setResizable(false);
    addMovie.setLayout(null);
    addMovie.setVisible(true);

    panel.setBounds(0,0,400,250);
    panel.setBackground(Color.GRAY);
    addMovie.add(panel);
    panel.setLayout(null);

    Panel.setBounds(400,0,400,250);
    Panel.setBackground(Color.GRAY);
    addMovie.add(Panel);
    Panel.setLayout(null);


    name.setBounds(0,10,70,30);
    Name.setBounds(10,40,300,30);
    panel.add(name);
    panel.add(Name);

    time.setBounds(0,70,50,30);
    Time.setBounds(10,100,70,30);
    panel.add(time);
    panel.add(Time);

    price.setBounds(0,130,70,30);
    Price.setBounds(10,160,100,30);
    panel.add(price);
    panel.add(Price);

    insert.setBounds(20,200,100,20);
    insert.setBackground(Color.GRAY);
    panel.add(insert);

        movieName.setBounds(0,0,100,30);
        Panel.add(movieName);
        dbName1.setBounds(10,20,250,30);
        ch1.setBackground(Color.GRAY);
        ch1.setBounds(280,20,20,20);
        update1.setBounds(300,20,100,20);
        update1.setBackground(Color.GRAY);
        dbName1.setFont(new Font("ITALIC",12,18));
        Panel.add(dbName1);
        Panel.add(ch1);
        Panel.add(update1);
        dbName1.setVisible(true);


        dbName2.setBounds(10,50,250,30);
        ch2.setBackground(Color.GRAY);
        ch2.setBounds(280,50,20,20);
        update2.setBounds(300,50,100,20);
        update2.setBackground(Color.GRAY);
        dbName2.setFont(new Font("ITALIC",12,18));
        Panel.add(dbName2);
        Panel.add(ch2);
        Panel.add(update2);



        dbName3.setBounds(10,80,250,30);
        ch3.setBackground(Color.GRAY);
        ch3.setBounds(280,80,20,20);
        dbName3.setFont(new Font("ITALIC",12,18));
        update3.setBounds(300,80,100,20);
        update3.setBackground(Color.GRAY);
        Panel.add(dbName3);
        Panel.add(ch3);
        Panel.add(update3);
        dbName3.setVisible(true);


        dbName4.setBounds(10,110,250,30);
        ch4.setBackground(Color.GRAY);
        ch4.setBounds(280,110,20,20);
        dbName4.setFont(new Font("ITALIC",12,18));
        update4.setBounds(300,110,100,20);
        update4.setBackground(Color.GRAY);
        Panel.add(dbName4);
        Panel.add(ch4);
        Panel.add(update4);
        dbName4.setVisible(true);


        dbName5.setBounds(10,140,250,30);
        ch5.setBounds(280,140,20,20);
        ch5.setBackground(Color.GRAY);
        dbName5.setFont(new Font("ITALIC",12,18));
        update5.setBounds(300,140,100,20);
        update5.setBackground(Color.GRAY);
        Panel.add(dbName5);
        Panel.add(ch5);
        Panel.add(update5);
        dbName5.setVisible(true);


        dbName6.setBounds(10,170,250,30);
        ch6.setBounds(280,170,20,20);
        ch6.setBackground(Color.GRAY);
        dbName6.setFont(new Font("ITALIC",12,18));
        update6.setBounds(300,170,100,20);
        update6.setBackground(Color.GRAY);
        Panel.add(dbName6);
        Panel.add(ch6);
        Panel.add(update6);
        dbName6.setVisible(true);

        delete.setBackground(Color.GRAY);
        delete.setBounds(300,200,100,20);
        Panel.add(delete);

    updatePanel.setBounds(0,250,800,250);
    updatePanel.setBackground(Color.GRAY);
    updatePanel.setLayout(null);
    addMovie.add(updatePanel);

    updateName.setBounds(0,0,70,30);
    updatePanel.add(updateName);
        update_name.setBounds(10,30,300,30);
        updatePanel.add(update_name);

        updatePrice.setBounds(350,0,70,30);
        updatePanel.add(updatePrice);
        update_price.setBounds(350,30,100,30);
        updatePanel.add(update_price);

        updateTime.setBounds(500,0,70,30);
        updatePanel.add(updateTime);
        update_time.setBounds(500,30,100,30);
        updatePanel.add(update_time);

        updateUpdate.setBackground(Color.GRAY);
        updateUpdate.setBounds(620,25,100,20);
        updatePanel.add(updateUpdate);



}


}
