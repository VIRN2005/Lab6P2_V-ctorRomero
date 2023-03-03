package lab6p2_víctorromero;

import java.util.Date;

public class Lanzamiento {

    protected String titulo;
    protected Date fecha;
    protected int contLikes;

    public Lanzamiento() {
    }

    public Lanzamiento(String titulo, Date fecha, int contLikes) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.contLikes = contLikes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getContLikes() {
        return contLikes;
    }

    public void setContLikes(int contLikes) {
        this.contLikes = contLikes;
    }

    @Override
    public String toString() {
        return " >> Lanzamiento <<" + "\n"
                + "Titulo = " + titulo + "\n"
                + "Fecha = " + fecha + "\n"
                + "Contador de Likes = " + contLikes + '}';
    }

}
