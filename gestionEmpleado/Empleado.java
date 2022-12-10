public abstract class Empleado{
    private String nombre;
    private String apellidos;
    private int edad;
    private String[] actividadesDiarias;
    private int codigoEmpleado;

    public Empleado(String nombre, String apellidos, int edad, String[] actividadesDiarias, int codigoEmpleado){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.actividadesDiarias = actividadesDiarias;
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String[] getActividadesDiarias(){
        return actividadesDiarias;
    }
    public void setActividadesDiarias(String []actividadesDiarias){
        this.actividadesDiarias = actividadesDiarias;
    }
    public int getCodigoEmpleado(){
        return codigoEmpleado;
    }
    public void setCodigoEmpleado(int codigoEmpleado){
        this.codigoEmpleado = codigoEmpleado;
    }
    public String[] getActividades(){
        return actividadesDiarias;
    }

    public abstract String toString();
}