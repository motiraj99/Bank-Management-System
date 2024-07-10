package bank.management.system;

import com.mysql.cj.protocol.Resultset;

import javax.imageio.plugins.jpeg.JPEGImageWriteParam;
import javax.swing.*;// for JFrame
import java.awt.*;//Image class
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JButton login, clear, signup;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login(){

        setTitle("Automated Teller Machine");

        setLayout(null);//is border layout by default, so set null

        //Icon setting
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);

        //Label: Welcome to ATM
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Oswald", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);

        //Card No
        JLabel cardno = new JLabel("Card no:");
        cardno.setFont(new Font("Railway", Font.BOLD, 28));
        cardno.setBounds(120, 150, 150, 30);
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setFont(new Font("Ariel", Font.BOLD, 14));
        add(cardTextField);

        //PIN
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Oswald", Font.BOLD, 28));
        pin.setBounds(120, 220, 250, 30);
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 230, 30);
        pinTextField.setFont(new Font("Ariel", Font.BOLD, 14));
        add(pinTextField);

        //SignIn button
        login = new JButton("SIGN IN");
        login.setBounds(300,300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        //Clear button
        clear = new JButton("CLEAR");
        clear.setBounds(430,300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        //SignUp button
        signup = new JButton("SIGN UP");
        signup.setBounds(300,350, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);

        getContentPane().setBackground(Color.WHITE);
        setSize(800,480);
        setVisible(true);
        setLocation(350, 200);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");

        } else if (ae.getSource() == login){
            Conn conn = new Conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "select * from login where cardnumber = '" + cardnumber +"' and pin = '" + pinnumber +"'";
            try{
                ResultSet rs = conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                } else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card number or PIN");
                }


            } catch(Exception e){
                System.out.println(e);
            }

        } else if (ae.getSource() == signup){
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }

    public static void main(String[] args){

        new Login();



        
    }


}
