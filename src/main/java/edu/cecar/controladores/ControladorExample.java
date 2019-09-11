/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Clase: ControladorExample
 * 
 * @version: 0.1
 *  
 * @since: 2/09/2019
 * 
 * Fecha de Modificación:
 * 
 * @author: Rafael Avila Llorente
 * 
 * Copyrigth: CECAR
 */


package edu.cecar.controladores;

import edu.cecar.componentes.singletons.SingletonConexionDB;
import edu.cecar.modelos.Examples;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;


public class ControladorExample {
    
   
    public HashMap <String,Examples > consultarEmpleados() throws SQLException{
        
        HashMap<String,Examples> resultado = new HashMap<String,Examples>();
        PreparedStatement preparedStatement = SingletonConexionDB.getInstance().prepareStatement("Select * from examples");
        ResultSet result = preparedStatement.executeQuery();
        
        while(result.next()){
            Examples example = new Examples(result.getString(1),result.getString(2),result.getString(3),result.getString(4));
        }
        return resultado;
    }

}
