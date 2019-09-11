
/**
 * Clase: SingletonConexionDB
 * 
 * @version: 0.1
 *  
 * @since: 26/08/2019
 * 
 * Fecha de Modificación:
 * 
 * @author: Rafael Avila Llorente
 * 
 * Copyrigth: CECAR
 */


package edu.cecar.componentes.singletons;

import edu.cecar.componentes.basesDeDatos.ConectarMySQL;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 *  Singleton que devuelve una conexión a una base de datos.
 */
public class SingletonConexionDB {
    
    private static Connection connection;
    
    //private static Connection connection1 = new ConectarMySQL(null, null, null, null).getConnection();
    
    public static Connection getInstance() {
        
        if(connection==null){
            
            try {
                Properties properties = new Properties();
                properties.load(new FileInputStream("recursos/conexion.properties"));
                connection = new ConectarMySQL(properties.getProperty("host"),
                        properties.getProperty("baseDatos"),
                        properties.getProperty("port"),
                        properties.getProperty("usuario"),
                        properties.getProperty("password"))
                        .getConnection();
                
            } catch (IOException ex) {
                Logger.getLogger(SingletonConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
            
            
        
        return connection;
    }

        public Connection getInstance1(){
        
     
        return connection;
    }
}
