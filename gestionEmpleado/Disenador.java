import java.util.Arrays;

public class Disenador extends Empleado{
    private String herramienta;

    public Disenador(String nombre, String apellidos, int edad, String[] actividades){
        super(nombre, apellidos, edad, actividades, 8000);
        this.herramienta = "Photoshop";
    }    

    public String[] getActividades(){
        if (getEdad() <= 25){
            //append new activities
            String[] actividades = getActividadesDiarias();
            String[] actividadesNuevas = new String[actividades.length + 1];
            for (int i = 0; i < actividades.length; i++){
                actividadesNuevas[i] = actividades[i];
            }
            actividadesNuevas[actividades.length] = "Revisión de disenador SR";
            return actividadesNuevas;
        }
        else{
            String[] actividades = getActividadesDiarias();
            String[] actividadesNuevas = new String[actividades.length + 1];
            for (int i = 0; i < actividades.length; i++){
                actividadesNuevas[i] = actividades[i];
            }
            actividadesNuevas[actividades.length] = "Apoyo a disenador JR";
            return actividadesNuevas;
        }
    }

    public String[] orderActivities(){
        String[] actividades = getActividades();    
        Arrays.sort(actividades);
        return actividades;
    }
    @Override
    public String toString(){
        return "Nombre: " + getNombre() + " " + getApellidos() + " Edad: " + getEdad() + " Código empleado: " + getCodigoEmpleado() + " Actividades: " + getActividades()[0] + ", "+ getActividades()[1] + ", "+ getActividades()[2]+ ", "+ getActividades()[3]+ " Herramienta: " + herramienta;
    }
}