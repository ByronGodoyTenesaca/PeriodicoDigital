package ec.edu.ups.clases;

/**
 * Multimedia
 * 
 * clase que permite interpretar las extenciones de los documentos y tamaño
 * 
 * @version 2.0
 * @since 2019
 * @author Byron
 * @see http://ups.edu.ec
 */

public class Multimedia {

    private String formato;
    private double tamañobytes;
    private String path;
    private String nombre;

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setTamañoBytes(double tamañobytes) {
        this.tamañobytes = tamañobytes;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFormato() {
        return this.formato;
    }

    public double getTamañoBytes() {
        return this.tamañobytes;
    }

    public String getPath() {
        return this.path;
    }

    public String getNombre() {
        return this.nombre;
    }
}
