public class DobleRetProducto {
    private Producto[] Productos;
    private int costo;

    public DobleRetProducto(Producto[] Productos, int costo){
        this.Productos = Productos;
        this.costo = costo;
    }
    public Producto[] getProducto(){
        return this.Productos;
    }
    public int getCosto(){
        return this.costo;
    }

}