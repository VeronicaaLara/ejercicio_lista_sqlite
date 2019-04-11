package com.example.ejerciciogson;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class DatoAdapter extends ArrayAdapter<Dato> {

    Context context;
    List<Dato> datoList;

    public DatoAdapter(@NonNull Context context, List<Dato> datoList) {
        super(context, 0, datoList);
        this.context = context;
        this.datoList = datoList;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (null == convertView) {
            convertView = inflater.inflate(
                    R.layout.item,
                    parent,
                    false);
        }

        TextView name = convertView.findViewById(R.id.name);
        TextView email = convertView.findViewById(R.id.email);

        Dato item = datoList.get(position);

        name.setText(item.getName());
        email.setText(item.getEmail());

        return convertView;

    }
}
