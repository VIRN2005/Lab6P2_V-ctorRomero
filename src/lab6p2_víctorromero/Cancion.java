package lab6p2_víctorromero;

public class Cancion {
    private String titulo;
    private String duracion;
    private String Referencia;

    public Cancion() {
    }

    public Cancion(String titulo, String duracion, String Referencia) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.Referencia = Referencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }

    @Override
    public String toString() {
        return ">> CANCION <<" + "\n"
                + "Titulo =" + titulo + "\n"
                + "Duracion =" + duracion + "\n"
                + "Referencia =" + Referencia + '}';
    }
    
    
    
}
