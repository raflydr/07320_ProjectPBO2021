/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model07320;
//import Entity07320.ClusterEntity07320;
import java.util.ArrayList;
import java.util.List;
import Entity07320.RecordEntity07320;

public class ModelRecord07320 {
    private List<RecordEntity07320> data = new ArrayList<RecordEntity07320>();
    //private List<RecordEntity07320> data;
    
    public void setData(List <RecordEntity07320> data){
        this.data = data;
    }
    
    public List<RecordEntity07320> getData(){
        return data;
    }
}
