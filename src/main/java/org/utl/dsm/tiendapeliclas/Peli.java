package org.utl.dsm.tiendapeliclas;

public class Peli {
    String id;
    String titulo;
    String anio;
    String genero;
    String costo;
    public Peli() {
    }

    public Peli(String id, String titulo, String anio, String genero, String costo) {
        this.id = id;
        this.titulo = titulo;
        this.anio = anio;
        this.genero = genero;
        this.costo = costo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Peli{");
        sb.append("id=").append(id);
        sb.append(", titulo=").append(titulo);
        sb.append(", anio=").append(anio);
        sb.append(", genero=").append(genero);
        sb.append(", costo=").append(costo);
        sb.append('}');
        return sb.toString();
    }
}
