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
public class CancelOrderCmd implements Command 
{
    public CancelOrderCmd()
    {
    
    }
    
    @Override 
    public void execute()
    {
      System.out.println("Cancel Order Executing");
    }
    
    @Override
    public void undo()
    {
     System.out.println("Undo in Cancel Order Command");
    }    
}
