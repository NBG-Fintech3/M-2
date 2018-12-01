/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evalueate;

/**
 *
 * @author JIM
 */
public class Account {
    
    private static int BankID=0;
    private String firstname,lastname;
    private double value;
    private boolean hasLoans;
    private static int tCode=0;
    
    public Account(String firstname,String lastname,double value,boolean hasLoans){
        this.firstname=firstname;
        this.lastname=lastname;
        this.value=value;
        this.hasLoans=hasLoans;
        BankID++;
    }
    public String getFirstname(){
        return firstname;
    } 
    public String getLastname(){
        return lastname;
    } 
    public double getValue(){
        return value;
    }
    public boolean getLoans(){
        return hasLoans;
    }
    
    public void setFirstname(String firstname){
        this.firstname=firstname;
    }
    public void setLastname(String lastname){
        this.lastname=lastname;
    }
    public void setValue(double value){
        this.value=value;
    }
    public void setLoans(boolean hasLoans){
        this.hasLoans=hasLoans;
    }
    public void setBankID(int BankID){
        this.BankID=BankID;
    }
    public int getBankID(){
        return BankID;
    }
    public int getTCode(){
        return tCode;
    }
    public String toString(){
        return "Transaction Code: "+tCode +"Firstname: "+firstname+ " Lastname: "+lastname+ " Account Balance:" + value;
    }
}
