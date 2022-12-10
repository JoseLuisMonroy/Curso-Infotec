import java.util.Arrays;

public class Programador extends Empleado{
    private String herramienta;

    public Programador(String nombre, String apellidos, int edad , String[] actividades){
        super(nombre, apellidos, edad,  actividades, 9000);
        this.herramienta = "Eclipse";
    }

    public String[] getActividades(){
        String[] actividades = getActividadesDiarias();
        Arrays.sort(actividades);
        return actividades;
    }
    public String[] eliminar(){
        String[] actividades = getActividadesDiarias();
        String[] actividadesNuevas = new String[actividades.length];
        for (int i = 0; i < actividades.length; i++){
            actividadesNuevas[i] = actividades[i].substring(1, actividades[i].length() - 1);
        }
        return actividadesNuevas;
    }

    @Override
    public String toString(){
        return "Nombre: " + getNombre() + " " + getApellidos() + " Edad: " + getEdad() + " Código empleado: " + getCodigoEmpleado() + " Actividades: " + getActividades()[0] + ", "+ getActividades()[1] + ", "+ getActividades()[2]+ " Herramienta: " + herramienta;
    }
}