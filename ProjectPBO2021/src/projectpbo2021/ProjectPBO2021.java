/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpbo2021;
import Controller07320.AllObjectController07320;
import Model07320.AllObjectModel07320;
import java.util.Scanner;

public class ProjectPBO2021 {
static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int pil;
        do{
            System.out.println("1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. View Hasil Clustering");
            System.out.println("0. Exit");
            System.out.print("Pilih->");
            
            pil = input.nextInt();
            switch(pil){
                case 1:
                    InputDataRecord();
                    System.out.println(AllObjectController07320.recordcontroller.ViewDataRecord());
                    break;
                case 2:
                    UpdateDataRecord();
                    System.out.println(AllObjectController07320.recordcontroller.ViewDataRecord());
                    break;
                case 3:
                    delete();
                    System.out.println(AllObjectController07320.recordcontroller.ViewDataRecord());
                    break;
                case 4:
                    AllObjectController07320.clustercontroller.initiateClusterAndCentroid(3);
                    System.out.println(AllObjectController07320.clustercontroller.ViewDataCluster());
                    break;
            }
        }while(pil!=0);       
    }
    
    static void InputDataRecord(){
        System.out.print("Provinsi = ");
        String provinsi = input.next();
        System.out.print("Tingkat Kematian = ");
        int tingkatkematian = input.nextInt();
        System.out.print("Jumlah Kasus = ");
        int jumlahkasus = input.nextInt();
        System.out.print("Potensi Penularan = ");
        int potensipenularan = input.nextInt();
        AllObjectController07320.recordcontroller.InsertRecord(provinsi, tingkatkematian, jumlahkasus, potensipenularan);
        System.out.println("Data Berhasil Di Insert");
    }
    
    static void UpdateDataRecord(){
        boolean ketemu = false;
        int index = 0;
        System.out.print("Provinsi yang diupdate = ");
        String provinsicek = input.next();
        for(int i=0; i<AllObjectModel07320.modelrecord.getData().size(); i++){
            if(provinsicek.equals(AllObjectModel07320.modelrecord.getData().get(i).getProvinsi())){
                ketemu = true;
                index = i;
            }
        }
        if(ketemu == true){
            System.out.print("Provinsi = ");
            String provinsi = input.next();
            System.out.print("Tingkat Kematian = ");
            int tingkatkematian = input.nextInt();
            System.out.print("Jumlah Kasus = ");
            int jumlahkasus = input.nextInt();
            System.out.print("Potensi Penularan = ");
            int potensipenularan = input.nextInt();
            AllObjectController07320.recordcontroller.UpdateRecord(index, provinsi, tingkatkematian, jumlahkasus, potensipenularan);
            System.out.println("Data Berhasil di Update");
        }else{
            System.out.println("Data Tidak Ada");
        }
    }
    
    static void delete(){
        boolean ketemu = false;
        int index = 0;
        System.out.println("Provinsi yang didelete = ");
        String provinsicek = input.next();
        for(int i=0; i<AllObjectModel07320.modelrecord.getData().size(); i++){
            if(provinsicek.equals(AllObjectModel07320.modelrecord.getData().get(i).getProvinsi())){
                ketemu = true;
                index = i;
            }
        }
        if(ketemu == true){
            AllObjectController07320.recordcontroller.DeleteRecord(index);
            System.out.println("Data Berhasil Di Delete");
        }else{
            System.out.println("Data Tidak Ada");
        }
    }
}
