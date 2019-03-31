package ec.edu.ups.clases;

/**
 * Seccion
 * 
 * clase que permite separar varion tiepos de noticias 
 * 
 * @version 2.0
 * @since 2019
 * @author Byron
 * @see http://ups.edu.ec
 */

public class Seccion {

    private String nombre;
    private String noticias;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNoticia(String noticia) {
        this.noticias = noticia;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getNoticia() {
        return this.noticias;
    }
}
