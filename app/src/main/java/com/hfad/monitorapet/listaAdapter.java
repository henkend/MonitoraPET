package com.hfad.monitorapet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class listaAdapter extends ArrayAdapter<String> {

    Context context;
    int layoutResourceId;
    String data[] = null;
    String img[] = null;

    public listaAdapter(Context context, int resource, String[] data, String[] img) {
        super(context, resource, data);
        this.context = context;
        this.layoutResourceId = resource;
        this.data = data;
        this.img = img;
    }

    @Override
    public String getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        // inflate the layout for a single row
        LayoutInflater inflater = LayoutInflater.from(context);
        row = inflater.inflate(layoutResourceId, parent, false);

        // get a reference to the different view elements we wish to update
        TextView nameView = (TextView) row.findViewById(R.id.nameTextView);
        ImageView imageView = (ImageView) row.findViewById(R.id.imageView);

        // get the data from the data array
        String item = data[position];

        // setting the view to reflect the data we need to display
        nameView.setText(item);

        if (img != null) {
            int resId;
            resId = context.getResources().getIdentifier(img[position], "drawable", context.getPackageName());
            imageView.setImageResource(resId);
        }

        //returning the row view (because this is called getView after all)
        return row;
    }
}
