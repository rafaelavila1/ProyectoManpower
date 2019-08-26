/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cecar.test;


import edu.cecar.controladores.ControladorEmpleado;
import edu.cecar.modelos.Empleado;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1102833310
 */
public class TestControladorEmpleado {
    
    @Test
    public void testConexionBaseDatos(){
        try {
            
            ControladorEmpleado ControladorEmpleado = new ControladorEmpleado();
            
            System.out.println("Conexion Exitosa");
            
        } catch (Exception ex) {
            
            fail("Error de Conexion");
            Logger.getLogger(TestControladorEmpleado.class.getName()).log(Level.SEVERE,null,ex);
                   
        }finally{
            
        }
  
    }
    
    @Test
    public void TestGuardar(){
        
        Empleado empleado = new Empleado ("9253","Rafael","Avila","1990-07-15");
        
        try {
            ControladorEmpleado controladorEmpleado = new ControladorEmpleado();
            controladorEmpleado.guardar(empleado);
            
            Empleado empleadoBaseDatos = controladorEmpleado.consultar(empleado.getCodigo());
            assertEquals("El Codigo esperado no coincide con el insertado",empleado.getCodigo(), empleadoBaseDatos.getCodigo());
            assertEquals("El Nombre esperado no coincide con el insertado",empleado.getNombres(), empleadoBaseDatos.getNombres());
            assertEquals("El Apellido esperado no coincide con el insertado",empleado.getApellidos(), empleadoBaseDatos.getApellidos());
            assertEquals("La Fecha esperada no coincide con la insertada",empleado.getFechaNacimiento(), empleadoBaseDatos.getFechaNacimiento());
            
        } catch (SQLException ex) {
            Logger.getLogger(TestControladorEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        
    }
    }
    
    @Test
    public void Actulizar(){
        
        Empleado empleado = new Empleado ("9090","Juan","Charris","1995-12-15");
        
        
    
}

}
