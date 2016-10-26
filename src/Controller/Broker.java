/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ankit
 */
//Invoker
public class Broker 
{
   //list of command object which user will give 
   private List<Command> userCommandList = new ArrayList<Command>(); 

   //adding user command in userCommandList 
   public void takeCommand(Command userInput)
   {
       userCommandList.add(userInput);
      //orderList.add(order);		
   }
 
   //method wich call to execute user commands
   public void placeCommand()
   {
    for (Command userOrder : userCommandList) 
    {
     userOrder.execute();
    }
     userCommandList.clear();
   }    
}
