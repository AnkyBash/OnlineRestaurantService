/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Bill.Bill;
import Bill.BillBasis;
import Bill.BillData;
import Bill.DishList;
import Bill.OrderDisplay;
import Bill.RestaurantAdress;
import Bill.RestaurantName;
import Bill.Taxes;
import Bill.TotalPrice;
import Organisation.CareTakerMemento;
import Organisation.Memento;
import Organisation.Order;
import User.Customer;
import Organisation.Organisation;
import Restaurant.Dish;
import Restaurant.DishFactory;
import Restaurant.DishType;
import Restaurant.Restaurant;
/**
 *
 * @author ankit
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Customer instance
        Customer abcCustomer = new Customer();
        //Organisation instance
        Organisation org = new Organisation();
        //restaurant instance 
        Restaurant restaurant = new Restaurant();
        
        //login Command initialisation
        UserLoginCmd loginCommand = new UserLoginCmd(abcCustomer);
        //logout Command initialisation
        UserLogoutCmd logoutCommand = new UserLogoutCmd(abcCustomer); 
        //show restaurant List Command initialisation
        ShowRestaurantListCmd showRestoListCommand = new ShowRestaurantListCmd(org);
        //choose restaurant command
        ChooseRestaurantCmd chooseRestoCommand = new ChooseRestaurantCmd(restaurant);
        //Show Menu Command
        ShowMenuCommand showMenuCommand = new ShowMenuCommand(restaurant);
        
        Broker agent = new Broker();
        //taking command
        agent.takeCommand(loginCommand);//command for login 
        agent.placeCommand();
        
        agent.takeCommand(showRestoListCommand);//command for showing restaurant list
        agent.takeCommand(chooseRestoCommand);
        agent.placeCommand();
        //placing command
        
        agent.takeCommand(showMenuCommand);
        //Chris Code Start
        /***
         * 
         */
        
        // create Subject:
        Order order = new Order();
        
        OrderDisplayCmd orderDisplayCommand = new OrderDisplayCmd(order);
        agent.takeCommand(orderDisplayCommand);
        // create and add Observer to Subject (Order):
        //OrderDisplay orderDisplay = new OrderDisplay();
        //orderDisplay.setSubject(order);
        
        // Decorator Pattern
        Bill bill = new Taxes(new TotalPrice(new DishList(new RestaurantAdress(new RestaurantName ( new BillBasis())))));
        //System.out.println(bill.getBill());
        BillData billData = bill.getData();
        billData.setSubject(order);
        
        // Memento Pattern
        // the order class instantiates the Originator Interface and is already created
     //   CareTakerMemento careTaker = new CareTakerMemento();
        
        
        // create Dish Factory:
        DishFactory dishFactory = DishFactory.getInstance();
        Dish aDessert = dishFactory.makeDish(DishType.DESSERT, "Kuchen", 2.99);
        Dish aDrink = dishFactory.makeDish(DishType.DRINK, "Bahama Mama", 6.99);
        Dish aFood = dishFactory.makeDish(DishType.FOOD_VEGAN, "Sojasprossen", 13.99);

        // print info about who can eat the food:
       // aDessert.getSuitability();
       // aFood.getSuitability();

        
        // choose the dish
        AddDishCmd addDishCommand1 = new AddDishCmd(order, aDessert);
        AddDishCmd addDishCommand2 = new AddDishCmd(order, aDrink);
        AddDishCmd addDishCommand3 = new AddDishCmd(order, aFood);
        //order.addDishToOrder(aDessert);
        //order.addDishToOrder(aDrink);
        agent.takeCommand(addDishCommand1);
        agent.takeCommand(addDishCommand2);
        agent.takeCommand(addDishCommand3);
        // save order to memento:
        // create a new Memento and add it to the careTaker
    //    careTaker.add(order.saveListToMomento());
        
        // add another dish
        //order.addDishToOrder(aFood);
        
        // save new order to memento:
    //    careTaker.add(order.saveListToMomento());
        
        // print first saved list:
    //    System.out.println("First saved OrderList: ");
    //    Memento restoreListMemento = careTaker.get(0);
    //    restoreListMemento.printSavedList();
        
        // print second saved list:
    /*    System.out.println("Second saved OrderList: ");
        restoreListMemento = careTaker.get(1);
        restoreListMemento.printSavedList();
    */    
        // Decorator Pattern        
        
        //Chris Code Finish
        ShowBillCommand showBillCommand = new ShowBillCommand(bill);
        agent.takeCommand(showBillCommand);
        
        agent.takeCommand(logoutCommand);//command for logout
        //
        agent.placeCommand();
       
        System.exit(0);
    }
    
}
