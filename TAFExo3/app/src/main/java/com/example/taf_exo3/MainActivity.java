package com.example.taf_exo3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.bouton1);
        button1.setOnClickListener(this::onClick);
    }

    public void onClick(View v) {
        Toast.makeText(this,"Nous sommes écoutés !", Toast.LENGTH_LONG).show();
    }
}