/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bill;

import Organisation.Order;
import Restaurant.Dish;
import Restaurant.DishFactory;
import Restaurant.DishType;

/**
 *
 * @author Jo
 */
public class OrderTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Observer Patter:
        
        // create Subject:
        Order order = new Order();
        
        // create and add Observer to Subject (Order):
        OrderDisplay orderDisplay = new OrderDisplay();
        orderDisplay.setSubject(order);
        
        Bill bill = new Taxes(new TotalPrice(new DishList(new RestaurantAdress(new RestaurantName ( new BillBasis())))));
        System.out.println(bill.getBill());
        BillData billData = bill.getData();
        billData.setSubject(order);
        
        
        // create Dish Factory:
        DishFactory dishFactory = DishFactory.getInstance();
        Dish aDessert = dishFactory.makeDish(DishType.DESSERT, "Kuchen", 2.99);
        Dish aDrink = dishFactory.makeDish(DishType.ALCDRINK, "Bahama Mama", 6.99);
        
        // choose the dish
        order.addDishToOrder(aDessert);
        order.addDishToOrder(aDrink);
        
        // Decorator Pattern        
        System.out.println(bill.getBill());
    }
    
}
