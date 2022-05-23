package com.example.taf_exo4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button bouton1;
    private Button bouton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bouton1 = findViewById(R.id.bouton1);
        bouton1.setOnClickListener(this::onClick);
        bouton2 = findViewById(R.id.bouton2);
        bouton2.setOnClickListener(this::onClick);
    }

    public void onClick(View v) {
        if (v == bouton1) {
            Toast.makeText(this, "Ecouté par le bouton 1!", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Ecouté par le bouton 2!", Toast.LENGTH_SHORT).show();
        }
    }
}
