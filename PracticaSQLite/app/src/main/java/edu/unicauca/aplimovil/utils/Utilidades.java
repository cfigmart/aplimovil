package edu.unicauca.aplimovil.utils;

public class Utilidades {
    public static final String TABLA_USUARIO = "usuarios";
    public static final String CAMPO_ID = "id";
    public static final String CAMPO_NOMBRE = "nombre";
    public static final String CAMPO_TELEFONO = "telefono";

    public static final String CREATE_TABLA_USUARIO =
            "CREATE TABLE "+TABLA_USUARIO+" ("+CAMPO_ID+" INTEGER, "+CAMPO_NOMBRE+" TEXT, "+
                    CAMPO_TELEFONO+" TEXT) ";
    public static final String DROP_TABLA_USUARIOS =
            "DROP TABLE IF EXISTS "+TABLA_USUARIO;



}
