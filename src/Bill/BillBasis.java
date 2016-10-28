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
public class BillBasis implements Bill {
    
    @Override
    public String getBill(){
        return "–––––––––––––––––––––\nBill:\n–––––––––––––––––––––\n";
    }
    @Override
    public BillData getData(){
        return data;
    }
    
}
