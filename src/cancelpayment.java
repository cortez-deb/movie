import javax.swing.*;
import java.awt.*;

public class cancelpayment {
    JFrame cancelPayment = new JFrame("Cancel");
/*    JTable j;
    JCheckBox c;
    String[] columnNames ={"TRANSACTION ID","AMOUNT"};
    String[][] data = {
            {"QWERTYU","300.32"}
    };*/
    JLabel transactionID = new JLabel("TRANSACTION ID");
    JLabel transaction = new JLabel("QWERTYUIOIHG");
    JLabel amount = new JLabel("AMOUNT");
    JLabel Amount = new JLabel("234.45");
    JButton cancel= new  JButton("Cancel");
    JButton next = new JButton("Proceed");


public void createCancel(){
    cancelPayment.setBounds(300,250,350,150);
    cancelPayment.setLayout(null);
    cancelPayment.setResizable(false);
    cancelPayment.setVisible(true);
    amount.setBounds(250,20,90,30);
    Amount.setBounds(250,50,90,30);
    transactionID.setBounds(10,20,200,30);
    transaction.setBounds(10,50,200,30);
    cancelPayment.add(amount);
    cancelPayment.add(transactionID);
    cancel.setBounds(20,90,100,20);
    cancel.setBackground(Color.gray);
    cancelPayment.add(cancel);

    next.setBackground(Color.GRAY);
    next.setBounds(250,90,100,20);
    cancelPayment.add(next);
    cancelPayment.add(Amount);
    cancelPayment.add(transaction);
 /*   j = new JTable(data,columnNames);
    j.setBounds(50,20,50,30);
    j.doLayout();
    j.updateUI();
    JScrollPane scrollPane = new JScrollPane(j);
    cancelPayment.add(scrollPane);


*/
}
}
