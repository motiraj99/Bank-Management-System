package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {


    JTextField panTF, aadharTF;
    JRadioButton s_yes, s_no, acc_yes, acc_no;
    JComboBox religionComboBox, catComboBox, incomeComboBox, eduComboBox, occComboBox;
    JButton next;
    String formno;
    SignupTwo(String formno){

        this.formno = formno;
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details ");
        additionalDetails.setFont(new Font("Railway", Font.BOLD, 22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);

        //Religion
        JLabel religion = new JLabel("Religion: ");
        religion.setFont(new Font("Railway", Font.BOLD, 22));
        religion.setBounds(100,140,150,30);
        add(religion);

        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Chritian", "Other"};
        religionComboBox = new JComboBox(valReligion);
        religionComboBox.setBounds(350,140,400,30);
        religionComboBox.setBackground(Color.WHITE);
        add(religionComboBox);

        //Category
        JLabel category = new JLabel("Category: ");
        category.setFont(new Font("Railway", Font.BOLD, 22));
        category.setBounds(100,190,200,30);
        add(category);

        String valCategory[] = {"General", "OBC", "SC", "ST", "Other"};
        catComboBox = new JComboBox(valCategory);
        catComboBox.setBounds(350,190,400,30);
        catComboBox.setBackground(Color.WHITE);
        add(catComboBox);

        //Income
        JLabel income = new JLabel("Income: ");
        income.setFont(new Font("Railway", Font.BOLD, 22));
        income.setBounds(100,240,200,30);
        add(income);

        String valIncome[] = {"Null", "< 1.5 Lac", "< 2.5 Lac", "< 5 Lac", "Above 5 Lac"};
        incomeComboBox = new JComboBox(valIncome);
        incomeComboBox.setBounds(350,240,400,30);
        incomeComboBox.setBackground(Color.WHITE);
        add(incomeComboBox);

        //Edu
        JLabel edu = new JLabel("Educational: ");
        edu.setFont(new Font("Railway", Font.BOLD, 22));
        edu.setBounds(100,290,200,30);
        add(edu);

        JLabel qual = new JLabel("Qualification: ");
        qual.setFont(new Font("Railway", Font.BOLD, 22));
        qual.setBounds(100,315,200,30);
        add(qual);

        String valEdu[] = {"High School", "Graduate", "Post Grad", "Doctorate", "Other"};
        eduComboBox = new JComboBox(valEdu);
        eduComboBox.setBounds(350,290,400,30);
        eduComboBox.setBackground(Color.WHITE);
        add(eduComboBox);

        //Occupation
        JLabel occ = new JLabel("Occupation: ");
        occ.setFont(new Font("Railway", Font.BOLD, 22));
        occ.setBounds(100,370,200,30);
        add(occ);

        String valOcc[] = {"Salaried", "Self employed", "Business", "Student", "Retired", "Other"};
        occComboBox = new JComboBox(valOcc);
        occComboBox.setBounds(350,370,400,30);
        occComboBox.setBackground(Color.WHITE);
        add(occComboBox);

        //PAN
        JLabel pan = new JLabel("PAN: ");
        pan.setFont(new Font("Railway", Font.BOLD, 22));
        pan.setBounds(100,420,200,30);
        add(pan);

        panTF = new JTextField();
        panTF.setFont(new Font("Railway", Font.BOLD, 14));
        panTF.setBounds(350,420, 400, 30);
        add(panTF);

        //AADHAR
        JLabel aadhar = new JLabel("AADHAR: ");
        aadhar.setFont(new Font("Railway", Font.BOLD, 22));
        aadhar.setBounds(100,470,200,30);
        add(aadhar);

        aadharTF = new JTextField();
        aadharTF.setFont(new Font("Railway", Font.BOLD, 14));
        aadharTF.setBounds(350,470, 400, 30);
        add(aadharTF);

        //State
        JLabel s_citizen = new JLabel("Senior Citizen: ");
        s_citizen.setFont(new Font("Railway", Font.BOLD, 22));
        s_citizen.setBounds(100,520,200,30);
        add(s_citizen);

        s_yes = new JRadioButton("Yes");
        s_yes.setBounds(350,520,100,30);
        s_yes.setBackground(Color.WHITE);
        add(s_yes);

        s_no = new JRadioButton("No");
        s_no.setBounds(470,520,100,30);
        s_no.setBackground(Color.WHITE);
        add(s_no);

        ButtonGroup s_group = new ButtonGroup();
        s_group.add(s_yes);
        s_group.add(s_no);

        //Existing Acc
        JLabel acc = new JLabel("Existing Account: ");
        acc.setFont(new Font("Railway", Font.BOLD, 22));
        acc.setBounds(100,570,200,30);
        add(acc);

        acc_yes = new JRadioButton("Yes");
        acc_yes.setBounds(350,570,100,30);
        acc_yes.setBackground(Color.WHITE);
        add(acc_yes);

        acc_no = new JRadioButton("No");
        acc_no.setBounds(470,570,100,30);
        acc_no.setBackground(Color.WHITE);
        add(acc_no);

        ButtonGroup acc_group = new ButtonGroup();
        acc_group.add(acc_yes);
        acc_group.add(acc_no);

        //Next
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Railway", Font.BOLD, 14));
        next.setBounds(670,620,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(Color.WHITE);

        setSize(850,800);
        setLocation(350,10);
        setVisible(true);


    }

    public void actionPerformed(ActionEvent ae){

        String religion = (String) religionComboBox.getSelectedItem();
        String category = (String) catComboBox.getSelectedItem();
        String income = (String) incomeComboBox.getSelectedItem();
        String edu_qual = (String) eduComboBox.getSelectedItem();
        String occupation = (String) occComboBox.getSelectedItem();

        String s_citizen = null;
        if(s_yes.isSelected()) {
            s_citizen = "yes";
        } else if (s_no.isSelected()){
            s_citizen = "No";
        }

        String existing_acc = null;
        if(acc_yes.isSelected()) {
            existing_acc = "yes";
        } else if (acc_no.isSelected()){
            existing_acc = "No";
        }

        String pan = panTF.getText();
        String aadhar = aadharTF.getText();

        try{

            Conn c = new Conn();
            String query = "insert into signuptwo values('" + formno + "', '" + religion+ "', '" + category+ "', '" + income+ "', '" + edu_qual+ "', '" + occupation+ "', '" + pan+ "', '" + aadhar+ "', '" + s_citizen + "', '" + existing_acc+ "'); ";
            c.s.executeUpdate(query);

            //signup3 object
            setVisible(false);
            new SignupThree(formno).setVisible(true);

        } catch (Exception e){
            System.out.println(e);
        }


    }

    public static void main(String[] args){
        new SignupTwo("");

    }
}
