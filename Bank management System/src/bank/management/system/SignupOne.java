package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;
public class SignupOne extends JFrame implements ActionListener{
    long random;
    JTextField nameTextField,pinTextField,fnameTextField,emailTextField,cityTextField,stateTextField,addressTextField;
    JButton next;
    JRadioButton male, female, married, notmarried, other;
    JDateChooser dateChooser;
    JLabel l1,l2,l3;
    SignupOne() {
        setLayout(null);
        
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        
        JLabel formno = new JLabel("APPLICATION FORM NO. " +random);
        formno.setFont(new Font("Raleway", Font.BOLD, 25));
        formno.setBounds(140,20,680,40);
        add(formno);
        
        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 18));
        personalDetails.setBounds(210,65,400,30);
        add(personalDetails);
        
        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Raleway", Font.BOLD, 18));
        name.setBounds(50,120,100,30);
        add(name);
        
        l1 = new JLabel("(Name in Characters only)");
        l1.setFont(new Font("Raleway", Font.BOLD, 12));
        l1.setBounds(328,148,200,20);
        add(l1);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 12));
        nameTextField.setBounds(300,120,215,30);
        add(nameTextField);
        
        JLabel fname = new JLabel("Fathers' Name: ");
        fname.setFont(new Font("Raleway", Font.BOLD, 18));
        fname.setBounds(50,170,150,30);
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 12));
        fnameTextField.setBounds(300,170,215,30);
        add(fnameTextField);
        
        JLabel dob = new JLabel("Date of Birth: ");
        dob.setFont(new Font("Raleway", Font.BOLD, 18));
        dob.setBounds(50,220,200,30);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 220, 215, 30);
        dateChooser.setForeground(Color.RED);
        add(dateChooser);
        
        l2 = new JLabel("(Must be 18 years and more)");
        l2.setFont(new Font("Raleway", Font.BOLD, 12));
        l2.setBounds(328,248,200,20);
        add(l2);
        
        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Raleway", Font.BOLD, 18));
        gender.setBounds(50,270,200,30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300,270,60,30);
        male.setBackground(Color.white);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(370,270,75,30);
        female.setBackground(Color.white);
        add(female);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel email = new JLabel("Email Address: ");
        email.setFont(new Font("Raleway", Font.BOLD, 18));
        email.setBounds(50,320,200,30);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 12));
        emailTextField.setBounds(300,320,215,30);
        add(emailTextField);
        
        JLabel marital = new JLabel("Marital Status: ");
        marital.setFont(new Font("Raleway", Font.BOLD, 18));
        marital.setBounds(50,370,200,30);
        add(marital);
        
        married = new JRadioButton("Married");
        married.setBounds(300,370,90,30);
        married.setBackground(Color.white);
        add(married);
        
        notmarried = new JRadioButton("Not Married");
        notmarried.setBounds(390,370,100,30);
        notmarried.setBackground(Color.white);
        add(notmarried);
        
        other = new JRadioButton("Other");
        other.setBounds(490,370,90,30);
        other.setBackground(Color.white);
        add(other);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(notmarried);
        maritalgroup.add(other);
        
        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Raleway", Font.BOLD, 18));
        address.setBounds(50,420,200,30);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 12));
        addressTextField.setBounds(300,420,215,30);
        add(addressTextField);
        
        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Raleway", Font.BOLD, 18));
        city.setBounds(50,470,200,30);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 12));
        cityTextField.setBounds(300,470,215,30);
        add(cityTextField);
        
        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Raleway", Font.BOLD, 18));
        state.setBounds(50,520,200,30);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 12));
        stateTextField.setBounds(300,520,215,30);
        add(stateTextField);
        
        JLabel pincode = new JLabel("Pin Code: ");
        pincode.setFont(new Font("Raleway", Font.BOLD, 18));
        pincode.setBounds(50,570,200,30);
        add(pincode);
        
        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway", Font.BOLD, 12));
        pinTextField.setBounds(300,570,215,30);
        add(pinTextField);
        
        l3 = new JLabel("(Numeric 6 Digits)");
        l3.setFont(new Font("Raleway", Font.BOLD, 12));
        l3.setBounds(328,598,200,20);
        add(l3);
        
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
        String Formno = "" + random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }
        else if(female.isSelected()){
            gender = "Female";
        }
        
        String email = emailTextField.getText();
        String marital = null;
        if (married.isSelected()){
            marital = "Married";
        }
        else if(notmarried.isSelected()){
            marital = "Not Married";
        }
        else if(other.isSelected()){
            marital = "Other";
        }
        
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();
        
        try {
            if (name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required");
            }
            else {
                Conn c = new Conn();
                String query = "insert into signup values('"+Formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                c.s.executeUpdate(query);
            
                setVisible(false);
                new SignupTwo(Formno).setVisible(true);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String args[]){
        new SignupOne();
    }
}