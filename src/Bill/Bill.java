/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bill;

/**
 *
 * @author Ih
 */
public class Bill implements BillInterface {
  
    @Override
    public String getBill(){
        return "This is your Bill:\n\n";
    }

    
}
