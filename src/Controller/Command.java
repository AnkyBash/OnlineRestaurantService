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
public interface Command {
    
    //Execute Method
    public void execute();
    
    //undo method
    public void undo();
}
