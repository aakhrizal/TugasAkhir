/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

/**
 *
 * @author Akhrizal
 */
import View.ManagerView;
public class ManagerController {
    ManagerView manager = new ManagerView();
    
    public void penghasilanmanager(){
        manager.isi();
        manager.tampil();
    }
    
}
