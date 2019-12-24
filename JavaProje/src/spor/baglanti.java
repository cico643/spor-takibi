/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spor;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;







/**
 *
 * @author cico6
 */

public class baglanti {
    
        
        static Statement myStat;
        
        
        public Connection conn()  
        {
            try {  
            Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sportakip","root","1234");
            return myConn;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    
        public ArrayList<Takım> takımListele(String gelenspor, String gelenlig)
        {
            Connection myConn = conn();
            ArrayList<Takım> takimlar = new ArrayList<>();
            String sorgu = "select * from takim where spor_adi="+"'"+gelenspor+"' and "+"lig_adi="+"'"+gelenlig+"'";
            System.out.println(sorgu);
            
            
            try {
                Statement mystat= (Statement) myConn.createStatement();
                ResultSet myRs = (ResultSet) mystat.executeQuery(sorgu);
                while (myRs.next()) {
                    int takim_id = myRs.getInt("takim_id");
                    String takim_ad = myRs.getString("takim_ad");
                    int yil = myRs.getInt("kurulus_yili");
                    String spor = myRs.getString("spor_adi");
                    String lig = myRs.getString("lig_adi");
                    
                    Takım tkTemp = new Takım(takim_ad, yil, spor, lig, takim_id);
                    takimlar.add(tkTemp);
                    
                }
                
            } catch (Exception e) {
            e.printStackTrace();
            }
           
            return takimlar;
         }
        
        public void ekle(Takım tkTakım)
        {
            Connection myConn = conn();
            String ad = tkTakım.getTakimAdi();
            String yil = Integer.toString(tkTakım.getKurulusYili());
            String spor = tkTakım.getSporAdi();
            String lig = tkTakım.getLigAdi();
            String sorgu = "INSERT INTO takim (takim_ad,kurulus_yili,spor_adi,lig_adi,galibiyet,maglubiyet,beraberlik,puan) VALUES('"+ad+"',"+yil+
                    ",'"+spor+"','"+lig+"',"+"0,"+"0,"+"0,"+"0)";
            System.out.println(sorgu);
            
            try {
                Statement mystat = (Statement) myConn.createStatement();
                mystat.executeUpdate(sorgu);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
             
        }
        
        public void guncelle(Takım tkTakım){
            Connection myConn = conn();
            String id = Integer.toString(tkTakım.getTakim_id());
            System.out.println(id);
            String ad = tkTakım.getTakimAdi();
            String yil = Integer.toString(tkTakım.getKurulusYili());
            String spor = tkTakım.getSporAdi();
            String lig = tkTakım.getLigAdi();
            String sorgu = "UPDATE takim SET takim_ad='"+ad+"', kurulus_yili="+yil+", spor_adi='"+spor+"', lig_adi='"+lig+"'"+
                    " WHERE takim_id="+id;
             System.out.println(sorgu);
            try {
                Statement mystat = (Statement) myConn.createStatement();
                mystat.executeUpdate(sorgu);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
        public void sil(String id){
            Connection myConn = conn();
            String sorgu = "DELETE FROM takim WHERE takim_id="+id;
            try {
                Statement mystat = (Statement)myConn.createStatement();
                mystat.executeUpdate(sorgu);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    
        
        
        public ArrayList<TopluSporlar> macListele(String gelenspor, String gelenlig)
        {
            Connection myConn = conn();
            ArrayList<TopluSporlar> maclar = new ArrayList<>();
            String sorgu = "select * from mac where spor_adi="+"'"+gelenspor+"' and "+"lig_adi="+"'"+gelenlig+"'";
            System.out.println(sorgu);
            
            
            try {
                Statement mystat = (Statement) myConn.createStatement();
                ResultSet myRs = (ResultSet) mystat.executeQuery(sorgu);
                while (myRs.next()) {
                    int mac_id = myRs.getInt("mac_id");
                    String takim1_ad = myRs.getString("takim1_ad");
                    String takim2_ad = myRs.getString("takim2_ad");
                    int takim1_id = myRs.getInt("takim1_id");
                    int takim2_id = myRs.getInt("takim2_id");
                    int skor1 = myRs.getInt("skor1");
                    int skor2 = myRs.getInt("skor2");
                    String yer = myRs.getString("yer");
                    String tarih = myRs.getString("tarih");
                    String spor = myRs.getString("spor_adi");
                    String lig = myRs.getString("lig_adi");
                    
                    TopluSporlar mac = new TopluSporlar(takim1_id, takim2_id, takim1_ad, takim2_ad, skor1, skor2, yer, spor, lig, tarih, mac_id);
                    maclar.add(mac);
                    
                }
                
            } catch (Exception e) {
            e.printStackTrace();
            }
           
            return maclar;
         }
        
          public void macEkle(TopluSporlar mac)
        {
            Connection myConn = conn();
            String macid = Integer.toString(mac.getMac_id());
            String ad1 = mac.getTakim1ad();
            String ad2 = mac.getTakim2ad();
            String id1 = Integer.toString(mac.getTakim1id());
            String id2 = Integer.toString(mac.getTakim2id());
            String skor1 = Integer.toString(mac.getSkor1());
            String skor2 = Integer.toString(mac.getSkor2());
            String yer = mac.getYer();
            String tarih = mac.getTarih();
            String spor = mac.getSporAdi();
            String lig = mac.getLigAdi();
            String sorgu = "INSERT INTO mac (takim1_id,takim2_id,takim1_ad,takim2_ad,skor1,skor2,yer,tarih,spor_adi,lig_adi) VALUES("+id1+","+id2+
                    ",'"+ad1+"','"+ad2+"',"+skor1+","+skor2+",'"+yer+"','"+tarih+"','"+spor+"','"+lig+"')";
            System.out.println(sorgu);
            
            try {
                Statement mystat = (Statement) myConn.createStatement();
                mystat.executeUpdate(sorgu);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
             
        }
          
         public void macGuncelle(TopluSporlar mac){
            Connection myConn = conn();
            String macid = Integer.toString(mac.getMac_id());
            String ad1 = mac.getTakim1ad();
            String ad2 = mac.getTakim2ad();
            String id1 = Integer.toString(mac.getTakim1id());
            String id2 = Integer.toString(mac.getTakim2id());
            String skor1 = Integer.toString(mac.getSkor1());
            String skor2 = Integer.toString(mac.getSkor2());
            String yer = mac.getYer();
            String tarih = mac.getTarih();
            String spor = mac.getSporAdi();
            String lig = mac.getLigAdi();
            String sorgu = "UPDATE mac SET takim1_id="+id1+", takim2_id="+id2+", spor_adi='"+spor+"', lig_adi='"+lig+"', takim1_ad='"+ad1+"', takim2_ad='"+ad2+"', skor1="+skor1+
                    ", skor2="+skor2+", yer='"+yer+"', tarih='"+tarih+"' WHERE mac_id="+macid;
            try {
                Statement mystat = (Statement) myConn.createStatement();
                mystat.executeUpdate(sorgu);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
         
         public void macSil(String id){
            Connection myConn = conn();
            String sorgu = "DELETE FROM mac WHERE mac_id="+id;
            try {
                Statement mystat = (Statement)myConn.createStatement();
                mystat.executeUpdate(sorgu);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
}
