/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author Akhrizal
 */
import Model.ManagerModel;
import java.util.Scanner;
public class ManagerView {
    Scanner input = new Scanner(System.in);
    ManagerModel salarymanager = new ManagerModel(); 
   
    public void isi(){
        System.out.print("Masukan Id Karyawan :");
        salarymanager.idkar = input.nextInt();
        System.out.print("Masukan Nama :");
        salarymanager.name = input.next();
        System.out.print("Masukan Jabatan : ");
        salarymanager.jabatan = input.next();
        System.out.print("Masukan Jumlah Hari Kerja : ");
        salarymanager.harikerja = input.nextInt();
        System.out.print("Masukan Gaji Pokok :Rp. ");
        salarymanager.gajipokok = input.nextInt();
        System.out.print("Masukan Uang Makan :Rp. ");
        salarymanager.uangmakan = input.nextInt();
        System.out.print("Masukan Bonus Bulanan :Rp. ");
        salarymanager.bonus = input.nextInt();
        System.out.print("Masukan BPJS :Rp.");
        salarymanager.bpjs = input.nextInt();
        System.out.print("Masukan Potongan Pajak : Rp.");
        salarymanager.pajak = input.nextInt();
    }
    
    public void tampil(){
        System.out.println("Gaji Bulan ini "+salarymanager.totalgaji);
    }
}
