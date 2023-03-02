package Pertemuan2;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Login {
    public static void main(String[] args) {
        JFrame j = new JFrame("JFrame Pertamaku");
        
        JLabel username = new JLabel();
        username.setText("Username :");
        username.setBounds(50,100,100,30);
        j.add(username);
        
        JLabel password = new JLabel();
        password.setText("Password :");
        password.setBounds(50,140,100,30);
        j.add(password);
        
        JTextField usernameTxt = new JTextField();
        usernameTxt.setBounds(150,100,300,30);
        j.add(usernameTxt);
        
        JTextField passwordTxt = new JTextField();
        passwordTxt.setBounds(150,150,300,30);
        j.add(passwordTxt);
        
        JButton loginButton = new JButton();
        loginButton.setText("LOGIN");
        loginButton.setBounds(250, 200, 100, 30);
        j.add(loginButton);
        
        j.setSize(800,800);
        j.setLayout(null);
        j.setVisible(true);
        
    }
    
}
