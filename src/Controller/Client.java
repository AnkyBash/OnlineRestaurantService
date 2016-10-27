/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import User.Customer;
import Organisation.Organisation;
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
       // ChooseRestaurantCmd chooseRestoCommand = new ChooseRestaurantCmd(restaurant);
        
        Broker agent = new Broker();
        //taking command
        agent.takeCommand(loginCommand);//command for login 
        agent.takeCommand(logoutCommand);//command for logout 
        agent.takeCommand(showRestoListCommand);//command for showing restaurant list
       // agent.takeCommand(chooseRestoCommand);
        //placing command
        agent.placeCommand();
        
        System.exit(0);
    }
    
}
