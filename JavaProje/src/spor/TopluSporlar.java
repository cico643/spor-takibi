/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spor;

/**
 *
 * @author cihat
 */
public class TopluSporlar extends SporMüsabakaları{
    
    private int takim1id,takim2id;
    private String takim1ad,takim2ad;
    private int skor1,skor2,mac_id;


    
    public TopluSporlar(int takim1id, int takim2id,String takim1ad,String takim2ad, int skor1, int skor2, String yer, String sporAdi, String ligAdi, String tarih, int mac_id) {
        super(yer, sporAdi, ligAdi, tarih);
        this.takim1id = takim1id;
        this.takim2id = takim2id;
        this.takim2ad = takim2ad;
        this.takim1ad = takim1ad;
        this.skor1 = skor1;
        this.skor2 = skor2;
        this.mac_id = mac_id;
    }

    public int getMac_id() {
        return mac_id;
    }

    public void setMac_id(int mac_id) {
        this.mac_id = mac_id;
    }

    public int getTakim1id() {
        return takim1id;
    }

    public void setTakim1id(int takim1id) {
        this.takim1id = takim1id;
    }

    public int getTakim2id() {
        return takim2id;
    }

    public void setTakim2id(int takim2id) {
        this.takim2id = takim2id;
    }

    public String getTakim1ad() {
        return takim1ad;
    }

    public void setTakim1ad(String takim1ad) {
        this.takim1ad = takim1ad;
    }

    public String getTakim2ad() {
        return takim2ad;
    }

    public void setTakim2ad(String takim2ad) {
        this.takim2ad = takim2ad;
    }

    
   
    

    public int getSkor1() {
        return skor1;
    }

    public void setSkor1(int skor1) {
        this.skor1 = skor1;
    }

    public int getSkor2() {
        return skor2;
    }

    public void setSkor2(int skor2) {
        this.skor2 = skor2;
    }
    
   
    
}
