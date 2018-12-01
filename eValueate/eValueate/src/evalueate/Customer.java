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
    private String lastname,firstname,password;
    private static int id=0;
    private int loans;
    private Account acc;
    private boolean owes;
    
    public Customer(String firstname,String lastname,String password,int loans){
        this.firstname=firstname;
        this.lastname=lastname;
        this.password=password;
        this.loans=loans;
        id++;
    }
    public String getlastName(){
        return lastname;
    }
    public String getfirstName(){
        return firstname;
    }
    public String getPassword(){
        return password;
    }
    public int getLoans(){
        return loans;
    }
    public int getID(){
        return id;
    }
    public void setFirstname(String firstname){
        this.firstname=firstname;
    }
    public void setLastname(String lastname){
        this.lastname=lastname;
    }
    public void setLoans(int loans){
        this.loans=loans;
    }
    public void setPassword(String password){
        this.password=password;
    }

    public boolean evaluate(Account acc,Product p){
        if(acc.getValue()>(1/3)*p.getValue()&& !acc.getLoans()){
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
}
