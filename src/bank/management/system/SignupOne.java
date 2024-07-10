package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {

    long random;
    JTextField nameTF, fnameTF,  emailTF, addressTF, cityTF, stateTF, pinTF;
    JDateChooser dateChooser;
    ButtonGroup gender_group,marital_group;// can also declare local
    JRadioButton male, female, married, unmarried, other;
    JButton next;
    SignupOne(){

        setLayout(null);

        Random ran = new Random();
        random = Math.abs(ran.nextLong() % 900L + 1000L);

        JLabel formno = new JLabel("APPLICATION FORM NO. "+ random);
        formno.setFont(new Font("Railway", Font.BOLD, 38));
        formno.setBounds(140,20,600,40);
        add(formno);

        JLabel personalDetails = new JLabel("Page 1: Personal Details ");
        personalDetails.setFont(new Font("Railway", Font.BOLD, 22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);

        //Name
        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Railway", Font.BOLD, 22));
        name.setBounds(100,140,100,30);
        add(name);

        nameTF = new JTextField();
        nameTF.setFont(new Font("Railway", Font.BOLD, 14));
        nameTF.setBounds(350,140, 400, 30);
        add(nameTF);

        //Father's name
        JLabel fname = new JLabel("Father's Name: ");
        fname.setFont(new Font("Railway", Font.BOLD, 22));
        fname.setBounds(100,190,200,30);
        add(fname);

        fnameTF = new JTextField();
        fnameTF.setFont(new Font("Railway", Font.BOLD, 14));
        fnameTF.setBounds(350,190, 400, 30);
        add(fnameTF);

        //DOB
        JLabel dob = new JLabel("Date Of Birth: ");
        dob.setFont(new Font("Railway", Font.BOLD, 22));
        dob.setBounds(100,240,200,30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(350,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);

        //Gender
        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Railway", Font.BOLD, 22));
        gender.setBounds(100,290,200,30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(350,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(470,290,100,30);
        female.setBackground(Color.WHITE);
        add(female);

        gender_group = new ButtonGroup();
        gender_group.add(male);
        gender_group.add(female);

        //email
        JLabel email = new JLabel("Email: ");
        email.setFont(new Font("Railway", Font.BOLD, 22));
        email.setBounds(100,340,200,30);
        add(email);

        emailTF = new JTextField();
        emailTF.setFont(new Font("Railway", Font.BOLD, 14));
        emailTF.setBounds(350,340, 400, 30);
        add(emailTF);

        //marital status
        JLabel marital = new JLabel("Marital status: ");
        marital.setFont(new Font("Railway", Font.BOLD, 22));
        marital.setBounds(100,390,200,30);
        add(marital);

        married = new JRadioButton("Married");
        married.setBounds(350,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(470,390,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        other = new JRadioButton("Other");
        other.setBounds(590,390,100,30);
        other.setBackground(Color.WHITE);
        add(other);

        marital_group = new ButtonGroup();
        marital_group.add(married);
        marital_group.add(unmarried);
        marital_group.add(other);

        //Address
        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Railway", Font.BOLD, 22));
        address.setBounds(100,440,200,30);
        add(address);

        addressTF = new JTextField();
        addressTF.setFont(new Font("Railway", Font.BOLD, 14));
        addressTF.setBounds(350,440, 400, 30);
        add(addressTF);

        //City
        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Railway", Font.BOLD, 22));
        city.setBounds(100,490,200,30);
        add(city);

        cityTF = new JTextField();
        cityTF.setFont(new Font("Railway", Font.BOLD, 14));
        cityTF.setBounds(350,490, 400, 30);
        add(cityTF);

        //State
        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Railway", Font.BOLD, 22));
        state.setBounds(100,540,200,30);
        add(state);

        stateTF = new JTextField();
        stateTF.setFont(new Font("Railway", Font.BOLD, 14));
        stateTF.setBounds(350,540, 400, 30);
        add(stateTF);

        //PIN Code
        JLabel pinCode = new JLabel("PIN Code: ");
        pinCode.setFont(new Font("Railway", Font.BOLD, 22));
        pinCode.setBounds(100,590,200,30);
        add(pinCode);

        pinTF = new JTextField();
        pinTF.setFont(new Font("Railway", Font.BOLD, 14));
        pinTF.setBounds(350,590, 400, 30);
        add(pinTF);

        //Next
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Railway", Font.BOLD, 14));
        next.setBounds(670,660,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(Color.WHITE);

        setSize(850,800);
        setLocation(350,10);
        setVisible(true);


    }

    public void actionPerformed(ActionEvent ae){

        String formno = "" + random;//convert long to string
        String name = nameTF.getText();
        String fname = fnameTF.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()){
            gender = "Female";
        }

        String email = emailTF.getText();
        String marital = null;
        if(married.isSelected())
        {
            marital = "Married";
        }
        else if(unmarried.isSelected())
        {
            marital = "Unmarried";
        }
        else if(other.isSelected())
        {
            marital = "Other";
        }

        String address = addressTF.getText();
        String city = cityTF.getText();
        String state = stateTF.getText();
        String pin = pinTF.getText();

        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is required");
            } else{
                Conn c = new Conn();
                String query = "insert into signup values('"+ formno + "', '" + name + "', '" + fname+ "', '" + dob+ "', '" + gender+ "', '" + email+ "', '" + marital+ "', '" + address+ "', '" + city+ "', '" + pin+ "', '" + state+ "'); ";
                c.s.executeUpdate(query);

                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
        } catch (Exception e){
            System.out.println(e);
        }


    }

    public static void main(String[] args){
        new SignupOne();

    }
}
