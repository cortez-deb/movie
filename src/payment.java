import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import java.util.Properties;

public class payment {
    JFrame payment = new JFrame("Add new card");


    JLabel cardNumber = new JLabel("CARD NO:");
    JTextField cardNO = new JTextField("4349|0000 0000 0000");
    JLabel expiryDate = new JLabel("Expiry date");
    Properties properties = new Properties();
    JFormattedTextField.AbstractFormatter d = new JFormattedTextField.AbstractFormatter() {
        @Override
        public Object stringToValue(String text) throws ParseException {
            return null;
        }

        @Override
        public String valueToString(Object value) throws ParseException {
            return null;
        }
    };

    UtilDateModel model = new UtilDateModel();
    JDatePanelImpl datePanel = new JDatePanelImpl(model,properties);
    JDatePickerImpl jDatePicker = new JDatePickerImpl(datePanel,d);
    JLabel cvc =new JLabel("CVV/CVC");
    JTextField cvv = new JTextField("~~~~");

    JLabel cardHolder = new JLabel("Card Holder's Name:");
    JTextField holderName = new JTextField("First and Last Names");

JRadioButton saveCard = new JRadioButton("Save card");
JButton addCard = new JButton("Add Card");


public  void createPayment(){

    payment.setLayout(null);
    payment.setFont(new Font("ITALIC",7,18));
    payment.setBackground(Color.LIGHT_GRAY);
    payment.setSize(500,300);
    payment.setVisible(true);
    payment.setResizable(false);
    payment.setBounds(200,200,400,260);


    cardNumber.setBounds(10,20,70,30);
    cardNO.setBounds(80,20,150,30);
    expiryDate.setBounds(10,60,100,30);
    datePanel.setBounds(0,85,210,30);
    datePanel.setBackground(Color.lightGray);
    cvc.setBounds(310,50,70,30);
    cvv.setBounds(310,70,50,25);
    cardHolder.setBounds(10,120,150,30);
    holderName.setBounds(170,120,200,30);
    saveCard.setBounds(10,180,100,25);
    addCard.setBounds(250,180,100,25);
    saveCard.setBackground(Color.GRAY);
    addCard.setBackground(Color.GRAY);

    payment.add(cvc);
    payment.add(expiryDate);
    payment.add(datePanel);
    payment.add(cardNumber);
    payment.add(cardNO);
    payment.add(cvv);
    payment.add(cardHolder);
    payment.add(holderName);
    payment.add(saveCard);
    payment.add(addCard);

}

}
