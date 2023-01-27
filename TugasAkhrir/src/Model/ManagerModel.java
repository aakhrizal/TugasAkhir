/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Akhrizal
 */
import Entity.Gaji;
public class ManagerModel extends Gaji {
    
    @Override
    public void hitunggaji(){
        gaji = ((gajipokok*harikerja)+(uangmakan*harikerja)+bonus);
        totalgaji = gaji - (bpjs+potpajak);
    }
    
}
