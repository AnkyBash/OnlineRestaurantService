/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organisation;

import Restaurant.Dish;
import java.util.List;

/**
 *
 * @author Jo
 */
public class Memento {
    private List<Dish> dishListMemento;
    
    public Memento(List<Dish> dishListMemento) {
        this.dishListMemento = dishListMemento;
    }
    
    public List<Dish> getList() {
        return dishListMemento;
    }
    
    public void printSavedList(){
        String dishes = "\n";
        for (int i = 0; i < dishListMemento.size();i++){
            dishes = dishes + dishListMemento.get(i).getDishName() + "......" + dishListMemento.get(i).getDishPrice() + "€\n";
        } 
        
        System.out.println(dishes);
    }
    
}
