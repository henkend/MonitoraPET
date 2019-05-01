package com.hfad.monitorapet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class listaAdapter2 extends ArrayAdapter<String> {

    Context context;
    int layoutResourceId;
    String data[] = null;

    public listaAdapter2(Context context, int resource, String[] data, String[] img) {
        super(context, resource, data);
        this.context = context;
        this.layoutResourceId = resource;
        this.data = data;
    }

    @Override
    public String getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View list_item = convertView;
        // inflate the layout for a single row
        LayoutInflater inflater = LayoutInflater.from(context);
        list_item = inflater.inflate(layoutResourceId, parent, false);

        // get a reference to the different view elements we wish to update
        TextView name = (TextView) list_item.findViewById(R.id.text1);
        TextView desc = (TextView) list_item.findViewById(R.id.text2);


        // get the data from the data array
        String item = data[position];
        String item2 = data[position];

        // setting the view to reflect the data we need to display
        name.setText(item);
        desc.setText(item2);

        //returning the row view (because this is called getView after all)
        return list_item;
    }
}
