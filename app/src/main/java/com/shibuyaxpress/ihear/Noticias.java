package com.shibuyaxpress.ihear;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by paulf on 16-Oct-17.
 */

public class Noticias {
    private String nombre;
    private String imagenURL;
    private String contenido;
    private String fecha;

    public Noticias() {
    }

    public Noticias(String imagenURL) {
        this.imagenURL = imagenURL;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagenURL() {
        return imagenURL;
    }

    public void setImagenURL(String imagenURL) {
        this.imagenURL = imagenURL;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    private ArrayList<Noticias> lista=new ArrayList<>();
    public ArrayList<Noticias> getData(){
        Noticias u=new Noticias("https://compass-ssl.xbox.com/assets/3a/f0/3af0da7b-f5d0-418f-88ab-8ae631aafe9d.jpg?n=X1-Wireless-Controller-White_gallery_1056x594_01.jpg");
        lista.add(u);
        u=new Noticias("http://semanaeconomica.com/wp-content/uploads/2014/07/ollantahumala_balancepol%C3%ADtico.jpg");
        lista.add(u);
        u=new Noticias("http://cde.2.trome.pe/ima/0/1/0/8/0/1080838.jpg");
        lista.add(u);
        u=new Noticias("https://blog.holidaylettings.co.uk/wp-content/uploads/2015/04/lifestyle.jpg");
        lista.add(u);
        u=new Noticias("http://andiplay.com/wp-content/uploads/2015/08/tecnologia.jpg");
        lista.add(u);
        u=new Noticias("https://www.almanac.com/sites/default/files/image_nodes/thanksgiving-weather.jpg");
        lista.add(u);

        return lista;
    }
}
