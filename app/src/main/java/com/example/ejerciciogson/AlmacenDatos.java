package com.example.ejerciciogson;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public abstract class AlmacenDatos extends MainActivity {
    private ArrayList<Dato> datoList;

    public AlmacenDatos(Context context, List<Dato> datoList){

        this.datoList = new ArrayList<>();
    }

    public ArrayList<Dato> getDatoList(){
        return datoList;
    }

    public String toJSON(){
        Gson gson = new Gson();
        String json = gson.toJson(this);
        return json;
    }

    public AlmacenDatos fromJSON(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, AlmacenDatos.class);
    }


    public abstract View getView(int position, View convertView, ViewGroup parent);
}
