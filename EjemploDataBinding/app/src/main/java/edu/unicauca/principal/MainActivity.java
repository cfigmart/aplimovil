package edu.unicauca.principal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import edu.unicauca.data.AdaptadorUsuariosBinding;
import edu.unicauca.principal.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ArrayList<Usuario> listaUsuarios;
    RecyclerView recylerUsuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.idRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        cargarUsuarios();
        binding.idRecyclerView.setAdapter(new AdaptadorUsuariosBinding(getListaUsuarios(), this));


       /* setContentView(R.layout.activity_main);

        listaUsuarios = new ArrayList<>();
        recylerUsuarios = findViewById(R.id.idRecyclerView);
        recylerUsuarios.setLayoutManager(new LinearLayoutManager(this));

        cargarUsuarios();

        AdaptadorUsuarios adaptadorUsuarios = new AdaptadorUsuarios(getListaUsuarios());
        recylerUsuarios.setAdapter(adaptadorUsuarios);*/
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
                R.drawable.img1));
        getListaUsuarios().add(new Usuario(
                "Carlos",
                "Estudiante FIET",
                R.drawable.img2));
        getListaUsuarios().add(new Usuario(
                "Juan",
                "Estudiante FIET",
                R.drawable.img3));
        getListaUsuarios().add(new Usuario(
                "Pedro",
                "Estudiante FIET",
                R.drawable.img4));
        getListaUsuarios().add(new Usuario(
                "Helena",
                "Estudiante FIET",
                R.drawable.img5));
        getListaUsuarios().add(new Usuario(
                "Ana",
                "Estudiante FIET",
                R.drawable.img6));
        getListaUsuarios().add(new Usuario(
                "Luisa",
                "Estudiante FIET",
                R.drawable.img7));
        getListaUsuarios().add(new Usuario(
                "Macarena",
                "Estudiante FIET",
                R.drawable.img8));
        getListaUsuarios().add(new Usuario(
                "Ernesto",
                "Estudiante FIET",
                R.drawable.img9));
        getListaUsuarios().add(new Usuario(
                "Pedro",
                "Estudiante FIET",
                R.drawable.img10));

    }
}