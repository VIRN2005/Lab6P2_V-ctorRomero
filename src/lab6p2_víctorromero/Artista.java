/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_víctorromero;

import java.util.ArrayList;

public class Artista extends Usuario {

    private String nombreArtistico;
    private ArrayList<Cancion> listaCanciones;
    private ArrayList<Albumes> listaAlbumes;

    public Artista() {
        super();
    }

    public Artista(String nombreArtistico, ArrayList<Cancion> listaCanciones, ArrayList<Albumes> listaAlbumes, String username, String contraseña, int edad) {
        super(username, contraseña, edad);
        this.nombreArtistico = nombreArtistico;
        this.listaCanciones = listaCanciones;
        this.listaAlbumes = listaAlbumes;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public ArrayList<Cancion> getListaCanciones() {
        return listaCanciones;
    }

    public void setListaCanciones(ArrayList<Cancion> listaCanciones) {
        this.listaCanciones = listaCanciones;
    }

    public ArrayList<Albumes> getListaAlbumes() {
        return listaAlbumes;
    }

    public void setListaAlbumes(ArrayList<Albumes> listaAlbumes) {
        this.listaAlbumes = listaAlbumes;
    }

    @Override
    public String toString() {
        return ">> Artista <<\n" + ""
                + "Nombre Artistico =" + nombreArtistico + "\n"
                + "Lista de Canciones =" + listaCanciones + "\n"
                + "Lista de Albumes=" + listaAlbumes + '}';
    }

}
