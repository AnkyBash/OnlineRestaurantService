/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import User.Customer;
/**
 *
 * @author ankit
 */
public class UserLogoutCmd implements Command
{
    
    private Customer customer;

    public UserLogoutCmd(Customer customer)
    {
      this.customer = customer;
    }

    @Override
    public void execute() 
    {
       if(customer.logout())
       {
        System.out.println("Logout Successfully..");
       }
       else
        System.out.println("System Error..Can't Logout");   
    }
   
    @Override
    public void undo()
    {
     System.out.println("No undo for userLogoutCmd");
    }    
    
}
