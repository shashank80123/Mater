package com.example.grocerystore;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class fruits extends AppCompatActivity {

    CardView appleCard, strawberryCard, pomegranateCard;
    CardView pineappleCard, mangoCard, blackGrapesCard;
    CardView grapesCard, cantaloupeCard;

    FrameLayout fragmentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        // Card references
        appleCard = findViewById(R.id.apple);
        strawberryCard = findViewById(R.id.strawberry);
        pomegranateCard = findViewById(R.id.pomegranates);
        pineappleCard = findViewById(R.id.pineapple);
        mangoCard = findViewById(R.id.mango);
        blackGrapesCard = findViewById(R.id.blackgrapes);
        cantaloupeCard = findViewById(R.id.cantaloupe);

        fragmentContainer = findViewById(R.id.fragment_container);  // Initialize fragmentContainer

        // Listeners with correct class names
        appleCard.setOnClickListener(v -> loadFragment(new apple()));
        strawberryCard.setOnClickListener(v -> loadFragment(new staberry()));
        pomegranateCard.setOnClickListener(v -> loadFragment(new pomegranates()));
        pineappleCard.setOnClickListener(v -> loadFragment(new pineapple()));
        mangoCard.setOnClickListener(v -> loadFragment(new mango()));
        blackGrapesCard.setOnClickListener(v -> loadFragment(new blackgrapes()));
        cantaloupeCard.setOnClickListener(v -> loadFragment(new cantal()));
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
