package lab6p2_víctorromero;

import java.util.ArrayList;

public class Cliente extends Usuario {

    ArrayList<Cancion> cancionesFav;
    ArrayList<Cancion> listaReproduccion;
    ArrayList<Cancion> listaReproduccionLIKE;

    public Cliente() {
        super();
    }

    public Cliente(ArrayList<Cancion> cancionesFav, ArrayList<Cancion> listaReproduccion, ArrayList<Cancion> listaReproduccionLIKE, String username, String contraseña, int edad) {
        super(username, contraseña, edad);
        this.cancionesFav = cancionesFav;
        this.listaReproduccion = listaReproduccion;
        this.listaReproduccionLIKE = listaReproduccionLIKE;
    }

    public ArrayList<Cancion> getCancionesFav() {
        return cancionesFav;
    }

    public void setCancionesFav(ArrayList<Cancion> cancionesFav) {
        this.cancionesFav = cancionesFav;
    }

    public ArrayList<Cancion> getListaReproduccion() {
        return listaReproduccion;
    }

    public void setListaReproduccion(ArrayList<Cancion> listaReproduccion) {
        this.listaReproduccion = listaReproduccion;
    }

    public ArrayList<Cancion> getListaReproduccionLIKE() {
        return listaReproduccionLIKE;
    }

    public void setListaReproduccionLIKE(ArrayList<Cancion> listaReproduccionLIKE) {
        this.listaReproduccionLIKE = listaReproduccionLIKE;
    }

    @Override
    public String toString() {
        return ">> Cliente <<" + "\n"
                + "Canciones Favoritas =" + cancionesFav + "\n"
                + "Lista de Reproduccion =" + listaReproduccion + "\n"
                + "Lista de Reproduccion con LIKE=" + listaReproduccionLIKE + '}';
    }

}
