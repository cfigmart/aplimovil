package edu.unicauca.principal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FragmentoContactos fragmentoContactos;
    FragmentoMusica fragmentoMusica;
    FragmentoInformacion fragmentoInformacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentoContactos = new FragmentoContactos();

        getSupportFragmentManager().beginTransaction().add(R.id.contenedorFragment, getFragmentoContactos()).commit();

    }

    public void onClick(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        switch (view.getId()){
            case R.id.cardContactos:
                fragmentTransaction = getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragment, getFragmentoContactos());
                break;
            case R.id.cardMusica:
                fragmentTransaction = getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragment, getFragmentoMusica());
                break;
            case R.id.cardInformacion:
                fragmentTransaction = getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragment, getFragmentoInformacion());
                break;
            default:
                fragmentTransaction = getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragment, getFragmentoContactos());
                break;
        }
        fragmentTransaction.commit();
    }

    public FragmentoContactos getFragmentoContactos() {
        if(fragmentoContactos == null)
            fragmentoContactos = new FragmentoContactos();

        return fragmentoContactos;
    }

    public FragmentoMusica getFragmentoMusica() {
        if(fragmentoMusica == null)
            fragmentoMusica = new FragmentoMusica();
        return fragmentoMusica;
    }

    public FragmentoInformacion getFragmentoInformacion() {
        if(fragmentoInformacion == null)
            fragmentoInformacion = new FragmentoInformacion();
        return fragmentoInformacion;
    }
}