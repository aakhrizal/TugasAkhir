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
import java.awt.*;
import Model.ProduksiModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gajiproduksi extends JFrame {
    Font Fontlabel,Fontjudul;
    private JButton Hitung,Cetak;
    private JLabel Id,Nama,Jabatan,Harikerja,Gajipokok,Uangmakan,jamlembur,Bpjs,gajilembur,Hasil,Judul,result;
    private JTextField Jtid,Jtnama,Jtjabatan,Jtharikerja,Jtgajipokok,Jtuangmakan,Jtjamlembur,Jtbpjs,Jtgajilembur;
    private JPanel Panelatas;
    
    public Gajiproduksi(){
        setSize(503,563);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        
        Component();
        
    }
    
    private void Component(){
        
        Hitung = new JButton("Hitung Gaji");
        Hitung.setBounds(67, 475,134, 37);
        Hitung.setBackground(Color.decode("#007FC7"));
        Hitung.setForeground(Color.white);
        add(Hitung);
        
        
        Jtid = new JTextField();
        Jtid.setBounds(307, 56, 152, 20);
        add(Jtid);
        
        Id = new JLabel("No. Id Karyawan ");
        Id.setBounds(32, 56,117,16);
        Fontlabel =new Font("Times New Roman",Font.BOLD,14);
        Id.setFont(Fontlabel);
        add(Id);
        
        Jtnama = new JTextField();
        Jtnama.setBounds(307, 90, 152, 20);
        add(Jtnama);
        
        Nama = new JLabel("Nama ");
        Nama.setBounds(32, 98,49,16);
        Nama.setFont(Fontlabel);
        add(Nama);
        
        Jtjabatan= new JTextField();
        Jtjabatan.setBounds(307, 132, 152, 20);
        add(Jtjabatan);
        
        Jabatan = new JLabel("Jabatan ");
        Jabatan.setBounds(32, 140,69,16);
        Jabatan.setFont(Fontlabel);
        add(Jabatan);
        
        Jtharikerja = new JTextField();
        Jtharikerja.setBounds(307, 170, 152, 20);
        add(Jtharikerja);
        
        Harikerja = new JLabel("Jumlah Hari Kerja ");
        Harikerja.setBounds(32,182,157,16);
        Harikerja.setFont(Fontlabel);
        add(Harikerja);
        
        Jtgajipokok = new JTextField();
        Jtgajipokok.setBounds(307, 215, 152, 20);
        add(Jtgajipokok);
        
        Gajipokok = new JLabel("Gajipokok ");
        Gajipokok.setBounds(32, 224,94,16);
        Gajipokok.setFont(Fontlabel);
        add(Gajipokok);
        
        Jtuangmakan = new JTextField();
        Jtuangmakan.setBounds(307, 259, 152, 20);
        add(Jtuangmakan);
        
        Uangmakan = new JLabel("Uangmakan ");
        Uangmakan.setBounds(32, 266,104,16);
        Uangmakan.setFont(Fontlabel);
        add(Uangmakan);
        
        Jtjamlembur = new JTextField();
        Jtjamlembur.setBounds(307, 303, 152, 20);
        add(Jtjamlembur);
        
        jamlembur = new JLabel("Jumlah Lembur/jam ");
        jamlembur.setBounds(32,308,53,16);
        jamlembur.setFont(Fontlabel);
        add(jamlembur);
        
        Jtgajilembur = new JTextField();
        Jtgajilembur.setBounds(307, 343, 152, 20);
        add(Jtgajilembur);
        
        gajilembur = new JLabel("Gaji Lembur/Jam ");
        gajilembur.setBounds(32,350,38,16);
        gajilembur.setFont(Fontlabel);
        add(gajilembur);
        
        Jtbpjs = new JTextField();
        Jtbpjs.setBounds(307, 383, 152, 20);
        add(Jtbpjs);
        
        Bpjs = new JLabel("BPJS ");
        Bpjs.setBounds(32,392,83,16);
        Bpjs.setFont(Fontlabel);
        add(Bpjs);
        
        Hasil = new JLabel("HASIL YANG DITERIMA BULAN INI  ");
        Hasil.setBounds(32,434,244,16);
        Hasil.setFont(Fontlabel);
        add(Hasil);
        
        Judul = new JLabel("SLIP GAJI PEGAWAI PRODUKSI ");
        Judul.setBounds(142,8,503,23);
        Fontjudul = new Font("Times New Roman",Font.BOLD,17);
        Judul.setFont(Fontjudul);
        Judul.setForeground(Color.white);
        add(Judul);
        
        Panelatas = new JPanel();
        Panelatas.setBounds(0,0,503,38);
        Panelatas.setBackground(Color.decode("#007FC7"));
        add(Panelatas);
        
        result = new JLabel();
        result.setBounds(307,430,152,20);
        result.setFont(Fontlabel);
        add(result);
        
        Hitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ProduksiModel salaryproduksi = new ProduksiModel();
                    salaryproduksi.idkar = Integer.parseInt(Jtid.getText());
                    salaryproduksi.name = Jtnama.getText();
                    salaryproduksi.jabatan = Jtjabatan.getText();
                    salaryproduksi.harikerja = Integer.parseInt(Jtharikerja.getText());
                    salaryproduksi.gajipokok = Integer.parseInt(Jtgajipokok.getText());
                    salaryproduksi.uangmakan = Integer.parseInt(Jtuangmakan.getText());
                    salaryproduksi.jamlembur = Integer.parseInt(Jtjamlembur.getText());
                    salaryproduksi.bpjs = Integer.parseInt(Jtbpjs.getText());
                    salaryproduksi.gajilembur = Integer.parseInt(Jtgajilembur.getText());
                    
                    salaryproduksi.gaji = (salaryproduksi.harikerja*salaryproduksi.gajipokok)+(salaryproduksi.harikerja*salaryproduksi.uangmakan)+(salaryproduksi.jamlembur*salaryproduksi.gajilembur);
                   salaryproduksi.totalgaji = salaryproduksi.gaji - salaryproduksi.bpjs;

                    result.setText("Rp."+salaryproduksi.totalgaji);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Input harus berupa angka!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + ex.getMessage());
                }
            }
        });
    }
    
}

