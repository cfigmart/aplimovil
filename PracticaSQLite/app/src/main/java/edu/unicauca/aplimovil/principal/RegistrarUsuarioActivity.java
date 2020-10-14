package edu.unicauca.aplimovil.principal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import edu.unicauca.aplimovil.persistence.connection.ConexionSQLiteHelper;
import edu.unicauca.aplimovil.utils.Utilidades;

public class RegistrarUsuarioActivity extends AppCompatActivity {
    EditText campo_id;
    EditText campo_nombre;
    EditText campo_telefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_usuario);

        campo_id = (EditText)findViewById(R.id.etID);
        campo_nombre = (EditText)findViewById(R.id.etNombre);
        campo_telefono = (EditText)findViewById(R.id.etTelefono);

    }

    public void onClick(View view) {
        registrarUsuarios();
    }

    private void registrarUsuarios() {
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this, "bd_usuarios", null, 1);
        SQLiteDatabase db = conn.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Utilidades.CAMPO_ID, campo_id.getText().toString());
        values.put(Utilidades.CAMPO_NOMBRE, campo_nombre.getText().toString());
        values.put(Utilidades.CAMPO_TELEFONO, campo_telefono.getText().toString());

        Long idResultante = db.insert(Utilidades.TABLA_USUARIO, Utilidades.CAMPO_ID, values);
        Toast.makeText(getApplicationContext(), "idRegistro "+idResultante, Toast.LENGTH_SHORT).show();
        db.close();

    }
}