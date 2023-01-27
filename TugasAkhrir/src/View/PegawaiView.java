/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;



/**
 *
 * @author Akhrizal
 */
import Entity.Pegawai;
import Controler.PegawaiController;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.Scanner;

public class PegawaiView {
    private static Scanner scanner = new Scanner(System.in);
    private static PegawaiController controller = new PegawaiController(); 

    public void menu(){
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah karyawan");
            System.out.println("2. Tampilkan karyawan");
            System.out.println("3. Update karyawan");
            System.out.println("4. Hapus karyawan");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    controller.create();
                    break;
                case 2:
                    controller.read();
                    break;
                case 3:
                    controller.update();
                    break;
                case 4:
                    controller.delete();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (choice != 5);
    }
    }
