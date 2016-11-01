/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Scanner;
import Organisation.Organisation;
import Restaurant.Restaurant;
import java.util.List;
/**
 *
 * @author ankit
 */
public class ShowMenuCommand implements Command
{
    Restaurant restaurant;
    
    public ShowMenuCommand(Restaurant restaurant)
    {
     this.restaurant = restaurant;
    }
    
    @Override 
    public void execute()
    {
      System.out.println("\nShow Menu Command Executing ..");
    }
    
    @Override
    public void undo()
    {
     System.out.println("Undo in Show Menu Command");
    }    
}
