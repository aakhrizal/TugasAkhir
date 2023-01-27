/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author Akhrizal
 */
public class Pegawai {

    private int idkar;
    private String nama;
    private String kelamin;
    private String alamat;
    private String jabatan;
    private String notelp;

    public Pegawai(int idkar, String nama, String kelamin, String alamat, String jabatan, String notelp) {
        this.idkar = idkar;
        this.nama = nama;
        this.kelamin = kelamin;
        this.alamat = alamat;
        this.jabatan = jabatan;
        this.notelp = notelp;
    }
    
    public String getKelamin() {
        return kelamin;
    }

    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }

    
    public int getIdkar() {
        return idkar;
    }

    public void setIdkar(int idkar) {
        this.idkar = idkar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

}
