/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;



/**
 *
 * @author Akhrizal
 */
import Model.ProduksiModel;
import java.util.Scanner;

public class ProduksiView {
    Scanner input = new Scanner(System.in);
    ProduksiModel salaryproduksi = new ProduksiModel();
    
    public void isi(){
        System.out.print("Masukan Id Karyawan :");
        salaryproduksi.idkar = input.nextInt();
        System.out.print("Masukan Nama :");
        salaryproduksi.name = input.next();
        System.out.print("Masukan Jabatan : ");
        salaryproduksi.jabatan = input.next();
        System.out.print("Masukan Jumlah Hari Kerja : ");
        salaryproduksi.harikerja = input.nextInt();
        System.out.print("Masukan Gaji Pokok :Rp. ");
        salaryproduksi.gajipokok = input.nextInt();
        System.out.print("Masukan Uang Makan :Rp. ");
        salaryproduksi.uangmakan = input.nextInt();
        System.out.print("Masukan Uang Transport :Rp. ");
        salaryproduksi.transport = input.nextInt();
        System.out.print("Masukan BPJS :Rp.");
        salaryproduksi.bpjs = input.nextInt();
        System.out.print("Masukan Pinjaman : Rp.");
        salaryproduksi.pinjaman = input.nextInt();
    }
    
    public void tampil(){
        System.out.println("Gaji Bulan ini "+salaryproduksi.totalgaji);
    }
    
}
