package edu.unicauca.principal;

import android.view.View;
import android.widget.ImageView;

import androidx.core.content.ContextCompat;
import androidx.databinding.BindingAdapter;

public class Usuario {
    private String nombre;
    private String descripcion;
    private int foto;

    public Usuario(String nombre, String descripcion, int foto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    @BindingAdapter("android:imageURL")
    public static void loadImage(View view, int imageID){
        ImageView image = (ImageView) view;
        image.setImageDrawable(ContextCompat.getDrawable(image.getContext(),imageID));
    }

}
