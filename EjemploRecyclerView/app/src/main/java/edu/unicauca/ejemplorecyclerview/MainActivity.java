package edu.unicauca.ejemplorecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

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

        AdaptadorUsuarios adaptadorUsuarios = new AdaptadorUsuarios(listaUsuarios);
        recylerUsuarios.setAdapter(adaptadorUsuarios);
    }

    private void cargarUsuarios() {
        listaUsuarios.add(new Usuario(
                "Maria",
                "Estudiante FIET",
                1));
        listaUsuarios.add(new Usuario(
                "Carlos",
                "Estudiante FIET",
                2));
        listaUsuarios.add(new Usuario(
                "Juan",
                "Estudiante FIET",
                3));
        listaUsuarios.add(new Usuario(
                "Pedro",
                "Estudiante FIET",
                4));
        listaUsuarios.add(new Usuario(
                "Helena",
                "Estudiante FIET",
                5));
        listaUsuarios.add(new Usuario(
                "Ana",
                "Estudiante FIET",
                6));
        listaUsuarios.add(new Usuario(
                "Luisa",
                "Estudiante FIET",
                7));
        listaUsuarios.add(new Usuario(
                "Macarena",
                "Estudiante FIET",
                8));
        listaUsuarios.add(new Usuario(
                "Ernesto",
                "Estudiante FIET",
                9));
        listaUsuarios.add(new Usuario(
                "Pedro",
                "Estudiante FIET",
                10));

    }
}