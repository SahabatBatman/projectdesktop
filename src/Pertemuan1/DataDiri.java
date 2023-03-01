package Pertemuan1;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DataDiri {
    public static void main(String[] args) {
        JFrame j = new JFrame("Tugas");
        
        JLabel nama = new JLabel();
        nama.setText("Nama ");
        nama.setBounds(50,100,100,30);
        j.add(nama);
        
        JTextField name = new JTextField();
        name.setBounds(150,100,200,30);
        j.add(name);
        
        JLabel jenisKelamin = new JLabel();
        jenisKelamin.setText("Jenis Kelamin ");
        jenisKelamin.setBounds(50,150,100,30);
        j.add(jenisKelamin);
        
        JCheckBox jeKel1 = new JCheckBox();
        jeKel1.setText("Laki-Laki");
        jeKel1.setBounds(150,150,100,30);
        j.add(jeKel1);
        JCheckBox jeKel2 = new JCheckBox();
        jeKel2.setText("Perempuan");
        jeKel2.setBounds(250,150,100,30);
        j.add(jeKel2);
        
        JLabel hobby = new JLabel();
        hobby.setText("Hobby ");
        hobby.setBounds(50,200,100,30);
        j.add(hobby);
        
        JRadioButton hob1 = new JRadioButton();
        hob1.setText("Belajar");
        hob1.setBounds(150,200,100,30);
        j.add(hob1);
        JRadioButton hob2 = new JRadioButton();
        hob2.setText("Menggambar");
        hob2.setBounds(250,200,100,30);
        j.add(hob2);
        JRadioButton hob3 = new JRadioButton();
        hob3.setText("Menonton");
        hob3.setBounds(350,200,100,30);
        j.add(hob3);
        JRadioButton hob4 = new JRadioButton();
        hob4.setText("Lainnya");
        hob4.setBounds(450,200,100,30);
        j.add(hob4);
       
        ButtonGroup jeKel = new ButtonGroup();
        jeKel.add(jeKel1);
        jeKel.add(jeKel2);
        
        j.setSize(800,800);
        j.setLayout(null);
        j.setVisible(true);
        
    }
    
}
