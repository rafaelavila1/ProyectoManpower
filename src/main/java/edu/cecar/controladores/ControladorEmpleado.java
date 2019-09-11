
/**
 * Clase: ControladorEmpleado
 * 
 * @version: 0.1
 *  
 * @since: 12/08/2019
 * 
 * Fecha de ModificaciÃ³n:
 * 
 * @author: Rafael Avila Llorente
 * 
 * Copyrigth: CECAR
 */


package edu.cecar.controladores;

import edu.cecar.componentes.singletons.SingletonConexionDB;
import edu.cecar.modelos.Empleado;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 *  Clase que controla las operaciones CRUD de los empleados
 */
public class ControladorEmpleado {
    

    
    public void guardar(Empleado empleado) throws SQLException{
    
        PreparedStatement preparedStatement = SingletonConexionDB.getInstance().prepareStatement("insert to empleado values(?,?,?,?)");
        preparedStatement.setString(1, empleado.getCodigo());
        preparedStatement.setString(2, empleado.getNombres());
        preparedStatement.setString(3, empleado.getApellidos());
        preparedStatement.setString (4, empleado.getFechaNacimiento());
        preparedStatement.execute();
    }
    
    public Empleado consultar(String codigo) throws SQLException{
        
        Empleado empleado = null;
        
        PreparedStatement preparedStatement = SingletonConexionDB.getInstance().prepareStatement("" + "Select nombres,apellidos,fechanacimiento from empleados where codigo = ?");        
        preparedStatement.setString(1, codigo);
        ResultSet resultado = preparedStatement.executeQuery();
        
        if (resultado.next()){
            
            empleado = new
                    
                Empleado(codigo,resultado.getString(1),resultado.getString(2),resultado.getString(3));
        }
        return empleado;
    }
    
    public void actualizar(){}
    
   
    
    
    public void eliminar(){}

}    
