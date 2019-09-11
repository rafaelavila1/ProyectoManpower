
/**
 * Clase: TestControladorExample
 * 
 * @version: 0.1
 *  
 * @since: 9/09/2019
 * 
 * Fecha de Modificación:
 * 
 * @author: Rafael Avila Llorente
 * 
 * Copyrigth: CECAR
 */


package edu.cecar.test;

import edu.cecar.controladores.ControladorExample;
import edu.cecar.modelos.Examples;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TestControladorExample {
    
    public static void main(String[] args) {
        
        try {
            ControladorExample controladorExample = new ControladorExample();
            HashMap<String,Examples> examples = controladorExample.consultarEmpleados();
            
            examples.entrySet().stream().filter(e -> e.getValue().getGender().equals("M")).forEach(e -> System.out.println("Gender" + e.getValue().getGender() + "Date" + e.getValue().getString_of_stop()));
            
            
        } catch (SQLException ex) {
            Logger.getLogger(TestControladorExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
