/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Restaurant.Restaurant;
import java.util.ArrayList;

/**
 *
 * @author Jo
 */
public class GetRestaurantListCmd implements Command {
    ArrayList <Restaurant> RestaurantList;
    
    public GetRestaurantListCmd() {
        RestaurantList = new ArrayList();
    }

    @Override
    public void execute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
