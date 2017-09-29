package bank;
import bank.*;
public class Costumer {
 private String fristName;
 private String lastName;
 private Account account;
 public Costumer(String f,String l){
     fristName=f;
     lastName=l;
 }

    public String getFristName() {
        return fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }
 public void setAccount(Account account){
     this.account=account;
 } 
}
