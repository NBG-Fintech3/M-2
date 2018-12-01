/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evalueate;
import java.util.Scanner;
/**
 *
 * @author JIM
 */
public class EValueate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String firstname="Giannis",lastname="Papageorgiou";
        Scanner input = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Welcome to e-Valueate \n Please enter your credentials");
        System.out.println("Username");
        String username= input.nextLine();
        System.out.println("Password:");
        String password= input.nextLine();
        System.out.println("Enter product ID:");
       // int prodID=Integer.parseInt(input.nextLine()); 
        Account ac=new Account(firstname,lastname,2500.5,false);
        Customer c1=new Customer(firstname,lastname,"user1","123",ac);
        
        Product p;
        p = new Product("Frapedomachine","Nescafe Frape maker",25.0);
        System.out.println(c1.toString());
        if(p.getValue()<c1.getAcc().getValue()){
            System.out.println("Ok.We allow you to pay us in 1 week...");
        }else{
            System.out.println("Sorry... Insufficient funds in bank or too many loans.Please pay to the cashier...");
        }
        
    }
    
}
