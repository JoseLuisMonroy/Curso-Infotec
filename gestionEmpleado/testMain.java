public class testMain {
    public static void main(String[] args) {
        String[] actividades = {"Análisis de requerimientos", "Desarrollo de requerimientos", "Presentación-pruebas unitarias"};
        Disenador disenador = new Disenador("Juan", "Pérez", 23, actividades);
        Programador programador = new Programador("Ana", "García", 28, actividades);
        System.out.println(disenador);
        System.out.println(programador);
        String[] ActividadaesSinletra = programador.eliminar();
        for (int i = 0; i < ActividadaesSinletra.length; i++){
            System.out.println(ActividadaesSinletra[i]);
        }

    }
}