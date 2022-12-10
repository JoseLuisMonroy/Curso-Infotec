import java.util.Arrays;

public class Producto implements Producto_int{
    private String nombre;
    private int precio;
    private int cantidad;
    private int tipo;
    private Integer[] tiposDisp = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    private Integer tipoDisp = 19;

    public Producto(String nombre){
        this.nombre = nombre;
        setPrecio();
        setCantidad();
        setTipo();
    }
    public void setTipo(){
        int numero = (int)(Math.random()*tipoDisp+1);
        this.tipo = tiposDisp[numero];
        tipoDisp--;
        tiposDisp = Arrays.stream(tiposDisp).filter(x -> x != tiposDisp[numero]).toArray(Integer[]::new);
    }
    public void setCantidad(){
        this.cantidad = (int)(Math.random()*((15-10)+1))+10;
    }
    public void setPrecio(){
        this.precio = (int)(Math.random()*((500-300)+1))+300;
    }

    public String getNombre(){
        return this.nombre;
    }
    public int getPrecio(){
        return this.precio;
    }
    public int getCantidad(){
        return this.cantidad;
    }
    public int getTipo(){
        return this.tipo;
    }

    public void vender(){
        if(this.cantidad == 0){
            System.out.println("No se puede vender un producto de tipo pues no tiene disponibilidad");
        }
        else{
            this.cantidad--;
            System.out.println("Compra realizada!");
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", precio: " + precio + ", tipo: " + tipo + " cantidad: " + cantidad; 
    }
}