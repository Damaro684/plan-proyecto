public class Proyecto{
    private String nombreProyecto;
    private String descripcion;

    public Proyecto(String proyecto, String descripcionProyecto){
        nombreProyecto = proyecto;
        descripcion = descripcionProyecto;
    }
    
    public String getProyecto(){
        return nombreProyecto;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setProyecto(String renombrado){
        nombreProyecto = renombrado;
    }
    
    public void setDescripcion(String actualizadoDescripcion){
        descripcion = actualizadoDescripcion;
    }
    
    public void imprimirDetalles(){
        System.out.println("Nombre proyecto: " + nombreProyecto + "\nDescripcion: " + descripcion);
    }
}
