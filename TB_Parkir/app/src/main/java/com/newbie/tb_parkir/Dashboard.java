package com.newbie.tb_parkir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        ImageButton imageButton = findViewById(R.id.statusIN);
        ImageButton imageButton1= findViewById(R.id.statusOut);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Masuk.class);
                Toast.makeText(getApplicationContext(), "Masuk", Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Keluar.class);
                Toast.makeText(getApplicationContext(), "Keluar", Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });
    }
}
