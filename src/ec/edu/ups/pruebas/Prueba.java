package ec.edu.ups.pruebas;

import ec.edu.ups.clases.EstructuraPeriodico;
import ec.edu.ups.clases.Multimedia;
import ec.edu.ups.clases.Noticia;
import ec.edu.ups.clases.RedSocial;
import ec.edu.ups.clases.Seccion;

public class Prueba {

    public static void main(String[] args) {
        RedSocial facebook = new RedSocial();
        facebook.setCodigo(1);
        facebook.setNombre("Facebook");
        facebook.setUrl("www.facebook.com");
        int cod = facebook.getCodigo();
        String nom = facebook.getNombre();
        String url = facebook.getUrl();
        System.out.println("Codigo: " + cod);
        System.out.println("Nombre: " + nom);
        System.out.println("URL: " + url);

        Multimedia imagenes = new Multimedia();
        imagenes.setFormato(".jpg");
        imagenes.setNombre("imagen");
        imagenes.setPath("c:documentos/imagenes");
        imagenes.setTamañoBytes(30.12);
        String forma = imagenes.getFormato();
        double tamaby = imagenes.getTamañoBytes();
        String nomb = imagenes.getNombre();
        String pat = imagenes.getPath();
        System.out.println("formato: " + forma);
        System.out.println("tamañobytes:" + tamaby);
        System.out.println("nombre: " + nomb);
        System.out.println("patn: " + pat);

        Seccion deportes = new Seccion();
        deportes.setNombre("cultural");
        deportes.setNoticia("la danza contemporanea");
        String no = deportes.getNombre();
        String not = deportes.getNoticia();
        System.out.println("nombre: " + no);
        System.out.println("noticia: " + not);

        EstructuraPeriodico portada = new EstructuraPeriodico();
        portada.setUbicacion("lugar");
        portada.setFecha(14 +"/"+ 5+ "/"+ 19);
        portada.setNombrePeriodico("mercurio");
        String ubi = portada.getUbicacion();
        String noPe = portada.getNombrePeriodico();
        String fe = portada.getFecha();
        System.out.println("ubicacion: " + ubi);
        System.out.println("nombreperiodico: " + noPe);
        System.out.println("fecha: " + fe);
        
        
        Noticia autor=new Noticia();
        autor.setAutor("byron godoy");
        autor.setContenido("describe");
        autor.setFecha(14+"/"+5+"/"+19);
        autor.setMultimedia("audio");
        autor.setTitulo("de ultima hora");
        
        String aut=autor.getAutor( );
        String cont=autor.getContenido( );
        String fec=autor.getFecha( );
        String mult=autor.getMultimedia( );
        String tit=autor.getTitulo( );
        System.out.println("Autor: " + aut);
        System.out.println("contenido: " + cont);
        System.out.println("fecha: " + fec);
        System.out.println("titulo: " + tit);
        System.out.println("multimedia: " + mult);
       
    }

}
