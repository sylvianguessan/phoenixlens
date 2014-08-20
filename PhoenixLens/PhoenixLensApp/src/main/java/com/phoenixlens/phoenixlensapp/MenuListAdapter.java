package com.phoenixlens.phoenixlensapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by sylvianguessan on 8/20/14.
 */
public class MenuListAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values;


    public MenuListAdapter(Context context, String[] v) {
        super(context, R.layout.row_sample_menu, v);
        this.context = context;
        this.values = v;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row_sample_menu, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.categoryTitle);
        textView.setText(values[position]);
        return rowView;


    }
}