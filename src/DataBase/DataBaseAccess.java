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
 
    public boolean login(String uName, String password)
    {
      if(uName.equals("ankit") && password.equals("ankit"))
      {
          return true;
      }
      else
      {
           return false;
      }
    }
    
    public boolean isUser(String customerId)
    {
     if(customerId.equals("u1"))
     {
      return true;
     }
     else
         return false;
    }
    
    public String getCustomerID(String name)
    {
     return "u1";
    }
}
