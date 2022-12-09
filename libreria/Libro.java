public class Libro extends Publicacion implements PrestaLibro{
    private boolean prestado;

    public Libro(String codigo, String titulo, String estado, int anioPublicacion) {
        super(codigo, titulo, estado, anioPublicacion);
        this.prestado = false;
    }

    public String Prestado() {
        return (prestado) ? "El libro ha sido prestado" : "El libro no ha sido prestado";
    }
    public void Prestar() {
        this.prestado = true;
    }
    public void Devolver() {
        this.prestado = false;
    }
    @Override
    public String toString() {
        return super.toString() + ", " + Prestado();
    }
}