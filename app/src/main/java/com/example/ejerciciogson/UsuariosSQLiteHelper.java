package com.example.ejerciciogson;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class UsuariosSQLiteHelper  extends SQLiteOpenHelper {
    //crea la tabla
    String sqlCreate = "CREATE TABLE Usuarios (nombre TEXT, email TEXT)";

    public UsuariosSQLiteHelper (Context contexto, String nombre,
                                 CursorFactory factory, int version){
         super(contexto,nombre, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        //ejecuta la sentencia de la creacion de la tabla
        db.execSQL(sqlCreate);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
