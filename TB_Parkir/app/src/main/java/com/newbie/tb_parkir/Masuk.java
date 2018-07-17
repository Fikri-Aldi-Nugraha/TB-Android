package com.newbie.tb_parkir;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import com.github.clans.fab.FloatingActionButton;

public class Masuk extends AppCompatActivity {

    FloatingActionButton fab1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masuk);
        fab1 = findViewById(R.id.FABTambah);

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder =new AlertDialog.Builder(Masuk.this);
                View view = getLayoutInflater().inflate(R.layout.activity_masuk_tambah, null);
                TextInputEditText et1 = findViewById(R.id.etNoKend);
                RadioGroup group = findViewById(R.id.rgJenis);
                Button button = findViewById(R.id.btnSubmit);
                builder.setView(view);
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }
}
