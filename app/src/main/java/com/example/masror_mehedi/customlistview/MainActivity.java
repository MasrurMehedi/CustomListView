package com.example.masror_mehedi.customlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView customList;
    String countryName[] = {"Banglades","India","America","Australia","China","New Zeland","Portogal"};
    int flags[] = {R.drawable.bd,R.drawable.india,R.drawable.america,R.drawable.australia,R.drawable.china,R.drawable.new_zealand,R.drawable.portugle};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customList =findViewById(R.id.listview);
        CustomAdapter adapter = new CustomAdapter(MainActivity.this,countryName,flags);
        customList.setAdapter(adapter);

        customList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("name",countryName[position]);
                Toast.makeText(MainActivity.this,countryName[position],Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });


    }
}
