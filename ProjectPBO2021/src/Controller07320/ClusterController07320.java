/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller07320;
import java.util.Iterator;
import Entity07320.*;
import Model07320.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClusterController07320 implements ClusterControllerInterface07320{
    Map<ClusterEntity07320, List<RecordEntity07320>>clusterRecords = new HashMap<ClusterEntity07320, List<RecordEntity07320>>();
    String text;
    @Override
    public void initiateClusterAndCentroid(int clusterNumber){
        int counter = 1;
        
        Iterator<RecordEntity07320> iterator = AllObjectModel07320.modelrecord.getData().iterator();
        RecordEntity07320 record = null;
        
        while(iterator.hasNext()){
            record = iterator.next();
            if(counter <= clusterNumber){
                record.setClusterNumber(counter);
                initializeCluster(counter, record);
                counter++;
            }else{
                text+="" +record+"\n";
                text+=""+"** Cluster Information1 **"+"\n";
                for(ClusterEntity07320 cluster : AllObjectModel07320.modelcluster.getClusters()){
                    text+=""+cluster+"\n";
                }
                text+=""+"********************"+"\n";
                double minDistance = Integer.MAX_VALUE;
                ClusterEntity07320 whichCluster = null;
                
                for(ClusterEntity07320 cluster : AllObjectModel07320.modelcluster.getClusters()){
                    double distance = cluster.calculateDistance(record);
                    text+=""+cluster+"\n";
                    if(minDistance > distance){
                        minDistance = distance;
                        whichCluster = cluster;
                    }
                }
                
                record.setClusterNumber(whichCluster.getClusterNumber());
                whichCluster.updateCentroid(record);
                clusterRecords.get(whichCluster).add(record);
            }
            
            text+=""+"** Cluster Information1 **"+"\n";
            for(ClusterEntity07320 cluster : AllObjectModel07320.modelcluster.getClusters()){
                text+=""+cluster+"\n";
            }
            text+=""+"************************"+"\n";
        }
    }
    
    @Override
    public void initializeCluster(int clusterNumber, RecordEntity07320 record){
        ClusterEntity07320 cluster = new ClusterEntity07320(record.getTingkatKematian(),record.getJumlahKasus(),record.getPotensiPenularan(),clusterNumber);
        AllObjectModel07320.modelcluster.getClusters().add(cluster);
        List<RecordEntity07320> clusterRecord = new ArrayList<RecordEntity07320>();
        clusterRecord.add(record);
        clusterRecords.put(cluster, clusterRecord);
    }
    
    @Override
    public void FinalCluster(){
        text+="****** FINAL CLUSTER INFORMATIN ******\n";
        for(Map.Entry<ClusterEntity07320, List<RecordEntity07320>> entry : clusterRecords.entrySet()){
            text+="key="+entry.getKey()+
                    ",Value="+entry.getValue()+"\n";
        }
        for(RecordEntity07320 record : AllObjectModel07320.modelrecord.getData()){
            text+=""+record+"\n";
        }
    }
        @Override
        public String ViewDataCluster(){
        FinalCluster();
        return this.text;
    }
    }

    

    