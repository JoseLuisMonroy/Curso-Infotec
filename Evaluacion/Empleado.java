public class Empleado implements Empleado_tipoS{
    private String nombre;
    private int edad;
    private int antiguedad;
    private char tipo;
    private String[] actividades;

    public Empleado(String nombre, int edad, int antiguedad, char tipo){
        this.nombre = nombre;
        this.edad = edad;
        this.antiguedad = antiguedad;
        this.tipo = tipo;
        this.actividades = setActividades(tipo);
    }

    public setActividades(char tipo){
        String[] actividades;
        if(tipo == '1'){
            actividades = {"vender", "acomodar", "descansar", "sentarse", "recibirPago"};
        }else if(tipo == '2'){
            actividades = {"vender", "descansar", "correr", "recibirPago"};
        }
        else{
            actividades = {"recibirPago"};
        }
        return actividades;
    }

    public void recibirPago(int pago){
        System.out.println("El empleado " + this.nombre + " ha recibido su pago.");
    }
    public void realizarActividad(String actividad){
        for(int i = 0; i < this.actividades.length; i++){
            if(this.actividades[i] == actividad){
                break;
            }
            else{
                System.out.println("La actividad " + actividad + " no se puede realizar porque no se encuentra dentro de las actividades del empleado ");
            }
        }    
    }
}