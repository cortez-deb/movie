import javax.swing.*;
import java.awt.*;

import static java.awt.Color.RED;

public class customerUi {
    JFrame customer = new JFrame("WORLD DESTINY");
    JLabel title = new JLabel("Select Movie");
    JLabel time = new JLabel("Time");
    JLabel dbTime1 = new JLabel("T1");
    JLabel dbTime2 = new JLabel("T2");
    JLabel dbTime3 = new JLabel("T3");
    JLabel dbTime4 = new JLabel("T4");
    JLabel dbTime5 = new JLabel("T5");
    JLabel dbTime6 = new JLabel("T6");

    JLabel movieName = new JLabel("Name");
    JLabel dbName1 = new JLabel("N1  Name Name Name");
    JLabel dbName2 = new JLabel("N2  Name Name Name");
    JLabel dbName3 = new JLabel("N3  Name Name Name");
    JLabel dbName4 = new JLabel("N4  Name Name Name");
    JLabel dbName5 = new JLabel("N5  Name Name Name");
    JLabel dbName6 = new JLabel("N6  Name Name Name");


    JLabel price = new JLabel("Price");
    JLabel dbPrice1 = new JLabel("30:00");
    JLabel dbPrice2 = new JLabel("30:00");
    JLabel dbPrice3 = new JLabel("30:00");
    JLabel dbPrice4 = new JLabel("30:00");
    JLabel dbPrice5 = new JLabel("30:00");
    JLabel dbPrice6 = new JLabel("30:00");





    JCheckBox select1 = new JCheckBox();
    JCheckBox select2 = new JCheckBox();
    JCheckBox select3 = new JCheckBox();
    JCheckBox select4 = new JCheckBox();
    JCheckBox select5 = new JCheckBox();
    JCheckBox select6  = new JCheckBox();

    JButton reset = new JButton("Reset");
    JButton next = new JButton("Next");


    public void createCustomer(){
        customer.setVisible(true);
        customer.setResizable(false);
        customer.setSize(500,430);
        customer.setLayout(null);
        //customer.setBackground(RED);
        customer.setBounds(300,200,550,430);
        title.setBounds(150,10,300,30);
        title.setFont(new Font("ITALIC",12,38));
        customer.add(title);

        time.setFont(new Font("ITALIC",12,18));
        time.setBounds(50,80,50,30);
        customer.add(time);
        movieName.setBounds(200,80,100,30);
        movieName.setFont(new Font("ITALIC",12,18));
        customer.add(movieName);
        price.setBounds(400,80,70,30);
        price.setFont(new Font("ITALIC",12,18));
        customer.add(price);


        select1.setBounds(460,120,100,30);
        select1.setFont(new Font("ITALIC",12,18));
        customer.add(select1);
        select1.setVisible(false);
        select2.setBounds(460,150,100,30);
        select2.setFont(new Font("ITALIC",12,18));
        customer.add(select2);
        select2.setVisible(false);
        select3.setBounds(460,180,100,30);
        select3.setFont(new Font("ITALIC",12,18));
        select3.setVisible(false);
        customer.add(select3);
        select4.setBounds(460,210,100,30);
        select4.setFont(new Font("ITALIC",12,18));
        customer.add(select4);
        select4.setVisible(false);
        select5.setBounds(460,240,100,30);
        select5.setFont(new Font("ITALIC",12,18));
        customer.add(select5);
        select5.setVisible(false);
        select6.setBounds(460,270,100,30);
        select6.setFont(new Font("ITALIC",12,18));
        customer.add(select6);
        select6.setVisible(false);


        dbTime1.setBounds(50,120,50,30);
        dbTime1.setFont(new Font("ITALIC",12,18));
        customer.add(dbTime1);
        dbTime1.setVisible(false);
        dbTime2.setBounds(50,150,50,30);
        dbTime2.setFont(new Font("ITALIC",12,18));
        customer.add(dbTime2);
        dbTime2.setVisible(false);
        dbTime3.setBounds(50,180,50,30);
        dbTime3.setFont(new Font("ITALIC",12,18));
        customer.add(dbTime3);
        dbTime3.setVisible(false);
        dbTime4.setBounds(50,210,50,30);
        dbTime4.setFont(new Font("ITALIC",12,18));
        customer.add(dbTime4);
        dbTime4.setVisible(false);
        dbTime5.setBounds(50,250,50,30);
        dbTime5.setFont(new Font("ITALIC",12,18));
        customer.add(dbTime5);
        dbTime5.setVisible(false);
        dbTime6.setBounds(50,280,50,30);
        dbTime6.setFont(new Font("ITALIC",12,18));
        customer.add(dbTime6);
        dbTime6.setVisible(false);


        dbName1.setBounds(145,120,250,30);
        dbName1.setFont(new Font("ITALIC",12,18));
        customer.add(dbName1);
        dbName1.setVisible(false);
        dbName2.setBounds(145,150,250,30);
        dbName2.setFont(new Font("ITALIC",12,18));
        customer.add(dbName2);
        dbName2.setVisible(false);
        dbName3.setBounds(145,180,250,30);
        dbName3.setFont(new Font("ITALIC",12,18));
        customer.add(dbName3);
        dbName3.setVisible(false);
        dbName4.setBounds(145,210,250,30);
        dbName4.setFont(new Font("ITALIC",12,18));
        customer.add(dbName4);
        dbName4.setVisible(false);
        dbName5.setBounds(145,240,250,30);
        dbName5.setFont(new Font("ITALIC",12,18));
        customer.add(dbName5);
        dbName5.setVisible(false);
        dbName6.setBounds(145,270,250,30);
        dbName6.setFont(new Font("ITALIC",12,18));
        customer.add(dbName6);
        dbName6.setVisible(false);


        dbPrice1.setBounds(400,120,50,30);
        dbPrice1.setFont(new Font("ITALIC",12,18));
        customer.add(dbPrice1);
        dbPrice1.setVisible(false);
        dbPrice2.setBounds(400,150,50,30);
        dbPrice2.setFont(new Font("ITALIC",12,18));
        customer.add(dbPrice2);
        dbPrice2.setVisible(false);
        dbPrice3.setBounds(400,180,50,30);
        dbPrice3.setFont(new Font("ITALIC",12,18));
        customer.add(dbPrice3);
        dbPrice3.setVisible(false);
        dbPrice4.setBounds(400,210,50,30);
        dbPrice4.setFont(new Font("ITALIC",12,18));
        customer.add(dbPrice4);
        dbPrice4.setVisible(false);
        dbPrice5.setBounds(400,240,50,30);
        dbPrice5.setFont(new Font("ITALIC",12,18));
        customer.add(dbPrice5);
        dbPrice5.setVisible(false);
        dbPrice6.setBounds(400,270,50,30);
        dbPrice6.setFont(new Font("ITALIC",12,18));
        customer.add(dbPrice6);
        dbPrice6.setVisible(false);

        reset.setBackground(Color.GRAY);
        reset.setBounds(50,350,100,20);
        customer.add(reset);

        next.setBackground(Color.GRAY);
        next.setBounds(400,350,70,20);
        customer.add(next);
    }
}
