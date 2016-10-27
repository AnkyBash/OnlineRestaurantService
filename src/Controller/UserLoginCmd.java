/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import User.Customer;
import java.util.Scanner;
/**
 *
 * @author ankit
 */
public class UserLoginCmd implements Command 
{
   private Customer customer;

   public UserLoginCmd(Customer customer){
      this.customer = customer;
   }

   @Override
   public void execute() {
       
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Enter Username Please : ");
       String name = scanner.nextLine();
       customer.setName(name);
       
       System.out.print("Enter Password Please : ");
       String password = scanner.nextLine();       
       customer.setPassword(password);
       
       if(customer.login())
       {
        System.out.println("Login Successfull "+customer.getName());
       }
       else
        System.out.println("Wrong Credentials : Try Again !");   
   }
   
   @Override
   public void undo()
   {
    System.out.println("No undo for userLoginCmd");
   }
}
