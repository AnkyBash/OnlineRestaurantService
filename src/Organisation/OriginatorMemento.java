/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organisation;

/**
 *
 * @author Jo
 */
public interface OriginatorMemento {
    
    public Memento saveListToMomento();
    
    public void restoreListFromMomento(Memento memento);
    
  
}
