
public class Empleado
{
    private String nombreEmpleado;
    private int salario;

    public Empleado(){
        
    }
    
    public String getnombreEmpleado()
    {
        return nombreEmpleado;
    }
    
    public void setSalario(int aumento)
    {
        salario = aumento;
    }
    
    public void imprimirDetalles(){
      System.out.println("Nombre del empleado: " + nombreEmpleado + "Salario: " + salario);  
    }
}


