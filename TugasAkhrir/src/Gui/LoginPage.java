/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gui;

/**
 *
 * @author Akhrizal
 */
import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import Entity.User;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame {
    Font fontjudul , fontketerangan;
    private JTextField JtUsername;
    private JPasswordField JtPassword;
    private JLabel labeluser,judul;
    private JLabel labelpassword;
    private JButton btnlogin;
    
    private JLabel bg(){
        String imagePath="src/Gui/image/Loginbg.png";
        
        try {
            BufferedImage bImage;
            Image imgResize;
            ImageIcon imgIcon = null;
            
            bImage = ImageIO.read(new File(imagePath));
            
            imgResize = bImage.getScaledInstance(750,720,Image.SCALE_SMOOTH);
            
            imgIcon = new ImageIcon(imgResize);
            
            return new JLabel(imgIcon);
        } catch (IOException ex) {
            return new JLabel("Gagal Membaca File");
        }
    }
    
    public LoginPage(){
        setTitle("");
        setSize(1280,720);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JLabel imgLabel = bg();
        imgLabel.setBounds(498,0, 750, 720);
        add(imgLabel);
        
        JtUsername = new JTextField(20);
        JtUsername.setBounds(139, 293, 260, 43);
        JtUsername.setFont(fontketerangan);
        add(JtUsername);
        
        JtPassword = new JPasswordField();
        JtPassword.setBounds(139, 395, 260, 43);
        JtPassword.setFont(fontketerangan);
        add(JtPassword);
        
        labeluser = new JLabel("Username");
        labeluser.setBounds(142, 256,92, 23);
        fontketerangan = new Font("Times New Roman", Font.BOLD,20);
        labeluser.setFont(fontketerangan);
        add(labeluser);
        
        labelpassword = new JLabel("Password");
        labelpassword.setBounds(143, 361, 80, 23);
        labelpassword.setFont(fontketerangan);
        add(labelpassword);
        
        judul = new JLabel("PT. Makmur Sejahtera Abadi");
        judul.setBounds(110, 154, 420, 41);
        fontjudul = new Font("Arial", Font.BOLD,23);
        judul.setFont(fontjudul);
        judul.setForeground(Color.BLUE);
        add(judul);
        
        judul = new JLabel("DATA KARYAWAN");
        judul.setBounds(156, 107, 226, 41);
        judul.setFont(fontjudul);
        judul.setForeground(Color.BLUE);
        add(judul);
        
        btnlogin = new JButton("Login");
        btnlogin.setBounds(189, 498, 139, 44);
        btnlogin.setFont(fontketerangan);
        btnlogin.setBackground(Color.decode("#007FC7"));
        btnlogin.setForeground(Color.white);
        add(btnlogin);
        
        btnlogin.addActionListener(new ActionListener() {
            @Override
          
            public void actionPerformed(ActionEvent e) {
                User userlogin = new User();
                if (JtPassword.getText().equals(userlogin.getPassword()) && JtUsername.getText().equals(userlogin.getUser())) {
                    // open new GUI class
                    new MainFrame().setVisible(true);
                    // close login form
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Username atau Pasword Salah");
                    System.out.println("Login Gagal");
                }
            }
        });
        
        
        
        
    }
}
