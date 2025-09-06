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

public class mashala extends AppCompatActivity {

    CardView catchMasala, khadaMasala, chickenMasala, sambharMasala, teaMasala, biryaniMasala;
    CardView hotMasala, chatMasala, garamMasala;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mashala);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize CardViews
        catchMasala = findViewById(R.id.catchMasala);
        khadaMasala = findViewById(R.id.khadaMasala);
        chickenMasala = findViewById(R.id.chickenMasala);
        sambharMasala = findViewById(R.id.sambharMasala);
        teaMasala = findViewById(R.id.teaMasala);
        biryaniMasala = findViewById(R.id.biryaniMasala);
        hotMasala = findViewById(R.id.hotMasala);
        chatMasala = findViewById(R.id.chatMasala);
        garamMasala = findViewById(R.id.garamMasala);

        // Example: set click listeners to load fragments or do something
        catchMasala.setOnClickListener(v -> loadFragment(new masala1()));
        khadaMasala.setOnClickListener(v -> loadFragment(new masala2()));
        chickenMasala.setOnClickListener(v -> loadFragment(new masala3()));
        sambharMasala.setOnClickListener(v -> loadFragment(new masala4()));
        teaMasala.setOnClickListener(v -> loadFragment(new masala5()));
        biryaniMasala.setOnClickListener(v -> loadFragment(new masala6()));
        hotMasala.setOnClickListener(v -> loadFragment(new masala7()));
        chatMasala.setOnClickListener(v -> loadFragment(new masala8()));
        garamMasala.setOnClickListener(v -> loadFragment(new masala9()));
    }

    private void loadFragment(Fragment fragment) {
        // Assuming you have a fragment container in activity_mashala.xml with id fragment_container
        findViewById(R.id.fragment_container).setVisibility(View.VISIBLE);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit();
    }
}
