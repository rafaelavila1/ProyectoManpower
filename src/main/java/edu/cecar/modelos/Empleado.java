
/**
 * Clase: Empleados
 * 
 * @version: 0.1
 *  
 * @since: 12/08/2019
 * 
 * Fecha de Modificación:
 * 
 * @author: Rafael Avila Llorente
 * 
 * Copyrigth: CECAR
 */


package edu.cecar.modelos;



/**
 *
 *  Clase
 */
public class Empleado {
    
    private String codigo;
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;

    public Empleado(String codigo, String nombres, String apellidos, String fechaNacimiento) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Empleado (){
        
    }
    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    

}
