package com.example.grocerystore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Viewall1 extends AppCompatActivity {

    CardView cardFruits, cardVegetables, cardPestri, cardMasala, cardElectronics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_viewall1);

        // Initialize CardViews
        cardFruits = findViewById(R.id.fruits);
        cardVegetables = findViewById(R.id.vegetables);
        cardPestri = findViewById(R.id.pestri);
        cardMasala = findViewById(R.id.mashala);
        cardElectronics = findViewById(R.id.electronics);

        // Set click listeners for each CardView
        cardFruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Viewall1.this, fruits.class);
                startActivity(intent);
            }
        });

        cardVegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Viewall1.this, Vegetables.class);
                startActivity(intent);
            }
        });

        cardPestri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Viewall1.this, pestri.class); // Or "Pastry.class" if you fix naming
                startActivity(intent);
            }
        });

        cardMasala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Viewall1.this, mashala.class);
                startActivity(intent);
            }
        });

        cardElectronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Viewall1.this, electronics.class);
                startActivity(intent);
            }
        });
    }
}
