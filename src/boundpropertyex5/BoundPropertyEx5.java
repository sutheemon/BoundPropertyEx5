/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boundpropertyex5;

import java.util.Scanner;


/**
 *
 * @author Rung
 */
public class BoundPropertyEx5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        myBean mySource = new myBean();  
        Listener1 listener1 = new Listener1(); 
        Listener2 listener2 = new Listener2(); 
        mySource.addPropertyChangeListener(listener1); 
        mySource.addPropertyChangeListener(listener2); 
        
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Score: ");
            String value = scan.nextLine();
            if (value.equals("")) {
                break;
            }
            mySource.setValue(value);
        }
        
    }

}
