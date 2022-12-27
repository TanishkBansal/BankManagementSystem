package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    JTextField aadhar,pan;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion, category, occupation, education, income;
    String Formno;
    
    SignupTwo(String Formno) {
        this.Formno = Formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        JLabel addtionalDetails = new JLabel("Page 2: Additional Details");
        addtionalDetails.setFont(new Font("Raleway", Font.BOLD, 18));
        addtionalDetails.setBounds(210,65,400,30);
        add(addtionalDetails);
        
        JLabel name = new JLabel("Religion: ");
        name.setFont(new Font("Raleway", Font.BOLD, 18));
        name.setBounds(50,120,100,30);
        add(name);
        
        String valReligion[] =  {"Hindu", "Muslim", "Sikh", "Christian", "Others"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300,120,215,30);
        religion.setBackground(Color.white);
        add(religion);

        JLabel fname = new JLabel("Category: ");
        fname.setFont(new Font("Raleway", Font.BOLD, 18));
        fname.setBounds(50,170,150,30);
        add(fname);
           
        String valcategory[] = {"General", "OBC", "SC", "ST"};
        category = new JComboBox(valcategory);
        category.setBounds(300,170,215,30);
        category.setBackground(Color.white);
        add(category);

        JLabel dob = new JLabel("Income: ");
        dob.setFont(new Font("Raleway", Font.BOLD, 18));
        dob.setBounds(50,220,200,30);
        add(dob);
        
        
        String incomecategory[] = {"NULL", "<1,50,000", "<2,50,500", "<5,00,000", "Upto 10,00,000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300,220,215,30);
        income.setBackground(Color.white);
        add(income);
        
        
        JLabel gender = new JLabel("Educational ");
        gender.setFont(new Font("Raleway", Font.BOLD, 18));
        gender.setBounds(50,270,200,30);
        add(gender);
        
        JLabel email = new JLabel("Qualification: ");
        email.setFont(new Font("Raleway", Font.BOLD, 18));
        email.setBounds(50,300,200,30);
        add(email);
        
        String educationval[] = {"Metric", "Graduation", "Post-Graduation", "Ph.Ed", "Others"};
        education = new JComboBox(educationval);
        education.setBounds(300,300,215,30);
        education.setBackground(Color.white);
        add(education);
        
        JLabel marital = new JLabel("Occupation: ");
        marital.setFont(new Font("Raleway", Font.BOLD, 18));
        marital.setBounds(50,370,200,30);
        add(marital);
        
        String occupationval[] = {"Salaried", "Self-Employee", "Bussiness", "Student", "Retired", "Others"};
        occupation = new JComboBox(occupationval);
        occupation.setBounds(300,370,215,30);
        occupation.setBackground(Color.white);
        add(occupation);
        
        
        JLabel address = new JLabel("Pan No: ");
        address.setFont(new Font("Raleway", Font.BOLD, 18));
        address.setBounds(50,420,200,30);
        add(address);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 12));
        pan.setBounds(300,420,215,30);
        add(pan);
        
        JLabel city = new JLabel("Aadhar No: ");
        city.setFont(new Font("Raleway", Font.BOLD, 18));
        city.setBounds(50,470,200,30);
        add(city);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 12));
        aadhar.setBounds(300,470,215,30);
        add(aadhar);
        
        JLabel state = new JLabel("Senior Citizen: ");
        state.setFont(new Font("Raleway", Font.BOLD, 18));
        state.setBounds(50,520,200,30);
        add(state);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300,520,100,30);
        syes.setBackground(Color.white);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(400,520,90,30);
        sno.setBackground(Color.white);
        add(sno);
        
        ButtonGroup seniorgroup = new ButtonGroup();
        seniorgroup.add(syes);
        seniorgroup.add(sno);
        
        JLabel pincode = new JLabel("Existing Account: ");
        pincode.setFont(new Font("Raleway", Font.BOLD, 18));
        pincode.setBounds(50,570,200,30);
        add(pincode);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,570,100,30);
        eyes.setBackground(Color.white);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(400,570,90,30);
        eno.setBackground(Color.white);
        add(eno);
        
        ButtonGroup existinggroup = new ButtonGroup();
        existinggroup.add(eyes);
        existinggroup.add(eno);

        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(470,610,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(650, 690);
        setLocation(350, 10);
        setVisible(true);
    } 
    
    public void actionPerformed(ActionEvent ae){
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String)  category.getSelectedItem();
        String sincome = (String)  income.getSelectedItem();
        String seducation = (String)  education.getSelectedItem();
        String soccupation = (String)  occupation.getSelectedItem();
        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen = "Yes";
        }
        else if(sno.isSelected()){
            seniorcitizen = "No";
        }
        
        String existingacc = null;
        if (eyes.isSelected()){
            existingacc = "Yes";
        }
        else if(eno.isSelected()){
            existingacc = "No";
        }
        
        
        String span = pan.getText();
        String saadhar = aadhar.getText();
        
        try {
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+Formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingacc+"')";
                c.s.executeUpdate(query);
            
                setVisible(false);
                new SignupThree(Formno).setVisible(true);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String args[]){
        new SignupTwo("");
    }
}