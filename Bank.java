package bank;
import bank.*;
public class Bank {
 private Costumer[] costumer;
 private int numberOfCostumer;
 public Bank(){
     costumer=new Costumer[5];
 }

    public Costumer getCostumer(int index) {
        return costumer[index];
    }

    public int getNumberOfCostumer() {
        return numberOfCostumer;
    }
    public int addNunverOfCostumer(){
        return numberOfCostumer++;
    }
    public void addCostumer(String f, String l){
        int i=addNunverOfCostumer();
        costumer[i]=new Costumer(f,l);
    }
 
}
