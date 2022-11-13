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
        setActividades(tipo);
    }

    public void setActividades(char tipo){
        switch(tipo){
            case '1':
                this.actividades = new String[]{"vender", "acomodar", "descansar", "sentarse", "recibirPago"};
                break;
            case '2':
                this.actividades = new String[]{"vender", "descansar", "correr", "recibirPago"};
                break;
            case '3':
                this.actividades = new String[]{"recibirPago"};
                break;
            default:
                System.out.println("Tipo de empleado no valido");
            break;
        }
    }

    public void recibirPago(int pago){
        System.out.println("El empleado " + this.nombre + " ha recibido su pago.");
    }
    public void realizarActividad(String actividad){
        int i = 0;
        for(i = 0 ; i < this.actividades.length; i++){
            if(this.actividades[i] == actividad){
                System.out.println("El empleado " + this.nombre + " ha realizado la actividad " + actividad);
                break;
            }
        }
        if(i == this.actividades.length){
            System.out.println("El empleado " + this.nombre + " no puede realizar la actividad pues no se encuentra dentro de sus actividades planeadas");
        }
    }
    public char getTipo(){
        return this.tipo;
    }
    public String getNombre(){
        return this.nombre;
    }
}