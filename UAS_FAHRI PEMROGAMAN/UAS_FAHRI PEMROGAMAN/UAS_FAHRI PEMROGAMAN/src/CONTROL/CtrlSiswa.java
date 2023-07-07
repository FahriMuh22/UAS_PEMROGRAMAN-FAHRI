/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROL;

import MODEL.Siswa;
import VIEW.FromSiswa;

/**
 *
 * @author FAHRI MUHAMMAD
 */
public class CtrlSiswa {
    private Siswa sis;
    private FromSiswa tampil;
    
    public CtrlSiswa(FromSiswa tampil){
        this.tampil = tampil;
    }
    public void proses (){
        sis = new Siswa ();
        sis.setNisn(tampil.getTxtNisn().getText());
        sis.setNama(tampil.getTxtNama().getText());
        sis.setPraktek(Integer.parseInt(tampil.getTxtpraktek().getText()));
        sis.setTulisan(Integer.parseInt(tampil.getTxttulisan().getText()));
        sis.setLisan(Integer.parseInt(tampil.getTxtlisan().getText()));
        
        sis.setRata((sis.getPraktek()+sis.getTulisan()+ sis.getLisan())/3);
        
        if(sis.getRata()>=75){
            sis.setKompetensi("KOPETENSI");
        }else{
            sis.setKompetensi("TIDAK KOPETENSI");
        }
        
        tampil.getTxthasil().setText("====== HASIL KELULUSAN ========\n"
                                    +"NISN : "+sis.getNisn()+"\n"
                                    +"NAMA :"+sis.getNama()+"\n"
                                    +"PRAKTEK :"+sis.getPraktek()+"\n"
                                    +"TULISAN :"+sis.getTulisan()+"\n"
                                    +"LISAN :"+sis.getLisan()+"\n"
                                    +"Rata-Rata :"+sis.getRata()+"\n"
                                    +"ANDA DINYATAKAN "+sis.getKompetensi()+"\n"
                                    +"===================================");  
    } 
    
    public void reset(){
        tampil.getTxtNisn().setText("");
        tampil.getTxtNama().setText("");
        tampil.getTxtpraktek().setText("0");
        tampil.getTxttulisan().setText("0");
        tampil.getTxtlisan().setText("0");
        tampil.getTxthasil().setText("");
    }
}
