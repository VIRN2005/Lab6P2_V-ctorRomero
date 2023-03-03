package lab6p2_víctorromero;

import java.util.ArrayList;
import java.util.Date;

public class Albumes extends Lanzamiento {

    private ArrayList<Cancion> ListaCancionesAlbum;
    private int cantCanciones;

    public Albumes() {
        super();
    }

    public Albumes(ArrayList<Cancion> ListaCancionesAlbum, int cantCanciones, String titulo, Date fecha, int contLikes) {
        super(titulo, fecha, contLikes);
        this.ListaCancionesAlbum = ListaCancionesAlbum;
        this.cantCanciones = cantCanciones;
    }

    public ArrayList<Cancion> getListaCancionesAlbum() {
        return ListaCancionesAlbum;
    }

    public void setListaCancionesAlbum(ArrayList<Cancion> ListaCancionesAlbum) {
        this.ListaCancionesAlbum = ListaCancionesAlbum;
    }

    public int getCantCanciones() {
        return cantCanciones;
    }

    public void setCantCanciones(int cantCanciones) {
        this.cantCanciones = cantCanciones;
    }

    @Override
    public String toString() {
        return ">> ALBUMES <<" + "\n"
                + "Lista Canciones Album = " + ListaCancionesAlbum + "\n"
                + "Cantidad de Canciones = " + cantCanciones + '}';
    }

}
