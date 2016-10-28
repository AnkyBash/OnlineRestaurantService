/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organisation;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jo
 */
public class CareTakerMemento {
    private List<Memento> mementoList = new ArrayList<Memento>();
    
    public void add(Memento list) {
        mementoList.add(list);
    }
    
    public Memento get(int index) {
        return mementoList.get(index);
    }
   
}
