/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller07320;
import Entity07320.*;
import Model07320.*;

public class RecordController07320 implements RecordControllerInterface07320 {

    private int index;
    @Override
    public void InsertRecord(String provinsi, int TingkatKematian, int JumlahKasus, int PotensiPenularan){
        AllObjectModel07320.modelrecord.getData().add(index, new RecordEntity07320(provinsi, TingkatKematian, JumlahKasus, PotensiPenularan));
    }
    
    @Override
    public void DeleteRecord(int Index){
        AllObjectModel07320.modelrecord.getData().remove(Index);
    }
    
    @Override
    public String ViewDataRecord(){
        String text;
        text = "Provinsi\tTingkat Kematian\tJumlah Kasus\tPotensi Penularan\n";
        for(int i=0; i<AllObjectModel07320.modelrecord.getData().size(); i++){
            text+="" + AllObjectModel07320.modelrecord.getData().get(i).getProvinsi() 
                    +"\t\t" + AllObjectModel07320.modelrecord.getData().get(i).getTingkatKematian()
                    +"\t\t\t" + AllObjectModel07320.modelrecord.getData().get(i).getJumlahKasus()
                     +"\t\t" + AllObjectModel07320.modelrecord.getData().get(i).getPotensiPenularan()+"\n";
        }
        return text;
    }

    @Override
    public void UpdateRecord(int index, String provinsi, int TingkatKematian, int JumlahKasus, int PotensiPenularan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
