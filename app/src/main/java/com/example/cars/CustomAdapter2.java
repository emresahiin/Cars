package com.example.cars;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CustomAdapter2 extends BaseAdapter {
    private Context context;
    private int layouttip;
    private ArrayList<modelclass> liste;

    public CustomAdapter2(Context context,int layouttip, ArrayList<modelclass> liste)
    {
        this.context = context;
        this.layouttip = layouttip;
        this.liste = liste;
    }

    @Override
    public int getCount() {
        return liste.size();
    }

    @Override
    public Object getItem(int position) {
        return liste.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView =
                LayoutInflater.from(context).inflate(layouttip,null);
        ImageView img = convertView.findViewById(R.id.imageView);
        TextView txt1 = convertView.findViewById(R.id.textView2);
        TextView txt2 = convertView.findViewById(R.id.textView3);
        Picasso.get().load(liste.get(position).getModel_logo()).into(img);
        txt1.setText(liste.get(position).getModel_ad());
        txt2.setText(liste.get(position).getModel_desc());

        return convertView;
    }
}
