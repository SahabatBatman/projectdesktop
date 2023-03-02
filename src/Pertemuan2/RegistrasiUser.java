package Pertemuan2;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class RegistrasiUser {
    public static void main(String[] args) {
        JFrame j = new JFrame("JFrame Keduaku");
        
        JLabel nama = new JLabel();
        nama.setText("Nama :");
        nama.setBounds(50,100,100,30);
        j.add(nama);
        
        JLabel username = new JLabel();
        username.setText("Username :");
        username.setBounds(50,150,100,30);
        j.add(username);
        
        JLabel password = new JLabel();
        password.setText("Password :");
        password.setBounds(50,200,100,30);
        j.add(password);
        
        JLabel email = new JLabel();
        email.setText("Email :");
        email.setBounds(50,250,100,30);
        j.add(email);
        
        JLabel nohp = new JLabel();
        nohp.setText("No HP :");
        nohp.setBounds(50,300,100,30);
        j.add(nohp);
        
        JLabel alamat = new JLabel();
        alamat.setText("Alamat :");
        alamat.setBounds(50,350,100,30);
        j.add(alamat);
        
        JTextField namaTxt = new JTextField();
        namaTxt.setBounds(150,100,300,30);
        j.add(namaTxt);
        
        JTextField usernameTxt = new JTextField();
        usernameTxt.setBounds(150,150,300,30);
        j.add(usernameTxt);
        
        JPasswordField passwordTxt = new JPasswordField();
        passwordTxt.setBounds(150,200,300,30);
        j.add(passwordTxt);
        
        JTextField emailTxt = new JTextField();
        emailTxt.setBounds(150,250,300,30);
        j.add(emailTxt);
        
        JTextField nohpTxt = new JTextField();
        nohpTxt.setBounds(150,300,300,30);
        j.add(nohpTxt);
        
        JTextArea alamatTxt = new JTextArea();
        alamatTxt.setBounds(150,350,300,100);
        j.add(alamatTxt);
        
        JButton regisButton = new JButton();
        regisButton.setText("Daftar");
        regisButton.setBounds(250, 350, 100, 30);
        j.add(regisButton);
        
        
        j.setSize(800,800);
        j.setLayout(null);
        j.setVisible(true);
        
    }
    
}
