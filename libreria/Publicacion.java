public class Publicacion{
    private String codigo;
    private String titulo;
    private String estado;
    private int anioPublicacion;

    public Publicacion(String codigo, String titulo, String estado, int anioPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.estado = estado;
        this.anioPublicacion = anioPublicacion;
    }

    public String getCodigo() {
        return codigo;
    }
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    @Override
    public String toString() {
        return "codigo: " + codigo + ", titulo: " + titulo + ", estado: " + estado + ", anioPublicacion: " + anioPublicacion;
    }
}