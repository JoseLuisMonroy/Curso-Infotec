public class Revista extends Publicacion implements PrestaRevista{
    private int numero;
    private boolean prestado;

    public Revista(String codigo, String titulo, String estado, int anioPublicacion, int numero) {
        super(codigo, titulo, estado, anioPublicacion);
        this.numero = numero;
    }
    public int Numero() {
        return numero;
    }
    public String Prestado() {
        return (prestado) ? "La revista ha sido prestada" : "La revista no ha sido prestada";
    }
    public void Prestar() {
        this.prestado = true;
    }
    public void Devolver() {
        this.prestado = false;
    }

    @Override
    public String toString() {
        return super.toString() + ", numero: " + Numero();
    }
}