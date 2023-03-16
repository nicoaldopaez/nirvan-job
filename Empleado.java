
public class Empleado
{
    private String nombreEmpleado;
    private int salario;

    public Empleado(String nombre, int sueldo){
        sueldo = salario;
        nombre = nombreEmpleado;
    }
    
    public String getNombreEmpleado()
    {
        return nombreEmpleado;
    }
    
    public int getSalario(){
        return salario;
    }
    
    public void setSalario(int aumento)
    {
        salario = aumento;
    }
    
    public void imprimirDetalles(){
      System.out.println("Nombre del empleado: " + nombreEmpleado + "Salario: " + salario);  
    }
}


