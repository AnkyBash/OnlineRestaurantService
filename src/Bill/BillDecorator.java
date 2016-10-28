/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bill;

import Organisation.Subject;
import java.util.List;

/**
 *
 * @author Ih
 */
//import java.util.ArrayList;

abstract public class BillDecorator implements Bill {
    
    protected Bill tempBill;

    public BillDecorator(Bill newBill){
        tempBill = newBill;
    }
  
    @Override
    public String getBill(){
        return tempBill.getBill();
    }
    
    @Override
    public BillData getData(){
        return data;
    }
}