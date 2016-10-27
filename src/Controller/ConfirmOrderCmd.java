/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author ankit
 */
public class ConfirmOrderCmd implements Command
{
    public ConfirmOrderCmd()
    {
    
    }
    
    @Override 
    public void execute()
    {
      System.out.println("Confirm Order Executing");
    }
    
    @Override
    public void undo()
    {
     System.out.println("Undo in Confirm Order Command");
    }
}
