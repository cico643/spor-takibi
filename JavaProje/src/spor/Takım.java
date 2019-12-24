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
public class Takım extends SporMüsabakaları{
    private String takimAdi;
    private int takim_id,kurulusYili,galibiyet=0,maglubilyet=0,beraberlik=0,puan=0;
    
    
    public Takım() {
    }
    
    public Takım(String takimAdi, int kurulusYili, String sporAdi, String ligAdi, int takim_id) {
        super(sporAdi, ligAdi);
        this.takimAdi = takimAdi;
        this.kurulusYili = kurulusYili;
        this.takim_id= takim_id;
    }
    
    public Takım(String takimAdi, int kurulusYili, String sporAdi, String ligAdi) {
        super(sporAdi, ligAdi);
        this.takimAdi = takimAdi;
        this.kurulusYili = kurulusYili;
       
    }

    public int getTakim_id() {
        return takim_id;
    }

    public void setTakim_id(int takim_id) {
        this.takim_id = takim_id;
    }

    
    
    public String getTakimAdi() {
        return takimAdi;
    }

    public void setTakimAdi(String takimAdi) {
        this.takimAdi = takimAdi;
    }

    public int getKurulusYili() {
        return kurulusYili;
    }

    public void setKurulusYili(int kurulusYili) {
        this.kurulusYili = kurulusYili;
    }

    public int getGalibiyet() {
        return galibiyet;
    }

    public void setGalibiyet(int galibiyet) {
        this.galibiyet = galibiyet;
    }

    public int getMaglubilyet() {
        return maglubilyet;
    }

    public void setMaglubilyet(int maglubilyet) {
        this.maglubilyet = maglubilyet;
    }

    public int getBeraberlik() {
        return beraberlik;
    }

    public void setBeraberlik(int beraberlik) {
        this.beraberlik = beraberlik;
    }

    public int getPuan() {
        return puan;
    }

    public void setPuan(int puan) {
        this.puan = puan;
    }
    
    
    
}
