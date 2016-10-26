/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;
import DataBase.DataBaseAccess;
/**
 *
 * @author ankit
 */
public class Customer 
{
    //creating a database object
    private DataBaseAccess da;
    //private String customerID;
    //name attribute
    private String name;
    //password attribute
    private String password;
    //loginstatus attribute
    private boolean logInStatus;

    
    //getter method for name
    public String getName() {
        return name;
    }

    //getter method for customerID
    public String getCustomerID(String name)
    {
      return da.getCustomerID(name);
    }
    
    //Setter for name
    public void setName(String name) {
        this.name = name;
    }

    //getter method for password
    public String getPassword() {
        return password;
    }

    //Setter for password
    public void setPassword(String password) {
        this.password = password;
    }

    //Getter loginstatus
    public boolean getLogInStatus() {
        return logInStatus;
    }

    //Setter Loginstatus
    public void setLogInStatus(boolean logInStatus) {
        this.logInStatus = logInStatus;
    }
    
    //method to login user,  username and password are the parameter
    public boolean login(String uName, String password)
    {
        //getting result from database
      return da.login(uName, password);
    }
    
    //method to logout user
    public boolean logout(String customerId)
    {
        //check if user is valid
       if(da.isUser(customerId))
       {
        //customerID = "";
        name = "";
        password = "";
        return true;
       }
       else
           return false;
    }
}
