package com.example.tafexo5;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bouton1 = findViewById(R.id.bouton1);
        bouton1.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "Ecouté par le 1", Toast.LENGTH_SHORT).show();
                    }
                }
        );

        Button bouton2 = findViewById(R.id.bouton2);
        bouton2.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "Ecouté par le 2", Toast.LENGTH_SHORT).show();
                    }
                }
        );

    }
}