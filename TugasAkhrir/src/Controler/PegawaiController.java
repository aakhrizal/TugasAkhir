/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

/**
 *
 * @author Akhrizal
 */
import Entity.Pegawai;
import java.util.ArrayList;
import java.util.Scanner;

public class PegawaiController {
    private ArrayList<Pegawai> pegawaiList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void create() {
        System.out.print("ID karyawan: ");
        int idkar = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Jenis Kelamin: ");
        String kelamin = scanner.nextLine();
        System.out.print("Alamat: ");
        String alamat = scanner.nextLine();
        System.out.print("Jabatan: ");
        String jabatan = scanner.nextLine();
        System.out.print("No. Telp: ");
        String notelp = scanner.nextLine();

        pegawaiList.add(new Pegawai(idkar, nama, kelamin, alamat, jabatan, notelp));
                }
        
    public void read() {
        for (Pegawai pegawai : pegawaiList) {
            System.out.println("ID karyawan: " + pegawai.getIdkar());
            System.out.println("Nama: " + pegawai.getNama());
            System.out.println("Jenis Kelamin: " + pegawai.getKelamin());
            System.out.println("Alamat: " + pegawai.getAlamat());
            System.out.println("Jabatan: " + pegawai.getJabatan());
            System.out.println("No. Telp: " + pegawai.getNotelp());
            System.out.println("-----------------");
        }
    }

    public void update() {
        System.out.print("ID karyawan yang akan diupdate: ");
        int idkar = scanner.nextInt();
        scanner.nextLine();

        for (Pegawai pegawai : pegawaiList) {
            if (pegawai.getIdkar() == idkar) {
                System.out.print("Nama baru: ");
                String nama = scanner.nextLine();
                pegawai.setNama(nama);

                System.out.print("Jenis Kelamin baru: ");
                String kelamin = scanner.nextLine();
                pegawai.setKelamin(kelamin);

                System.out.print("Alamat baru: ");
                String alamat = scanner.nextLine();
                pegawai.setAlamat(alamat);

                System.out.print("Jabatan baru: ");
                String jabatan = scanner.nextLine();
                pegawai.setJabatan(jabatan);

                System.out.print("No. Telp baru: ");
                String notelp = scanner.nextLine();
                pegawai.setNotelp(notelp);
            }
        }
    }

    public void delete() {
        System.out.print("ID karyawan yang akan dihapus: ");
        int idkar = scanner.nextInt();

        for (int i = 0; i < pegawaiList.size(); i++) {
            if (pegawaiList.get(i).getIdkar() == idkar) {
                pegawaiList.remove(i);
               break;
            }
        }
   }
}
