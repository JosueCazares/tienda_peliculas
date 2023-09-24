package org.utl.dsm.tiendapeliclas;

public class Pelicula {
    private int idPelicula;
    private String titulo;
    private int anio;
    private String genero;
    private double costo;

    public Pelicula(){

    }

    public Pelicula(int idPelicula, String titulo, int anio, String genero, double costo) {
        this.idPelicula = idPelicula;
        this.titulo = titulo;
        this.anio = anio;
        this.genero = genero;
        this.costo = costo;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

}
