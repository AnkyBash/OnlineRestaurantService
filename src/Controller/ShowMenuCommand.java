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
public class ShowMenuCommand implements Command
{
    public ShowMenuCommand()
    {
    
    }
    
    @Override 
    public void execute()
    {
      System.out.println("Show Menu Executing");
    }
    
    @Override
    public void undo()
    {
     System.out.println("Undo in Show Menu Command");
    }    
}
