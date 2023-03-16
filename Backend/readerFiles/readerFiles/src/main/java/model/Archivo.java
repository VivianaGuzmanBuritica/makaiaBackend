package model;

public class Archivo {
    private String ruta;
    private String tipo;

    public Archivo(String ruta, String tipo) {
        this.ruta = ruta;
        this.tipo = tipo;
    }

    public Archivo() {
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
