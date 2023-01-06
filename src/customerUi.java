import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class customerUi {
    JFrame customer = new JFrame("WORLD DESTINY");
    JLabel title = new JLabel("Select Movie");
    JLabel time = new JLabel("Time");
    JLabel dbTime1 = new JLabel("");
    JLabel dbTime2 = new JLabel("");
    JLabel dbTime3 = new JLabel("");
    JLabel dbTime4 = new JLabel("");
    JLabel dbTime5 = new JLabel("");
    JLabel dbTime6 = new JLabel("");

    JLabel movieName = new JLabel("Name");
    JLabel dbName1 = new JLabel("");
    JLabel dbName2 = new JLabel("");
    JLabel dbName3 = new JLabel("");
    JLabel dbName4 = new JLabel("");
    JLabel dbName5 = new JLabel("");
    JLabel dbName6 = new JLabel("");


    JLabel price = new JLabel("Price");
    JLabel dbPrice1 = new JLabel();
    JLabel dbPrice2 = new JLabel();
    JLabel dbPrice3 = new JLabel();
    JLabel dbPrice4 = new JLabel();
    JLabel dbPrice5 = new JLabel();
    JLabel dbPrice6 = new JLabel();





    JCheckBox select1 = new JCheckBox();
    JCheckBox select2 = new JCheckBox();
    JCheckBox select3 = new JCheckBox();
    JCheckBox select4 = new JCheckBox();
    JCheckBox select5 = new JCheckBox();
    JCheckBox select6  = new JCheckBox();

    JButton reset = new JButton("Reset");
    JButton next = new JButton("Next");

database_control databaseControl= new database_control();
    public void createCustomer(){
        customer.setVisible(true);
        customer.setResizable(true);
        customer.setSize(700,430);
        customer.setLayout(null);
        //customer.setBackground(RED);
        customer.setBounds(300,200,700,430);
        title.setBounds(150,10,300,30);
        title.setFont(new Font("ITALIC",12,38));
        customer.add(title);

        time.setFont(new Font("ITALIC",12,18));
        time.setBounds(50,80,50,30);
        customer.add(time);
        movieName.setBounds(200,80,100,30);
        movieName.setFont(new Font("ITALIC",12,18));
        customer.add(movieName);
        price.setBounds(500,80,70,30);
        price.setFont(new Font("ITALIC",12,18));
        customer.add(price);


        select1.setBounds(660,120,100,30);
        select1.setFont(new Font("ITALIC",12,18));
        customer.add(select1);
        select1.setVisible(true);
        select2.setBounds(660,150,100,30);
        select2.setFont(new Font("ITALIC",12,18));
        customer.add(select2);
        select2.setVisible(true);
        select3.setBounds(660,180,100,30);
        select3.setFont(new Font("ITALIC",12,18));
        select3.setVisible(true);
        customer.add(select3);
        select4.setBounds(660,210,100,30);
        select4.setFont(new Font("ITALIC",12,18));
        customer.add(select4);
        select4.setVisible(true);
        select5.setBounds(660,240,100,30);
        select5.setFont(new Font("ITALIC",12,18));
        customer.add(select5);
        select5.setVisible(true);
        select6.setBounds(660,270,100,30);
        select6.setFont(new Font("ITALIC",12,18));
        customer.add(select6);
        select6.setVisible(true);


        dbTime1.setBounds(0,120,100,30);
        dbTime1.setFont(new Font("ITALIC",12,18));
        customer.add(dbTime1);
        dbTime1.setVisible(true);
        dbTime2.setBounds(0,150,100,30);
        dbTime2.setFont(new Font("ITALIC",12,18));
        customer.add(dbTime2);
        dbTime2.setVisible(true);
        dbTime3.setBounds(0,180,100,30);
        dbTime3.setFont(new Font("ITALIC",12,18));
        customer.add(dbTime3);
        dbTime3.setVisible(true);
        dbTime4.setBounds(0,210,100,30);
        dbTime4.setFont(new Font("ITALIC",12,18));
        customer.add(dbTime4);
        dbTime4.setVisible(true);
        dbTime5.setBounds(0,250,100,30);
        dbTime5.setFont(new Font("ITALIC",12,18));
        customer.add(dbTime5);
        dbTime5.setVisible(true);
        dbTime6.setBounds(0,280,100,30);
        dbTime6.setFont(new Font("ITALIC",12,18));
        customer.add(dbTime6);
        dbTime6.setVisible(true);


        dbName1.setBounds(180,120,350,30);
        dbName1.setFont(new Font("ITALIC",12,18));
        customer.add(dbName1);
        dbName1.setVisible(true);
        dbName2.setBounds(180,150,350,30);
        dbName2.setFont(new Font("ITALIC",12,18));
        customer.add(dbName2);
        dbName2.setVisible(true);
        dbName3.setBounds(180,180,350,30);
        dbName3.setFont(new Font("ITALIC",12,18));
        customer.add(dbName3);
        dbName3.setVisible(true);
        dbName4.setBounds(180,210,350,30);
        dbName4.setFont(new Font("ITALIC",12,18));
        customer.add(dbName4);
        dbName4.setVisible(true);
        dbName5.setBounds(180,240,350,30);
        dbName5.setFont(new Font("ITALIC",12,18));
        customer.add(dbName5);
        dbName5.setVisible(true);
        dbName6.setBounds(180,270,350,30);
        dbName6.setFont(new Font("ITALIC",12,18));
        customer.add(dbName6);
        dbName6.setVisible(true);


        dbPrice1.setBounds(500,120,50,30);
        dbPrice1.setFont(new Font("ITALIC",12,18));
        customer.add(dbPrice1);
        dbPrice1.setVisible(true);
        dbPrice2.setBounds(500,150,50,30);
        dbPrice2.setFont(new Font("ITALIC",12,18));
        customer.add(dbPrice2);
        dbPrice2.setVisible(true);
        dbPrice3.setBounds(500,180,50,30);
        dbPrice3.setFont(new Font("ITALIC",12,18));
        customer.add(dbPrice3);
        dbPrice3.setVisible(true);
        dbPrice4.setBounds(500,210,50,30);
        dbPrice4.setFont(new Font("ITALIC",12,18));
        customer.add(dbPrice4);
        dbPrice4.setVisible(true);
        dbPrice5.setBounds(500,240,50,30);
        dbPrice5.setFont(new Font("ITALIC",12,18));
        customer.add(dbPrice5);
        dbPrice5.setVisible(true);
        dbPrice6.setBounds(500,270,50,30);
        dbPrice6.setFont(new Font("ITALIC",12,18));
        customer.add(dbPrice6);
        dbPrice6.setVisible(true);

        reset.setBackground(Color.GRAY);
        reset.setBounds(50,350,100,20);
        customer.add(reset);

        next.setBackground(Color.GRAY);
        next.setBounds(400,350,70,20);
        customer.add(next);
        display();

next.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        Float price = handleCheckbox(select1,select2,select3,select4,select5,select6);

    }
});
        
    }
    public  void  display(){
        database_control database_control = new database_control();
        int length = database_control.nameCount();
        int time_length = database_control.nameCount();
        int price_length = database_control.nameCount();
        String [] move = new String[length];
        String [] time = new String[length];
        String [] price = new String[length];
        for (int i =0;i<length;i++)
        {
            move[i]= database_control.names().get(i);
            time[i]= database_control.times().get(i);
            price[i]= database_control.prices().get(i);

        }
        if(length==1)
        {
            dbName1.setText(move[0]);
            dbTime1.setText(time[1]);
        }
        else if(length==2)
        {
            dbName1.setText(move[0]);
            dbName2.setText(move[1]);
            dbTime1.setText(time[0]);
            dbTime2.setText(time[1]);
        }
        else if(length==3)
        {
            dbName1.setText(move[0]);
            dbName2.setText(move[1]);
            dbName3.setText(move[2]);
        }
        else if(length==4)
        {
            dbName1.setText(move[0]);
            dbName2.setText(move[1]);
            dbName3.setText(move[2]);
            dbName4.setText(move[3]);

        }
        else if(length==5)
        {
            dbName1.setText(move[0]);
            dbName2.setText(move[1]);
            dbName3.setText(move[2]);
            dbName4.setText(move[3]);
            dbName5.setText(move[4]);
        }
        else {
            dbName1.setText(move[0]);
            dbName2.setText(move[1]);
            dbName3.setText(move[2]);
            dbName4.setText(move[3]);
            dbName5.setText(move[4]);
            dbName6.setText(move[5]);
        }

        //tried to put both in same if else block,failed to work

        if(time_length==1)
        {
            dbTime1.setText(time[1]);
        }
        else if(time_length==2)
        {

            dbTime1.setText(time[0]);
            dbTime2.setText(time[1]);
        }
        else if(time_length==3)
        {
            dbTime1.setText(time[0]);
            dbTime2.setText(time[1]);
            dbTime3.setText(time[2]);
        }
        else if(time_length==4)
            {
                dbTime1.setText(time[0]);
                dbTime2.setText(time[1]);
                dbTime3.setText(time[2]);
                dbTime4.setText(time[3]);

            }
            else if(time_length==5)
            {
                dbTime1.setText(time[0]);
                dbTime2.setText(time[1]);
                dbTime3.setText(time[2]);
                dbTime4.setText(time[3]);
                dbTime5.setText(time[4]);
            }
            else {
                dbTime1.setText(time[0]);
                dbTime2.setText(time[1]);
                dbTime3.setText(time[2]);
                dbTime4.setText(time[3]);
                dbTime5.setText(time[4]);
                dbTime6.setText(time[4]);
            }
//doing for price
        if(price_length==1)
        {
            dbPrice1.setText(price[1]);
        }
                 else if(price_length ==2)
                {

                    dbPrice1.setText(price[0]);
                    dbPrice2.setText(price[1]);
                }
                else if(price_length ==3)
                {
                    dbPrice1.setText(price[0]);
                    dbPrice2.setText(price[1]);
                    dbPrice3.setText(price[2]);
                }
                else if(price_length ==4)
                {
                    dbPrice1.setText(price[0]);
                    dbPrice2.setText(price[1]);
                    dbPrice3.setText(price[2]);
                    dbPrice4.setText(price[3]);

                }
                else if(price_length ==5)
                {
                    dbPrice1.setText(price[0]);
                    dbPrice2.setText(price[1]);
                    dbPrice3.setText(price[2]);
                    dbPrice4.setText(price[3]);
                    dbPrice5.setText(price[4]);
                }
                else {
                    dbPrice1.setText(price[0]);
                    dbPrice2.setText(price[1]);
                    dbPrice3.setText(price[2]);
                    dbPrice4.setText(price[3]);
                    dbPrice5.setText(price[4]);
                    dbPrice6.setText(price[4]);
                }
        }
    public float handleCheckbox(JCheckBox box1, JCheckBox box2,
                                JCheckBox box3, JCheckBox box4,
                                JCheckBox box5, JCheckBox box6)
    {
            float totalPrice = 0;
            if (box1.isSelected()){
                float price = Float.parseFloat(dbPrice1.getText());
                totalPrice =totalPrice+price;
            }
            if (box2.isSelected()){
                float price = Float.parseFloat(dbPrice2.getText());
                totalPrice =totalPrice+price;

            }
            if (box3.isSelected()){
                float price = Float.parseFloat(dbPrice3.getText());
                totalPrice =totalPrice+price;

            }
            if (box4.isSelected()){
                float price = Float.parseFloat(dbPrice4.getText());
                totalPrice =totalPrice+price;

            }
            if (box5.isSelected()){
                float price = Float.parseFloat(dbPrice5.getText());
                totalPrice =totalPrice+price;

            }
            if (box6.isSelected()){
                float price = Float.parseFloat(dbPrice6.getText());
                totalPrice =totalPrice+price;

            }
            return totalPrice;
    }
}



