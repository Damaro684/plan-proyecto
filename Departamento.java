public class Departamento
{
    private String nombreDpto;
    private String descripcionDpto;
    private Proyecto proyecto;

    public Departamento(String nombre, String descripcion, String nombreProyecto, String descripcionProyecto){
        nombreDpto = nombre;
        descripcionDpto = descripcion;
        proyecto = new Proyecto(nombreProyecto, descripcionProyecto);
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
    
    public String devolverDetalles(){
        return "\nNombre departamento: " + nombreDpto + "\nDescripcion del departamento: " + descripcionDpto + proyecto.devolverDetalles();
    }
}

