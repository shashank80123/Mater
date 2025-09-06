package com.example.grocerystore;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class Vegetables extends AppCompatActivity {

     CardView brochli, brinjal, cabbage;
    CardView galic, ginger, kothambir;
     CardView ladyfinger, onion;

     FrameLayout fragmentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetables);

        // Initialize CardViews
        brochli = findViewById(R.id.broccoli);
        brinjal = findViewById(R.id.brinjal);
        cabbage = findViewById(R.id.cabbage);
        galic = findViewById(R.id.garlic);
        ginger = findViewById(R.id.ginger);
        kothambir = findViewById(R.id.kothambir);
        ladyfinger = findViewById(R.id.ladyfinger);
        onion = findViewById(R.id.onion);

        // Initialize fragment container
        fragmentContainer = findViewById(R.id.fragment_container);

        // Set click listeners
        brochli.setOnClickListener(v -> loadFragment(new brochii()));
        brinjal.setOnClickListener(v -> loadFragment(new brinjal()));
        cabbage.setOnClickListener(v -> loadFragment(new cabbage()));
        galic.setOnClickListener(v -> loadFragment(new galic()));
        ginger.setOnClickListener(v -> loadFragment(new ginger()));
        kothambir.setOnClickListener(v -> loadFragment(new kolinder()));
        ladyfinger.setOnClickListener(v -> loadFragment(new ladyfinger()));
        onion.setOnClickListener(v -> loadFragment(new onion()));
    }

    private void loadFragment(Fragment fragment) {
        fragmentContainer.setVisibility(View.VISIBLE);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit();
    }
}
