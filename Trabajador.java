public class Trabajador
{
    private String nombreTrabajador;
    private Departamento dpto;
    private boolean jefe;

    public Trabajador(String nombre, boolean esJefe, String nombreDelDpto, String descripcionDpto, String nombreProyecto, String descripcionProyecto){
        nombreTrabajador = nombre;
        jefe = esJefe;
        dpto = new Departamento(nombreDelDpto, descripcionDpto, nombreProyecto, descripcionProyecto);
    }
    
    public String getNombre(){
        return nombreTrabajador;
    }
    
    public boolean getEsJefe(){
        return jefe;
    }
    
    public void setNombre(String actualizadoNombre){
        nombreTrabajador = actualizadoNombre;
    }
    
    public void setJefe(boolean actualizadoJefe){
        jefe = actualizadoJefe;
    }
    
    public void imprimirDetalles(){
        String respuesta = "";
        if(jefe == true) {
            respuesta = "Nombre del trabajador: " + nombreTrabajador + "\nEs jefe?: " + "sí";
        }
        else {
            respuesta = "Nombre del trabajador: " + nombreTrabajador + "\nEs jefe?: " + "no";
        }
        System.out.println(respuesta + dpto.imprimirDetalles());
    }
}

