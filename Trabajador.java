public class Trabajador
{
    private String nombreTrabajador;
    private Departamento dpto;
    private boolean jefe;

    public Trabajador(String nombre, boolean esJefe){
        nombreTrabajador = nombre;
        jefe = esJefe;
    }
    
    public String getNombre(){
        return nombreTrabajador;
    }
    
    public boolean getEsJefe(){
        return jefe;
    }
    
    public void imprimirDetalles(){
        String respuesta = "";
        if(jefe == true) {
            respuesta = "Nombre del trabajador: " + nombreTrabajador + "\nEs jefe?: " + "sí";
        }
        else {
            respuesta = "Nombre del trabajador: " + nombreTrabajador + "\nEs jefe?: " + "no";
        }
        System.out.println(respuesta);
    }
}

