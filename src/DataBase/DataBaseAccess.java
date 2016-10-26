/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

/**
 *
 * @author ankit
 */
public class DataBaseAccess 
{
    //checking database to verify username and password
    public boolean login(String uName, String password)
    {
        //hardcode username and password
        //return true;
        return uName.equals("ankit") && password.equals("ankit");
    }
    
    //checking database user is valid or not by supplying customerID
    public boolean isUser(String customerId)
    {
     if(customerId.equals("u1"))
     {
      return true;
     }
     else
         return false;
    }
    
    //getting customerID by name in database
    public String getCustomerID(String name)
    {
     return "u1";
    }
}
