/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity07320;

/**
 *
 * @author RAFLY
 */
public class RecordEntity07320 {
    private String provinsi;
    private int TingkatKematian;
    private int JumlahKasus;
    private int PotensiPenularan;
    private int clusterNumber;
    
    public RecordEntity07320(String provinsi, int TingkatKematian, int JumlahKasus, int PotensiPenularan){
        super();
        this.provinsi = provinsi;
        this.TingkatKematian = TingkatKematian;
        this.JumlahKasus = JumlahKasus;
        this.PotensiPenularan = PotensiPenularan;
    }
    
    public String getProvinsi(){
        return provinsi;
    }
    public int getTingkatKematian(){
        return TingkatKematian;
    }
    public int getJumlahKasus(){
        return JumlahKasus;
    }
    public int getPotensiPenularan(){
        return PotensiPenularan;
    }
    public int getClusterNumber(){
        return clusterNumber;
    }
    
    public void setClusterNumber(int clusterNumber){
        this.clusterNumber = clusterNumber;
    }
    
    @Override
    public String toString(){
        return "Record [Provinsi=" + provinsi + ",TingkatKematian=" + TingkatKematian + ",JumlahKasus=" + JumlahKasus + ",PotensiPenularan=" + PotensiPenularan + ",clusterNumber=" + clusterNumber + "]";
    }
}
