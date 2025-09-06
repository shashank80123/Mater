package com.example.grocerystore;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

public class pestri extends AppCompatActivity {

    // CardView references
    CardView cake1, pinkCake, chocolateCake;
    CardView vanillaCake, bunchCake, cakeBall;
    CardView moreCake1, berryCake, tastyCake;

    FrameLayout fragmentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pestri);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize CardViews
        cake1 = findViewById(R.id.cake1);
        pinkCake = findViewById(R.id.pinkCake);
        chocolateCake = findViewById(R.id.chocolateCake);
        vanillaCake = findViewById(R.id.vanillaCake);
        bunchCake = findViewById(R.id.bunchCake);
        cakeBall = findViewById(R.id.cakeBall);
        moreCake1 = findViewById(R.id.moreCake1);
        berryCake = findViewById(R.id.berryCake);
        tastyCake = findViewById(R.id.tastyCake);

        fragmentContainer = findViewById(R.id.fragment_container);

        // Add click listeners to load fragments (replace with real fragment classes)
        cake1.setOnClickListener(v -> loadFragment(new cake()));
        pinkCake.setOnClickListener(v -> loadFragment(new cake2()));
        chocolateCake.setOnClickListener(v -> loadFragment(new cake3()));
        vanillaCake.setOnClickListener(v -> loadFragment(new cake4()));
        bunchCake.setOnClickListener(v -> loadFragment(new cake5()));
        cakeBall.setOnClickListener(v -> loadFragment(new cake6()));
        moreCake1.setOnClickListener(v -> loadFragment(new cake7()));
        berryCake.setOnClickListener(v -> loadFragment(new cake8()));
        tastyCake.setOnClickListener(v -> loadFragment(new cake9()));
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
