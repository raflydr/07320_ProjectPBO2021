/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model07320;
//import Entity07320.ClusterEntity07320;
import java.util.ArrayList;
import java.util.List;
import Entity07320.ClusterEntity07320;

public class ModelCluster07320 {
    List<ClusterEntity07320> clusters = new ArrayList<ClusterEntity07320>();

    public void setClusters(List<ClusterEntity07320>clusters){
        this.clusters = clusters;
    }
    public List<ClusterEntity07320> getClusters(){
        return clusters;
    }
}
