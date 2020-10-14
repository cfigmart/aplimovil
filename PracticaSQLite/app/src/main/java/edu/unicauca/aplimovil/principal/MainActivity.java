package edu.unicauca.aplimovil.principal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent = null;

        switch (item.getItemId()){
            case R.id.itemRegistrar:
                intent = new Intent(MainActivity.this, RegistrarUsuarioActivity.class);
                break;
            case R.id.itemConsultar:
                intent = new Intent(MainActivity.this, ConsultarUsuarioActivity.class);
                break;
        }
        if(intent!=null){
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}