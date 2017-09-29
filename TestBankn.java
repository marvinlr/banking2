package bank;
import bank.*;
public class TestBankn {
 public static void main(String[]args){
     Bank client=new Bank();
     client.addCostumer("jose"," simons"); 
     client.addCostumer("owen"," bryant"); 
     client.addCostumer("tim"," soley");
     client.addCostumer("maria"," soley");
     for(int i=0;i<client.getNumberOfCostumer();i++){
     System.out.println("\ncostumer ["+(i+1)+"] is "+client.getCostumer(i).getLastName()+","+client.getCostumer(i).getFristName());
     }
 }  
}
