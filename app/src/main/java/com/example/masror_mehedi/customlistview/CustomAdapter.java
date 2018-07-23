package com.example.masror_mehedi.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Masror_MEHEDI on 7/8/2018.
 */

public class CustomAdapter extends BaseAdapter{


    String countryName[];
    int flags[];
    LayoutInflater inflater;//for inflate list view items
    public CustomAdapter(Context context,String country[],int flags[])
    {
        countryName = country;
        this.flags = flags;
        inflater =(LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return countryName.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        view = inflater.inflate(R.layout.list_items,viewGroup,false);
        ImageView image =view.findViewById(R.id.imageView);
        TextView country = view.findViewById(R.id.txt_country);

        image.setImageResource(flags[position]);
        country.setText(countryName[position]);
        return view;
    }
}
