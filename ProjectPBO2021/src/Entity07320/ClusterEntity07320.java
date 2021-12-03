/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity07320;


public class ClusterEntity07320 {
    private int TingkatKematianCentroid;
    private int JumlahKasusCentroid;
    private int PotensiPenularan;
    private int clusterNumber;
    
    public ClusterEntity07320(int TIngkatKematianCentroid, int JumlahKasusCentroid, int PotensiPenularan, int clusterNumber){
        super();
        this.TingkatKematianCentroid = TingkatKematianCentroid;
        this.JumlahKasusCentroid = JumlahKasusCentroid;
        this.PotensiPenularan = PotensiPenularan;
        this.clusterNumber = clusterNumber;
    }
    
    public int getTingkatKematianCentroid(){
        return TingkatKematianCentroid;
    }
    public int getJumlahKasusCentroid(){
        return JumlahKasusCentroid;
    }
    public int getPotensiPenularan(){
        return PotensiPenularan;
    }
    public int getClusterNumber(){
        return clusterNumber;
    }
    
    public void setTingkatKematianCentroid(int TingkatKematianCentroid){
        this.TingkatKematianCentroid = TingkatKematianCentroid;
    }
    public void setJumlahKasusCentroid(int JumlahKasusCentroid){
        this.JumlahKasusCentroid = JumlahKasusCentroid;
    }
    public void setPotensiPenularan(int PotensiPenularan){
        this.PotensiPenularan = PotensiPenularan; 
    }
    public void setClusterNumber(int clusterNumber){
        this.clusterNumber = clusterNumber;
    }
    
    public double calculateDistance(RecordEntity07320 record){
        return Math.sqrt(Math.pow((getTingkatKematianCentroid() - record.getTingkatKematian()),2) 
                + Math.pow((getJumlahKasusCentroid() - record.getJumlahKasus()),2) 
                + Math.pow((getPotensiPenularan() - record.getPotensiPenularan()),2));
    }
    
    public void updateCentroid(RecordEntity07320 record){
        setTingkatKematianCentroid((getTingkatKematianCentroid() + record.getTingkatKematian())/2);
        setJumlahKasusCentroid((getJumlahKasusCentroid() + record.getJumlahKasus())/2);
        setPotensiPenularan((getPotensiPenularan() + record.getPotensiPenularan())/2);
    }
    
    @Override
    public String toString(){
        return "Cluster [TingkatKematianCentroid=" + TingkatKematianCentroid + 
                ",JumlahKasusCentroid=" + JumlahKasusCentroid + ",PotensiPenularan=" + PotensiPenularan + 
                ",clusterNumber=" + clusterNumber + "]";
    }

}
