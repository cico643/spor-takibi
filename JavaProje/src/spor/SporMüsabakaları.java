package spor;
import java.sql.Date;
import java.util.ArrayList;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cihat
 */




public class SporMüsabakaları {
   private String yer,sporAdi,ligAdi;
   private String tarih;
    ArrayList<Takım> takımlistesi=new ArrayList<Takım>();
    ArrayList<TopluSporlar> toplu_spor_mac_listesi=new ArrayList<TopluSporlar>();
    public SporMüsabakaları() {
    }

   
    //Musabakalar icin olusturulan constructor.
    public SporMüsabakaları(String yer, String sporAdi, String ligAdi, String tarih) {
        this.yer = yer;
        this.sporAdi = sporAdi;
        this.ligAdi = ligAdi;
        this.tarih = tarih;
    }

    
    //Takım sınıfı için constructor.
    public SporMüsabakaları(String sporAdi, String ligAdi) {
        this.sporAdi = sporAdi;
        this.ligAdi = ligAdi;
    }
        
    
    public void takimEkle(Takım t) {
        if (!takımlistesi.contains(t)) {
            takımlistesi.add(t);
        }
    }
    
     public void topluSporMaciEkle(TopluSporlar ft1) {
        if (!toplu_spor_mac_listesi.contains(ft1)) {
            toplu_spor_mac_listesi.add(ft1);
        }
    }

    public String getYer() {
        return yer;
    }

    public void setYer(String yer) {
        this.yer = yer;
    }

    public String getSporAdi() {
        return sporAdi;
    }

    public void setSporAdi(String sporAdi) {
        this.sporAdi = sporAdi;
    }

    public String getLigAdi() {
        return ligAdi;
    }

    public void setLigAdi(String ligAdi) {
        this.ligAdi = ligAdi;
    }

    public String getTarih() {
        return tarih.toString();
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    

  
    
    
   
   
}


