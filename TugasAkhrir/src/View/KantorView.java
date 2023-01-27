/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author Akhrizal
 */
import Model.KantorModel;
import java.util.Scanner;
public class KantorView {
    Scanner input = new Scanner(System.in);
    KantorModel salarykaryawan = new KantorModel();
    
    public void isi(){
        System.out.print("Masukan Id Karyawan :");
        salarykaryawan.idkar = input.nextInt();
        System.out.print("Masukan Nama :");
        salarykaryawan.name = input.next();
        System.out.print("Masukan Jabatan : ");
        salarykaryawan.jabatan = input.next();
        System.out.print("Masukan Jumlah Hari Kerja : ");
        salarykaryawan.harikerja = input.nextInt();
        System.out.print("Masukan Gaji Pokok :Rp. ");
        salarykaryawan.gajipokok = input.nextInt();
        System.out.print("Masukan Uang Makan :Rp. ");
        salarykaryawan.uangmakan = input.nextInt();
        System.out.print("Masukan Uang Transport :Rp. ");
        salarykaryawan.transport = input.nextInt();
        System.out.print("Masukan BPJS :Rp.");
        salarykaryawan.bpjs = input.nextInt();
        System.out.print("Masukan Pinjaman : Rp.");
        salarykaryawan.pinjaman = input.nextInt();
    }
    
    public void tampil(){
        System.out.println("Gaji Bulan ini "+salarykaryawan.totalgaji);
    }
    
}
