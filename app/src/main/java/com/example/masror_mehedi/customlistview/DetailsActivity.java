package com.example.masror_mehedi.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    TextView textName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        textName = findViewById(R.id.txt_name);

        String getNmae = getIntent().getExtras().getString("name");
        textName.setText(getNmae);
    }
}
