public class main {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new Empleado("Juan", 20, 2, '1');
        empleados[1] = new Empleado("Pedro", 25, 5, '2');
        empleados[2] = new Empleado("Maria", 30, 10, '3');
        Producto[] productos = new Producto[5];
        productos[0] = new Producto("Coca-Cola");
        productos[1] = new Producto("Pepsi");
        productos[2] = new Producto("Fanta");
        productos[3] = new Producto("Sprite");
        productos[4] = new Producto("Manzana");
        System.out.println("Para ver la explicacion de video, puede visitar el siguiente link " + "https://drive.google.com/file/d/1iTSL8Z5mJ24dKb6ZjIyEXxCsqT3NCrFW/view?usp=sharing");
        System.out.println(empleados[0]);
        System.out.println(productos[1]);

        Utileria utileria = new Utileria(); 
        utileria.eliminarEmpleado(empleados);
        System.out.println("La hora es: " + utileria.getHora());
        System.out.println("el total en almacen es: " + utileria.totalPrecio(productos) + " pesos");
        System.out.println("el producto con mayor precio es: " + utileria.mayorPrecio(productos));
        System.out.println("el producto con mayor cantidad es: " + utileria.mayorCantidad(productos));
        if (utileria.noDisponible(productos) != null){
            System.out.println("el producto no disponible es: " + utileria.noDisponible(productos));
        }
    }
}