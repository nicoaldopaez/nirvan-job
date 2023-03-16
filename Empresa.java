
/**
 * Write a description of class Empresa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Empresa{
    // instance variables - replace the example below with your own
    private String nombreEmpresa;
    private boolean abierto;
    private Empleado trabajador;

    /**
     * Constructor for objects of class Empresa
     */
    public Empresa(String empresa, boolean puerta, Empleado trabajador ){
        this.nombreEmpresa = empresa;
        this.abierto = puerta;
        this.trabajador = trabajador;
    }

    public String getNombreEmpresa(){
        return nombreEmpresa;
    }

    public boolean getAbierto(){
        return abierto;
    }

    public Empleado getTrabajador(){
        return trabajador;
    }
    
    public void setNombreEmpresa(String cambiarNombre){
        nombreEmpresa = cambiarNombre;
    }
    
    public void setAbierto(boolean cerrado){
        abierto = cerrado;
    }
    
    public void setEmpleado(Empleado nuevoTrabajador){
        trabajador = nuevoTrabajador;
    }
    
        public void imprimirDetalles(){
        System.out.println("Nombre de la empresa: " + nombreEmpresa + " Estado actual: " + abierto + " Nombre del empleado: " + trabajador.getNombreEmpleado() + " Salario del empleado: " + trabajador.getSalario());
    }
}
