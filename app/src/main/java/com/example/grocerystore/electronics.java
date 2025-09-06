package com.example.grocerystore;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

public class electronics extends AppCompatActivity {

    CardView cardWashing, cardOven, cardMixture, cardFilter, cardVacuum, cardTv, cardFridge, cardAc, cardIron;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_electronics);

        // Handle window insets for edge-to-edge display
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize cards
        cardWashing = findViewById(R.id.card_washing);
        cardOven = findViewById(R.id.card_oven);
        cardMixture = findViewById(R.id.card_mixture);
        cardFilter = findViewById(R.id.card_filter);
        cardVacuum = findViewById(R.id.card_vacuum);
        cardTv = findViewById(R.id.card_tv);
        cardFridge = findViewById(R.id.card_fridge);
        cardAc = findViewById(R.id.card_ac);
        cardIron = findViewById(R.id.card_iron);

        // Set click listeners to load fragments
        cardWashing.setOnClickListener(v -> loadFragment(new mashine1()));
        cardOven.setOnClickListener(v -> loadFragment(new machine2()));
        cardMixture.setOnClickListener(v -> loadFragment(new machine3()));
        cardFilter.setOnClickListener(v -> loadFragment(new machine4()));
        cardVacuum.setOnClickListener(v -> loadFragment(new machine5()));
        cardTv.setOnClickListener(v -> loadFragment(new machine6()));
        cardFridge.setOnClickListener(v -> loadFragment(new machine7()));
        cardAc.setOnClickListener(v -> loadFragment(new machine8()));
        cardIron.setOnClickListener(v -> loadFragment(new machine9()));
    }

    private void loadFragment(Fragment fragment) {
        // Show fragment container and replace with selected fragment
        View fragmentContainer = findViewById(R.id.fragment_container);
        fragmentContainer.setVisibility(View.VISIBLE);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit();
    }
}
