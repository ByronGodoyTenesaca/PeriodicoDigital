package ec.edu.ups.clases;

/**
 * EstructuraPeriodico
 * 
 * clase que permite estructurar mi periodico digital 
 * 
 * @version 2.0
 * @since 2019
 * @author Byron
 * @see http://ups.edu.ec
 */

public class EstructuraPeriodico {

    private String ubicacion;
    private String nombrePeriodico;
    private String fecha;

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setNombrePeriodico(String nombrePeriodico) {
        this.nombrePeriodico = nombrePeriodico;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getUbicacion(){
        return this.ubicacion;
    }
    public String getNombrePeriodico(){
        return this.nombrePeriodico;
    }
    public String getFecha(){
        return this.fecha;
    }

}
