public class Departamento
{
    private String nombreDpto;
    private String descripcionDpto;
    private Proyecto proyecto;

    public Departamento(String nombre, String descripcion){
        nombreDpto = nombre;
        descripcionDpto = descripcion;
    }
    
    public String getDepartamento(){
        return nombreDpto;
    }
    
    public String getDescripcion(){
        return descripcionDpto;
    }
    
    public void setDepartamento(String renombrado){
        nombreDpto = renombrado;
    }
    
    public void setDescripcion(String actualizadoDescripcion){
        descripcionDpto = actualizadoDescripcion;
    }
    
    public void imprimirDetalles(){
        System.out.println("Nombre departamento: " + nombreDpto + "\nDescripcion: " + descripcionDpto);
    }
}

