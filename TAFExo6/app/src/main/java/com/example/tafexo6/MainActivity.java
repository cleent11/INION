package com.example.tafexo6;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Button bouton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText texte = findViewById(R.id.texte1);
        bouton1 = findViewById(R.id.bouton1);
        bouton1.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, ""+texte.getText().toString(), Toast.LENGTH_SHORT).show();
                    }
                }
        );

    }
}