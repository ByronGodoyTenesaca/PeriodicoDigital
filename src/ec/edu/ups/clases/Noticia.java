package ec.edu.ups.clases;

/**
 * Noticia
 * 
 * clase que permite crear las noticias 
 * 
 * @version 2.0
 * @since 2019
 * @author Byron
 * @see http://ups.edu.ec
 */

public class Noticia {

    private String titulo;
    private String autor;
    private String fecha;
    private String contenido;
    private String multimedia;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setMultimedia(String multimedia) {
        this.multimedia = multimedia;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getFecha() {
        return this.fecha;
    }

    public String getContenido() {
        return this.contenido;
    }

    public String getMultimedia() {
        return this.multimedia;
    }
}
