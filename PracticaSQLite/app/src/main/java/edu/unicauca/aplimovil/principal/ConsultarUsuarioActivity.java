package edu.unicauca.aplimovil.principal;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import edu.unicauca.aplimovil.persistence.connection.ConexionSQLiteHelper;
import edu.unicauca.aplimovil.utils.Utilidades;

public class ConsultarUsuarioActivity extends AppCompatActivity {
    EditText campo_id;
    EditText campo_nombre;
    EditText campo_telefono;

    ConexionSQLiteHelper conn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_usuario);

        conn = new ConexionSQLiteHelper(this, "bd_usuarios", null, 1);


        campo_id = (EditText)findViewById(R.id.etConsultarID);
        campo_nombre = (EditText)findViewById(R.id.etResultadoNombre);
        campo_telefono = (EditText)findViewById(R.id.etResultadoTelefono);

    }

    public void onClick(View view) {
        consultarUsuario();
    }

    private void consultarUsuario() {
        SQLiteDatabase db = conn.getReadableDatabase();
        String[] parametros = {campo_id.getText().toString()};
        String[] campos = {Utilidades.CAMPO_NOMBRE, Utilidades.CAMPO_TELEFONO};

        try {
            Cursor cursor = db.query(Utilidades.TABLA_USUARIO, campos, Utilidades.CAMPO_ID+"=?", parametros,
            Utilidades.CAMPO_NOMBRE, null, null, null);
            cursor.moveToFirst();
            campo_nombre.setText(cursor.getString(0));
            campo_telefono.setText(cursor.getString(1));


        }catch (Exception ex){
            Toast.makeText(getApplicationContext(), R.string.db_error, Toast.LENGTH_LONG).show();
            limpiar();
        }
    }

    private void limpiar() {
        campo_nombre.setText("");
        campo_telefono.setText("");
        campo_id.setText("");
    }
}