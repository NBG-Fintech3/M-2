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
public class Customer {
    private String lastname,firstname,username,password;
    private static int id=0;
    private Account acc;
    private boolean owes;
    
    public Customer(String firstname,String lastname,String username,String password,Account acc){
        this.firstname=firstname;
        this.lastname=lastname;
        this.username=username;
        this.password=password;
        this.acc=acc;
        id++;
    }
    public Account getAcc(){
        return acc;
    }
    public String getlastName(){
        return lastname;
    }
    public String getUsername(){
        return username;
    }
    public String getfirstName(){
        return firstname;
    }
    public String getPassword(){
        return password;
    }
    public int getID(){
        return id;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public void setFirstname(String firstname){
        this.firstname=firstname;
    }
    public void setLastname(String lastname){
        this.lastname=lastname;
    }
    public void setPassword(String password){
        this.password=password;
    }

    public boolean evaluate(Account acc,Product p){
        if(acc.getValue()>(1/3)*p.getValue()+0.08*p.getValue()&& !acc.getLoans()){
            return true;
        }
        else{
            return false;
        }
    }

    public void payUp(){
        this.owes=false;
    }
    public void commits(){
        this.owes=true;
    }
    
    public String toString(){
        return "Firstname: "+ firstname + " Lastname: " + lastname + "Account Balance: " +acc.getValue();
    }
}
