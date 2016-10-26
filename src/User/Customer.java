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
    private DataBaseAccess da;
    //private String customerID;
    private String name;
    private String password;
    private boolean logInStatus;
    
    
    public String getName() {
        return name;
    }

    public String getCustomerID(String name)
    {
      return da.getCustomerID(name);
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean logStatus()
    {
     return logInStatus;
    }
    
    public boolean login(String uName, String password)
    {
      return da.login(uName, password);
    }
    
    public boolean logout(String customerId)
    {
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
