package edu.unicauca.main;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Usuario> listaUsuarios;
    RecyclerView recylerUsuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaUsuarios = new ArrayList<>();
        recylerUsuarios = findViewById(R.id.idRecyclerView);
        recylerUsuarios.setLayoutManager(new LinearLayoutManager(this));

        cargarUsuarios();

        AdaptadorUsuarios adaptadorUsuarios = new AdaptadorUsuarios(getListaUsuarios());
        recylerUsuarios.setAdapter(adaptadorUsuarios);
    }

    public ArrayList<Usuario> getListaUsuarios() {
        if (listaUsuarios == null)
            listaUsuarios = new ArrayList<Usuario>();
        return listaUsuarios;
    }

    private void cargarUsuarios() {
        getListaUsuarios().add(new Usuario(
                "Maria",
                "Estudiante FIET",
                1));
        getListaUsuarios().add(new Usuario(
                "Carlos",
                "Estudiante FIET",
                2));
        getListaUsuarios().add(new Usuario(
                "Juan",
                "Estudiante FIET",
                3));
        getListaUsuarios().add(new Usuario(
                "Pedro",
                "Estudiante FIET",
                4));
        getListaUsuarios().add(new Usuario(
                "Helena",
                "Estudiante FIET",
                5));
        getListaUsuarios().add(new Usuario(
                "Ana",
                "Estudiante FIET",
                6));
        getListaUsuarios().add(new Usuario(
                "Luisa",
                "Estudiante FIET",
                7));
        getListaUsuarios().add(new Usuario(
                "Macarena",
                "Estudiante FIET",
                8));
        getListaUsuarios().add(new Usuario(
                "Ernesto",
                "Estudiante FIET",
                9));
        getListaUsuarios().add(new Usuario(
                "Pedro",
                "Estudiante FIET",
                10));

    }
}