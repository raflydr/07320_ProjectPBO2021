/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller07320;
import Entity07320.RecordEntity07320;

public interface RecordControllerInterface07320 {
    public void InsertRecord(String provinsi, int TingkatKematian, int JumlahKasus, int PotensiPenularan);
    public void UpdateRecord(int index, String provinsi, int TingkatKematian, int JumlahKasus, int PotensiPenularan);
    public void DeleteRecord(int index);
    public String ViewDataRecord();
}
