import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class addmovie {
    JFrame addMovie = new JFrame("Add Movie");
    JPanel panel = new JPanel();
    JPanel Panel = new JPanel();

    JLabel name = new JLabel("Name");
    JTextField Name = new JTextField("Title");

    JLabel time = new JLabel("Time");
    JTextField Time = new JTextField("00:00");

    JLabel price = new JLabel("Price");
    JTextField Price = new JTextField("00.00");

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
    JButton update2 = new JButton("Refresh");
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

    database_control database_control = new database_control();


    public void createMovie()
    {
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
    updatePanel.setVisible(true);
    addMovie.add(updatePanel);

    updateName.setBounds(0,0,70,30);
    updatePanel.add(updateName);
        update_name.setBounds(10,30,300,30);
        updatePanel.add(update_name);
        update_name.setVisible(false);
        updatePrice.setBounds(350,0,70,30);
        updatePanel.add(updatePrice);
        update_price.setBounds(350,30,100,30);
        update_price.setVisible(false);
        updatePanel.add(update_price);

        updateTime.setBounds(500,0,70,30);
        updatePanel.add(updateTime);
        update_time.setBounds(500,30,100,30);
        updatePanel.add(update_time);
        update_time.setVisible(false);

        updateUpdate.setBackground(Color.GRAY);
        updateUpdate.setBounds(620,25,100,20);
        updatePanel.add(updateUpdate);
        updateUpdate.setVisible(false);
displayNames();
        ch1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(ch1.isSelected())
                {
                    boolean enabled = false;
                    boolean b = enabled;
                    ch2.setEnabled(b);
                    ch3.setEnabled(b);
                    ch4.setEnabled(b);
                    ch5.setEnabled(b);
                    ch6.setEnabled(b);

                }
                else
                {

                    boolean b = true;
                    ch2.setEnabled(b);
                    ch3.setEnabled(b);
                    ch4.setEnabled(b);
                    ch5.setEnabled(b);
                    ch6.setEnabled(b);

                    String text="";
                    update_name.setText(text);
                    update_price.setText(text);
                    update_time.setText(text);
                }
            }
        });
        ch2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(ch2.isSelected())
                {
                    boolean b = false;
                    ch1.setEnabled(b);
                    ch3.setEnabled(b);
                    ch4.setEnabled(b);
                    ch5.setEnabled(b);
                    ch6.setEnabled(b);
                }
                else
                {
                    boolean b = true;
                    ch1.setEnabled(b);
                    ch3.setEnabled(b);
                    ch4.setEnabled(b);
                    ch5.setEnabled(b);
                    ch6.setEnabled(b);

                    String text="";
                    update_name.setText(text);
                    update_price.setText(text);
                    update_time.setText(text);
                }
            }
        });
        ch3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(ch3.isSelected())
                {
                    boolean b = false;
                    ch1.setEnabled(b);
                    ch2.setEnabled(b);
                    ch4.setEnabled(b);
                    ch5.setEnabled(b);
                    ch6.setEnabled(b);
                }
                else
                {
                    boolean b = true;
                    ch1.setEnabled(b);
                    ch2.setEnabled(b);
                    ch4.setEnabled(b);
                    ch5.setEnabled(b);
                    ch6.setEnabled(b);

                    String text="";
                    update_name.setText(text);
                    update_price.setText(text);
                    update_time.setText(text);
                }
            }
        });
        ch4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(ch4.isSelected())
                {
                    boolean b = false;
                    ch1.setEnabled(b);
                    ch2.setEnabled(b);
                    ch3.setEnabled(b);
                    ch5.setEnabled(b);
                    ch6.setEnabled(b);
                }
                else
                {
                    boolean b = true;
                    ch1.setEnabled(b);
                    ch2.setEnabled(b);
                    ch3.setEnabled(b);
                    ch5.setEnabled(b);
                    ch6.setEnabled(b);

                    String text="";
                    update_name.setText(text);
                    update_price.setText(text);
                    update_time.setText(text);
                }
            }
        });
        ch5.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(ch5.isSelected())
                {
                    boolean b = false;
                    ch1.setEnabled(b);
                    ch2.setEnabled(b);
                    ch3.setEnabled(b);
                    ch4.setEnabled(b);
                    ch6.setEnabled(b);
                }
                else
                {
                    boolean b = true;
                    ch1.setEnabled(b);
                    ch2.setEnabled(b);
                    ch3.setEnabled(b);
                    ch4.setEnabled(b);
                    ch6.setEnabled(b);

                    String text="";
                    update_name.setText(text);
                    update_price.setText(text);
                    update_time.setText(text);
                }
            }
        });
        ch6.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(ch6.isSelected())
                {
                    boolean b = false;
                    ch1.setEnabled(b);
                    ch2.setEnabled(b);
                    ch3.setEnabled(b);
                    ch5.setEnabled(b);
                    ch4.setEnabled(b);
                }
                else
                {
                    boolean b = true;
                    ch1.setEnabled(b);
                    ch2.setEnabled(b);
                    ch3.setEnabled(b);
                    ch5.setEnabled(b);
                    ch4.setEnabled(b);

                    String text="";
                    update_name.setText(text);
                    update_price.setText(text);
                    update_time.setText(text);
                }
            }
        });
delete.addActionListener(new ActionListener()
{
            @Override
            public void actionPerformed(ActionEvent e)
            {
                boolean deleted;
                deleted= database_control.delete(deleteCheckbox());

                if (!deleted)
                {
                    JOptionPane.showMessageDialog(addMovie, "Failed");
                }else
                {
                    displayNames();
                }
            }
        });
update1.addActionListener(new ActionListener()
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        update_time.setVisible(true);
        update_name.setVisible(true);
        update_price.setVisible(true);
        updateUpdate.setVisible(true);

        String[] data;
        data= selectedCheckbox();
        update_name.setText(data[0]);
        update_price.setText(data[1]);
        update_time.setText(data[2]);

    }
});
update2.addActionListener(new ActionListener()
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        displayNames();
    }
});
insert.addActionListener(new ActionListener()
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String name=Name.getText();
        String time =Time.getText();
        String price =Price.getText();

        if (name.isEmpty()||time.isEmpty()||price.isEmpty())
        {
            if (name.isEmpty())
            {
                JOptionPane.showMessageDialog(addMovie,"Fill Name");
            }
            if (time.isEmpty())
            {
                JOptionPane.showMessageDialog(addMovie,"Fill Time");

            }
            if (price.isEmpty())
            {
                JOptionPane.showMessageDialog(addMovie,"Fill Price");

            }
            }
        else if (name.contains("Title"))
        {
            JOptionPane.showMessageDialog(addMovie,"Fill in Title");

        }
        else if (time.contains("00:00"))
        {
            JOptionPane.showMessageDialog(addMovie,"Fill in Time");

        }
        else if (price.contains("00.00"))
        {
                JOptionPane.showMessageDialog(addMovie,"Fill Price");

        }
        else
        {
            boolean pr = false;
            float newPrice = 0;
            try
            {
                newPrice = Float.parseFloat(price);
                if(newPrice == Integer.parseInt(price))
                {
                    pr=true;
                }
            }
            catch (NumberFormatException exception)
            {
                JOptionPane.showMessageDialog(addMovie, "Invalid price");
            }



            if(pr)
            {
                int length= database_control.nameCount();
                if(length<7)
                {

                        if (database_control.insert(name, time, String.valueOf(newPrice)))
                        {
                            displayNames();
                            customerUi customerUi = new customerUi();
                            customerUi.redirectDisplay();

                        }
                        else
                        {
                            displayNames();
                            JOptionPane.showMessageDialog(addMovie, "Movie Name already exists  ");

                        }
                }
                else
                {
                    JOptionPane.showMessageDialog(addMovie,"Reached Max Entries");
                }
            }
        }
    }
});
updateUpdate.addActionListener(new ActionListener()
{
    @Override
    public void actionPerformed(ActionEvent e) {
        handleCheckbox();
    }
});
}

private void displayNames()
{
      database_control database_control = new database_control();
      int length = database_control.nameCount();
      String [] move = new String[length];
      for (int i =0;i<length;i++)
      {
          move[i]= database_control.names().get(i);
      }

      if(length==1)
      {
          dbName1.setText(move[0]);

      }
      else if(length==2)
      {
          dbName1.setText(move[0]);
          dbName2.setText(move[1]);
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
      else if(length>=6)
      {
          dbName1.setText(move[0]);
          dbName2.setText(move[1]);
          dbName3.setText(move[2]);
          dbName4.setText(move[3]);
          dbName5.setText(move[4]);
          dbName6.setText(move[5]);
      }
      else {
          dbName1.setText("NAN");
          dbName2.setText("NAN");
          dbName3.setText("NAN");
          dbName4.setText("NAN");
          dbName5.setText("NAN");
          dbName6.setText("NAN");
      }
}
private   void handleCheckbox(){
    String name;
    String newName;

        if(ch1.isSelected())
        {
            newName= dbName1.getText();
            name= update_name.getText();
            String price = update_price.getText();
            String time = update_time.getText();
            updater(newName,name,price,time);
        }
        else if(ch2.isSelected())
        {
            newName= dbName2.getText();
            name= update_name.getText();
            String price = update_price.getText();
            String time = update_time.getText();
            updater(newName,name,price,time);

        }
        else if(ch3.isSelected())
        {
            newName= dbName3.getText();
            name= update_name.getText();
            String price = update_price.getText();
            String time = update_time.getText();
            updater(newName,name,price,time);
        }
        else if(ch4.isSelected())
        {
            newName= dbName4.getText();
            name= update_name.getText();
            String price = update_price.getText();
            String time = update_time.getText();
            updater(newName,name,price,time);
        }
        else if(ch5.isSelected())
        {
            newName= dbName5.getText();
            name= update_name.getText();
            String price = update_price.getText();
            String time = update_time.getText();
            updater(newName,name,price,time);
        }
        else if(ch6.isSelected())
        {
            newName= dbName6.getText();
            name= update_name.getText();
            String price = update_price.getText();
            String time = update_time.getText();
            updater(newName,name,price,time);
        }
        else
        {
            JOptionPane.showMessageDialog(addMovie,"No Items Selected");
        }
}
private String deleteCheckbox()
{
    String newName = "";

        if(ch1.isSelected())
        {
            return dbName1.getText();
        }
        else if(ch2.isSelected())
        {
            return dbName2.getText();
        }
        else if(ch3.isSelected())
        {
            return dbName3.getText();
        }
        else if(ch4.isSelected())
        {
            return dbName4.getText();
        }
        else if(ch5.isSelected())
        {
            return dbName5.getText();
        }
        else if(ch6.isSelected())
        {
            return dbName6.getText();
        }
        else
        {
            JOptionPane.showMessageDialog(addMovie,"No Items Selected");
        }


    return newName;
}
private String[] selectedCheckbox()
{
    String[] out = new String[3];
    String newName;
    if(ch1.isSelected())
    {
        newName= dbName1.getText();
       out=Edit(newName);

    }
    else if(ch2.isSelected())
    {
        newName= dbName2.getText();
        out=Edit(newName);

    }
    else if(ch3.isSelected())
    {
        newName= dbName3.getText();
        out=Edit(newName);
    }
    else if(ch4.isSelected())
    {
        newName= dbName4.getText();
        out=Edit(newName);

    }
    else if(ch5.isSelected())
    {
        newName= dbName5.getText();
        out=Edit(newName);

    }
    else if(ch6.isSelected())
    {
        newName= dbName6.getText();
        out=Edit(newName);

    }
    return out;
}
private void updater(String newName,String name,String price,String time)
{
    database_control database_control = new database_control();
    if (name.isEmpty()||time.isEmpty()||price.isEmpty())
    {
        if (name.isEmpty())
        {
            JOptionPane.showMessageDialog(addMovie,"Fill Name");
        }
        if (time.isEmpty())
        {
            JOptionPane.showMessageDialog(addMovie,"Fill Time");

        }
        if (price.isEmpty())
        {
            JOptionPane.showMessageDialog(addMovie,"Fill Price");

        }
    }
    else
    {
        boolean pr = false;
        float newPrice = 0;
        try
        {
            newPrice = Float.parseFloat(price);
            if(newPrice == Integer.parseInt(price))
            {
                pr=true;
            }
        }
        catch (NumberFormatException exception)
        {
            JOptionPane.showMessageDialog(addMovie, "Invalid price");
        }



        if(pr)
        {

            if (database_control.update(newName,name, time, newPrice))
            {
                JOptionPane.showMessageDialog(addMovie, "Added");
            }
            else
            {
                JOptionPane.showMessageDialog(addMovie, "Movie Name already exists  ");

            }
        }
    }
}
private String[] Edit(String name)
{


        database_control database_control = new database_control();
        int length = 1;
        String [] move = new String[length];
        String [] price = new String[length];
        String [] time = new String[length];
            time[0]= database_control.time(name);
            move[0]= database_control.name();
            price[0]= database_control.price(name);

        String [] r = new String[3];
        r[0]=move[0];
        r[1]=price[0];
        r[2]=time[0];
        return r;

}
}
