/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bill;

import Organisation.Subject;
import Organisation.Order;
//import Restaurant.Dish;
import java.util.*;


/**
 *
 * @author Ih
 */
public class Bill implements BillInterface, Observer {
    Order order;
    double price;

/* private  double orderBill;
 private Dish theDish ;
 private TotalPrice allPrice;
 private double currentPrice;
 private final ArrayList<Double> priceToPay;
 private String myOrder;
 private Order checkOrder;
 */
  public Bill (Order o){
      order = o; 
  }
  
  
    @Override
    public String getBill(){
        return "This is your Bill:\n\n";
    }
    
    @Override
    public void update() {
    }
 

    @Override
    public void setSubject(Subject sub) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
