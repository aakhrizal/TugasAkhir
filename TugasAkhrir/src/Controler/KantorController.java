/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

/**
 *
 * @author Akhrizal
 */
import View.KantorView;
public class KantorController {
    KantorView pegawaikantor = new KantorView();
     public void penghasilankantor() {
         pegawaikantor.isi();
         pegawaikantor.tampil();
     }
}
