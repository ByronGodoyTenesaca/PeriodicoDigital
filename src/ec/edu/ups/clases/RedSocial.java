package ec.edu.ups.clases;

/**
 * RedSocial
 * 
 * clase que permite la publicacion en diferentes redes sociales
 * 
 * @version 2.0
 * @since 2019
 * @author Byron
 * @see http://ups.edu.ec
 */

public class RedSocial {
    private int codigo;
    private String nombre;
    private String url;
    private String[] publicaciones;
    
    public void setCodigo(int codigo)
    {
        this.codigo=codigo;
    } 
    
    public void setNombre(String nombre)
    {
        this.nombre=nombre; 
    }
    
    public void setUrl(String url)
    {
        this.url=url;
    }
    
    public int getCodigo()
    {
        return this.codigo;
    }
    
    public String getNombre()
    {   
        return this.nombre;
    }
    
    public String getUrl()
    {
        return this.url;
    }
}
