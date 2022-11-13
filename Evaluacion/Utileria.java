import java.time.LocalDateTime;

public class Utileria{
    private int contador;

    Utileria(){
        this.contador = 0;
    }

    public Producto mayorPrecio(Producto[] productos){
        Producto mayor = productos[0];
        for(int i = 0; i < productos.length; i++){
            if(productos[i].getPrecio() > mayor.getPrecio()){
                mayor = productos[i];
            }
        }
        contador++;
        return mayor;
    }
    public Producto mayorCantidad(Producto[] productos){
        Producto mayor = productos[0];
        for(int i = 0; i < productos.length; i++){
            if(productos[i].getCantidad() > mayor.getCantidad()){
                mayor = productos[i];
            }
        }
        contador++;
        return mayor;
    }
    public int totalPrecio(Producto[] productos){
        int total = 0;
        for(int i = 0; i < productos.length; i++){
            total += (productos[i].getPrecio() * productos[i].getCantidad());
        }
        contador++;
        return total;
    }
    public Producto noDisponible(Producto[] Productos){
        Producto noDisponible = null;
        for(int i = 0; i < Productos.length; i++){
            if(Productos[i].getCantidad() == 0){
                noDisponible = Productos[i];
                break;
            }
        }
        contador++;
        return noDisponible;
    }
    public DobleRetProducto totalProducto(Producto[] productos){
        int total  = this.totalPrecio(productos);
        Producto[] producto = new Producto[2];
        productos[0] = this.mayorPrecio(productos);
        productos[1] = this.mayorCantidad(productos);
        productos[2] = this.noDisponible(productos);
        DobleRetProducto dobleRet = new DobleRetProducto(producto, total);
        contador++;
        return dobleRet;
    }
    public int getHora(){
        LocalDateTime hora = LocalDateTime.now();
        int horaSola = hora.getHour();
        contador++;
        return horaSola;
    }
    public void eliminarEmpleado(Empleado[] empleados){
        for(int i = 0; i < empleados.length; i++){
            if(empleados[i].getTipo() == '3'){
                System.out.println("El empleado " + empleados[i].getNombre() + " ha sido eliminado");
                empleados[i] = null;
            }
        }
        Empleado[] auxiliares = new Empleado[empleados.length - 1];
        int j = 0;
        for(int k = 0; k < empleados.length; k++){
            if(empleados[k] != null){
                auxiliares[j] = empleados[k];
                j++;
            }
        }
        empleados = auxiliares;
        contador++;
    }
    public String toMayus(String palabra){
        String palabraMayus = "";
        for(int i = 0; i < palabra.length(); i++){
            if(palabra.charAt(i) >= 'a' && palabra.charAt(i) <= 'z'){
                palabraMayus += (char)(palabra.charAt(i) - 32);
            }
            else{
                palabraMayus += palabra.charAt(i);
            }
        }
        contador++;
        return palabraMayus;
    }
    public String toMinus(String palabra){
        String palabraMinus = "";
        for(int i = 0; i < palabra.length(); i++){
            if(palabra.charAt(i) >= 'A' && palabra.charAt(i) <= 'Z'){
                palabraMinus += (char)(palabra.charAt(i) + 32);
            }
            else{
                palabraMinus += palabra.charAt(i);
            }
        }
        String palabraInvertida = "";
        for(int i = palabraMinus.length() - 1; i >= 0; i--){
            palabraInvertida += palabraMinus.charAt(i);
        }
        contador++;
        return palabraInvertida;
    }

}