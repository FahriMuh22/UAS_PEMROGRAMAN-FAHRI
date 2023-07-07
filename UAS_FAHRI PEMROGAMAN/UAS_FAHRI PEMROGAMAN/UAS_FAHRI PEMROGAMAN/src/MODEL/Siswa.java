/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author FAHRI MUHAMMAD
 */
public class Siswa {
    private String nisn;
    private String nama;
    private int praktek;
    private int tulisan;
    private int lisan;
    private float rata;
    private String kompetensi;

    public String getNisn() {
        return nisn;
    }

    public String getNama() {
        return nama;
    }

    public int getPraktek() {
        return praktek;
    }

    public int getTulisan() {
        return tulisan;
    }

    public int getLisan() {
        return lisan;
    }

    public float getRata() {
        return rata;
    }

    public String getKompetensi() {
        return kompetensi;
    }

    public void setNisn(String nisn) {
        this.nisn = nisn;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPraktek(int praktek) {
        this.praktek = praktek;
    }

    public void setTulisan(int tulisan) {
        this.tulisan = tulisan;
    }

    public void setLisan(int lisan) {
        this.lisan = lisan;
    }

    public void setRata(float rata) {
        this.rata = rata;
    }

    public void setKompetensi(String kompetensi) {
        this.kompetensi = kompetensi;
    }
    
    
}
