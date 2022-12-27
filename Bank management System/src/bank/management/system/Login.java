package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
        JButton login, signup, clear;
        JTextField cardTextField;
        JPasswordField pinTextField;
        Login() {
            setTitle("BANK MANAGEMENT SYSTEM");
            setLayout(null);
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
            Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel label = new JLabel(i3);
            label.setBounds(20, 10, 100, 100);
            add(label);
            
            JLabel text = new JLabel("Welcome To the BANK");
            text.setFont(new Font("Osward", Font.BOLD, 30));
            text.setBounds(250, 40, 400, 40);
            add(text);
            
            JLabel cardnum = new JLabel("Your Card No.");
            cardnum.setFont(new Font("Raleway", Font.BOLD, 20));
            cardnum.setBounds(100, 200, 150, 25);
            add(cardnum);
            
            cardTextField = new JTextField();
            cardTextField.setBounds(325, 200, 250, 30);
            cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
            add(cardTextField);
            
            JLabel pin = new JLabel("Secret PIN");
            pin.setFont(new Font("Raleway", Font.BOLD, 20));
            pin.setBounds(100, 255, 150, 25);
            add(pin);
            
            pinTextField = new JPasswordField();
            pinTextField.setBounds(325, 255, 250, 30);
            pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
            add(pinTextField);
            
            login = new JButton("SIGN IN");
            login.setBounds(345, 300, 100, 30);
            login.setBackground(Color.BLACK);
            login.setForeground(Color.WHITE);
            login.addActionListener(this);
            add(login);
            
            clear = new JButton("CLEAR");
            clear.setBounds(455, 300, 100, 30);
            clear.setBackground(Color.BLACK);
            clear.setForeground(Color.WHITE);
            clear.addActionListener(this);
            add(clear);
            
            signup = new JButton("SIGN UP");
            signup.setBounds(345, 340, 210, 30);
            signup.setBackground(Color.BLACK);
            signup.setForeground(Color.WHITE);
            signup.addActionListener(this);
            add(signup);
            
            getContentPane().setBackground(Color.WHITE);
            setSize(800, 480);
            setVisible(true);
            setLocation(250,100);
            
        }
        
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if(ae.getSource()== login){
            Conn conn = new Conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "select * from login where cardnum = '"+cardnumber+"' and pin = '"+pinnumber+"'";
            try{
                ResultSet rs = conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
                }
            }catch (Exception e){
                System.out.println(e);
            }
        }
        else if(ae.getSource() == signup){
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }
    public static void main(String args[]){
        new Login();
    }
}
