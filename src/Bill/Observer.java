/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bill;

import Organisation.Subject;


/**
 *
 * @author Ih
 */
public interface Observer {  
    public void update();
    public void setSubject(Subject sub);
}
