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
 * @author Ih
 */
public interface OrderInterface {
    public void addDishToOrder(Dish dishToAdd);
    public List<Dish> getDishList();
}
