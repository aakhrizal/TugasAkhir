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
import javax.swing.table.DefaultTableModel;
import javax.imageio.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Entity.Pegawai;
import java.util.ArrayList;

public class MainFrame extends JFrame {
    Font font,font1,fontperusahaan,fonttombol,salam;
    JTable table;
    DefaultTableModel tableModel;
    private JTextField fieldcari;
    private JPanel panel1,panel2;
    private JLabel labelnama,perusahaan,listdata,welcome;
    private JButton datakaryawan,gajimanager,gajiproduksi,gajikantor,logout;
    private JLabel nama,id,alamat,kelamin,jabatan,telepon;
    private JTextField namaField;
    private JTextField idField;
    private JTextField alamatField;
    private JTextField kelaminField;
    private JTextField jabatanField;
    private JTextField teleponField;
    private JButton tambahButton;
    private JButton hapusButton;
    private JScrollPane Jscrollpane;
    private ArrayList<Pegawai> dataPegawai = new ArrayList<Pegawai>();
    
    private JLabel loadImage(){
        String imagePath="src/Gui/image/admin.png";
        
        try {
            BufferedImage bImage;
            Image imgResize;
            ImageIcon imgIcon = null;
            
            bImage = ImageIO.read(new File(imagePath));
            
            imgResize = bImage.getScaledInstance(150,150,Image.SCALE_SMOOTH);
            
            imgIcon = new ImageIcon(imgResize);
            
            return new JLabel(imgIcon);
        } catch (IOException ex) {
            return new JLabel("Gagal Membaca File");
        }
    }
    
   
    public MainFrame(){
        setTitle("");
        setSize(1280,720);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        String[] columnNames = {"No ID", "Nama", "Jenis Kelamin","Alamat","Jabatan","No. Telp"};
        Object[][] data = {};

        table = new JTable(data, columnNames);
        table.setBounds(250, 280, 998, 389);
        JScrollPane jscrollpane = new JScrollPane(table);
        jscrollpane.setBounds(250, 280,998, 389);
        add(jscrollpane);
        

        namaField = new JTextField(15);
        idField = new JTextField(15);
        alamatField = new JTextField(15);
        kelaminField = new JTextField(15);
        jabatanField = new JTextField(15);
        teleponField = new JTextField(15);
        
        idField.setBounds(359, 135,260, 20);
        namaField.setBounds(359, 165,260 ,20);
        kelaminField.setBounds(359, 196, 260,20);
        jabatanField.setBounds(803, 135, 260, 20);
        alamatField.setBounds(803, 165, 260, 20);
        teleponField.setBounds(803, 196,260, 20);
        
        JLabel nama = new JLabel("Nama Karyawan");
        nama.setBounds(250, 165, 95,16);
        add(nama);
        
        JLabel id = new JLabel("Id Karyawan");
        JLabel kelamin = new JLabel("Jenis Kelamin");
        JLabel Jabatan = new JLabel("Jabatan");
        JLabel alamat = new JLabel("Alamat");
        JLabel telepon = new JLabel("Telepon");
        
        
        id.setBounds(248,135,97,16);
        add(id);
        kelamin.setBounds(265,196,80,16);
        add(kelamin);
        Jabatan.setBounds(744,133,50,16);
        add(Jabatan);
        alamat.setBounds(745,163,42,16);
        add(alamat);
        telepon.setBounds(718,196,69, 16);
        add(telepon);
        
        add(namaField);
        add(idField);
        add(alamatField);
        add(kelaminField);
        add(jabatanField);
        add(teleponField);

        tambahButton = new JButton("Tambah");
        tambahButton.setBounds(1125, 133, 100, 31);
        tambahButton.setBackground(Color.blue);
        tambahButton.setForeground(Color.WHITE);
        tambahButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = namaField.getText();
                int id = Integer.parseInt(idField.getText());
                String alamat = alamatField.getText();
                String kelamin = kelaminField.getText();
                String jabatan = jabatanField.getText();
                String telepon = teleponField.getText();
                dataPegawai.add(new Pegawai(id, nama, alamat,kelamin,jabatan,telepon));
                updateTable();
                namaField.setText("");
                idField.setText("");
                alamatField.setText("");
                kelaminField.setText("");
                jabatanField.setText("");
                teleponField.setText("");
            }
        });
        add(tambahButton);
        
hapusButton = new JButton("Hapus");
hapusButton.setBounds(1125, 185, 100, 31);
hapusButton.setBackground(Color.blue);
hapusButton.setForeground(Color.white);
        hapusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    dataPegawai.remove(selectedRow);
                    updateTable();
                }
            }
        });
        add(hapusButton);

        setVisible(true);
        
fieldcari = new JTextField();
    fieldcari.setBounds(938,253,170,20);
    add(fieldcari);
    
    JButton cari = new JButton("Cari");
    cari.setBounds(1117,253,72,23);
    cari.setBackground(Color.blue);
    cari.setForeground(Color.white);
    add(cari);
    
    cari.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int id = Integer.parseInt(fieldcari.getText());
            for (Pegawai pegawai : dataPegawai) {
                if (pegawai.getIdkar() == id) {
                    namaField.setText(pegawai.getNama());
                    idField.setText(Integer.toString(pegawai.getIdkar()));
                    alamatField.setText(pegawai.getAlamat());
                    kelaminField.setText(pegawai.getKelamin());
                    jabatanField.setText(pegawai.getJabatan());
                    teleponField.setText(pegawai.getNotelp());
                }
            }
        }
    });




        
        JLabel imgLabel = loadImage();
        imgLabel.setBounds(33, 67, 136, 137);
        add(imgLabel);
        
        listdata = new JLabel("List Data Karyawan");
        listdata.setBounds(250, 257,147, 23);
        font1 = new Font("Times New Roman",Font.BOLD,16);
        listdata.setFont(font1);
        add(listdata);
        
        
        
        logout = new JButton("Logout");
        logout.setBounds(0, 630, 205, 39);
        logout.setBackground(Color.decode("#007FC7"));
        logout.setForeground(Color.BLACK);
        font1 = new Font("Times New Roman",Font.BOLD,16);
        logout.setFont(font1);
        logout.setBorderPainted(false);
        add(logout);
        
        gajimanager = new JButton("Gaji Manager");
        gajimanager.setBackground(Color.decode("#007FC7"));
        gajimanager.setBounds(0, 347, 205, 39);
        gajimanager.setForeground(Color.white);
        font = new Font("arial", Font.PLAIN,17);
        gajimanager.setFont(font);
        add(gajimanager);
        
        gajiproduksi = new JButton("Gaji Pegawai Produksi");
        gajiproduksi.setBackground(Color.decode("#007FC7"));
        gajiproduksi.setBounds(0, 385, 205, 39);
        gajiproduksi.setForeground(Color.white);
        font = new Font("arial", Font.PLAIN,17);
        gajiproduksi.setFont(font);
        add(gajiproduksi);
        
        gajikantor = new JButton("Gaji Pegawai Kantor");
        gajikantor.setBackground(Color.decode("#007FC7"));
        gajikantor.setBounds(0, 423, 205, 39);
        gajikantor.setForeground(Color.white);
        font = new Font("arial", Font.PLAIN,17);
        gajikantor.setFont(font);
        add(gajikantor);
       
        
        labelnama = new JLabel("Tugas Akhir Praktikum PBO “Data Pegawai” - Ahmad Akhrizal (06.2021.1.07375)");
        labelnama.setBounds(9,10, 667, 23);
        labelnama.setForeground(Color.white);
        add(labelnama);
        
        welcome = new JLabel("Selamat Datang");
        welcome.setBounds(30,237,500, 28);
        welcome.setForeground(Color.BLACK);
        salam = new Font("Arial",Font.BOLD,20);
        welcome.setFont(salam);
        add(welcome);
        
        perusahaan = new JLabel("PT. Makmur Sejahtera Abadi");
        perusahaan.setBounds(249, 74, 513, 44);
        perusahaan.setForeground(Color.BLACK);
        fontperusahaan = new Font("Times New Roman",Font.BOLD,36);
        perusahaan.setFont(fontperusahaan);
        add(perusahaan);

        
        panel2 = new JPanel();
        panel2.setBounds(0,44,206,676);
        panel2.setBackground(Color.decode("#007FC7"));
        add(panel2);
        
        panel1 = new JPanel();
        panel1.setBounds(0,0, 1280, 44);
        panel1.setBackground(Color.decode("#005A8D"));
        add(panel1);
        
         gajimanager.addActionListener((var e) -> {
            Gajimanager gajim = new Gajimanager();
            gajim.setVisible(true);
            
             
        });
         
         gajikantor.addActionListener(new ActionListener() {
            @Override
          
            public void actionPerformed(ActionEvent e) {
                    Gajikantor kantor = new Gajikantor();
                    kantor.setVisible(true);
            }
        });
         
         gajiproduksi.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e){
                 Gajiproduksi pabrik = new Gajiproduksi();
                 pabrik.setVisible(true);
             }
         });
    
         
         
         logout.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e){
                 setVisible(false);
                 LoginPage login = new LoginPage();
                 login.setVisible(true);
             }
         });
         
         
    }
    
    private void updateTable() {
        String[][] data = new String[dataPegawai.size()][6];
        for (int i = 0; i < dataPegawai.size(); i++) {
            data[i][0] = Integer.toString(dataPegawai.get(i).getIdkar());
            data[i][1] = dataPegawai.get(i).getNama();
            data[i][2] = dataPegawai.get(i).getKelamin();
            data[i][3] = dataPegawai.get(i).getAlamat();
            data[i][4] = dataPegawai.get(i).getJabatan();
            data[i][5] = dataPegawai.get(i).getNotelp();
        }

        table.setModel(new DefaultTableModel(data, new String[]{"No ID", "Nama", "Jenis Kelamin","Alamat","Jabatan","No. Telp"}));
    }
    
}
