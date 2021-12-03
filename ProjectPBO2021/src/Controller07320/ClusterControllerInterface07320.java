/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller07320;
import Entity07320.RecordEntity07320;

public interface ClusterControllerInterface07320 {
    public void initiateClusterAndCentroid(int clusterNumber);
    public void initializeCluster(int clusterNumber, RecordEntity07320 record);
    public void FinalCluster();
    public String ViewDataCluster();
}
