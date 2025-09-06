package com.example.grocerystore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.SearchView;

public class Homepage extends AppCompatActivity {

    SearchView searchView;
    ListView listView;
    ArrayAdapter<String>adapter;
    ScrollView mainContent;
    String[] data = {
            "Apple", "Strawberry", "Pomegranates", "Pineapple", "Mango", "Blackgrapes", "Cantaloupe",
            "Broccoli", "Brinjal", "Cabbage", "Garlic", "Ginger", "Coriander", "Lady Finger", "Onion",
            "Cake", "Pine Cake", "Chocolate Cake", "Vanilla Cake", "Brunch Cake", "Cake Ball",
            "Berry Cake", "Tasty Cake", "Catch Masala", "Khada Masala", "Chicken Masala", "Sambhar Masala",
            "Tea Masala", "Biryani Masala", "Hot Masala", "Chat Masala", "Garam Masala"
    };
    // Category cards
    CardView cardFruits, cardVegetables, cardPestri, cardMasala, cardElectronics;

    // Product cards
    CardView appleCard, strawberryCard, pomegranateCard;
    CardView pineappleCard, mangoCard, blackGrapesCard;
    CardView grapesCard, cantaloupeCard;
    CardView brochli, brinjal, cabbage;
    CardView galic, ginger, kothambir;
    CardView ladyfinger, onion;
    CardView cake1, pinkCake, chocolateCake;
    CardView vanillaCake, bunchCake, cakeBall;
    CardView moreCake1, berryCake, tastyCake;
    CardView catchMasala, khadaMasala, chickenMasala, sambharMasala, teaMasala, biryaniMasala;
    CardView hotMasala, chatMasala, garamMasala;
    CardView cardWashing, cardOven, cardMixture, cardFilter, cardVacuum, cardTv, cardFridge, cardAc, cardIron;

    // Buttons
    Button viewAll1, viewAll2;

    // Fragment container
    FrameLayout fragmentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_homepage);

        // Initialize buttons

        viewAll1 = findViewById(R.id.viewall1);
        viewAll2 = findViewById(R.id.viewall2);

        searchView = findViewById(R.id.searchView);
        listView = findViewById(R.id.listview);
        mainContent = findViewById(R.id.main_content);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data);
        listView.setAdapter(adapter);
        listView.setVisibility(View.GONE);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                adapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);

                if (newText.trim().isEmpty()) {
                    listView.setVisibility(View.GONE);
                    mainContent.setVisibility(View.VISIBLE);
                } else {
                    listView.setVisibility(View.VISIBLE);
                    mainContent.setVisibility(View.GONE);
                }
                return false;
            }
        });
        // Initialize cards
        cardFruits = findViewById(R.id.fruits);
        cardVegetables = findViewById(R.id.vegetables);
        cardPestri = findViewById(R.id.pestri);
        cardMasala = findViewById(R.id.masala);
        cardElectronics = findViewById(R.id.electronics);
        appleCard = findViewById(R.id.apple);
        strawberryCard = findViewById(R.id.strawberry);
        pomegranateCard = findViewById(R.id.pomegranates);
        pineappleCard = findViewById(R.id.pineapple);
        mangoCard = findViewById(R.id.mango);
        blackGrapesCard = findViewById(R.id.blackgrapes);
        cantaloupeCard = findViewById(R.id.cantaloupe);
        brochli = findViewById(R.id.broccoli);
        brinjal = findViewById(R.id.brinjal);
        cabbage = findViewById(R.id.cabbage);
        galic = findViewById(R.id.garlic);
        ginger = findViewById(R.id.ginger);
        kothambir = findViewById(R.id.kothambir);
        ladyfinger = findViewById(R.id.ladyfinger);
        onion = findViewById(R.id.onion);
        cake1 = findViewById(R.id.cake1);
        pinkCake = findViewById(R.id.pinkCake);
        chocolateCake = findViewById(R.id.chocolateCake);
        vanillaCake = findViewById(R.id.vanillaCake);
        bunchCake = findViewById(R.id.bunchCake);
        cakeBall = findViewById(R.id.cakeBall);
        moreCake1 = findViewById(R.id.moreCake1);
        berryCake = findViewById(R.id.berryCake);
        tastyCake = findViewById(R.id.tastyCake);
        catchMasala = findViewById(R.id.catchMasala);
        khadaMasala = findViewById(R.id.khadaMasala);
        chickenMasala = findViewById(R.id.chickenMasala);
        sambharMasala = findViewById(R.id.sambharMasala);
        teaMasala = findViewById(R.id.teaMasala);
        biryaniMasala = findViewById(R.id.biryaniMasala);
        hotMasala = findViewById(R.id.hotMasala);
        chatMasala = findViewById(R.id.chatMasala);
        garamMasala = findViewById(R.id.garamMasala);
        cardWashing = findViewById(R.id.card_washing);
        cardOven = findViewById(R.id.card_oven);
        cardMixture = findViewById(R.id.card_mixture);
        cardFilter = findViewById(R.id.card_filter);
        cardVacuum = findViewById(R.id.card_vacuum);
        cardTv = findViewById(R.id.card_tv);
        cardFridge = findViewById(R.id.card_fridge);
        cardAc = findViewById(R.id.card_ac);
        cardIron = findViewById(R.id.card_iron);


        // Initialize fragment container
        fragmentContainer = findViewById(R.id.fragment_container);




        // View All buttons
        viewAll1.setOnClickListener(v -> startActivity(new Intent(Homepage.this, Viewall1.class)));
        viewAll2.setOnClickListener(v -> startActivity(new Intent(Homepage.this, Viewall2.class)));

        // Main category card clicks
        cardFruits.setOnClickListener(v -> startActivity(new Intent(Homepage.this, fruits.class)));
        cardVegetables.setOnClickListener(v -> startActivity(new Intent(Homepage.this, Vegetables.class)));
        cardPestri.setOnClickListener(v -> startActivity(new Intent(Homepage.this, pestri.class)));
        cardMasala.setOnClickListener(v -> startActivity(new Intent(Homepage.this, mashala.class)));
        cardElectronics.setOnClickListener(v -> startActivity(new Intent(Homepage.this, electronics.class)));

        catchMasala.setOnClickListener(v -> loadFragment(new masala1()));
        khadaMasala.setOnClickListener(v -> loadFragment(new masala2()));
        chickenMasala.setOnClickListener(v -> loadFragment(new masala3()));
        sambharMasala.setOnClickListener(v -> loadFragment(new masala4()));
        teaMasala.setOnClickListener(v -> loadFragment(new masala5()));
        biryaniMasala.setOnClickListener(v -> loadFragment(new masala6()));
        hotMasala.setOnClickListener(v -> loadFragment(new masala7()));
        chatMasala.setOnClickListener(v -> loadFragment(new masala8()));
        garamMasala.setOnClickListener(v -> loadFragment(new masala9()));

        appleCard.setOnClickListener(v -> loadFragment(new apple()));

        strawberryCard.setOnClickListener(v -> loadFragment(new staberry()));
        pomegranateCard.setOnClickListener(v -> loadFragment(new pomegranates()));
        pineappleCard.setOnClickListener(v -> loadFragment(new pineapple()));
        mangoCard.setOnClickListener(v -> loadFragment(new mango()));
        blackGrapesCard.setOnClickListener(v -> loadFragment(new blackgrapes()));
        cantaloupeCard.setOnClickListener(v -> loadFragment(new cantal()));
        brochli.setOnClickListener(v -> loadFragment(new brochii()));
        brinjal.setOnClickListener(v -> loadFragment(new brinjal()));
        cabbage.setOnClickListener(v -> loadFragment(new cabbage()));
        galic.setOnClickListener(v -> loadFragment(new galic()));
        ginger.setOnClickListener(v -> loadFragment(new ginger()));
        kothambir.setOnClickListener(v -> loadFragment(new kolinder()));
        ladyfinger.setOnClickListener(v -> loadFragment(new ladyfinger()));
        onion.setOnClickListener(v -> loadFragment(new onion()));
        cake1.setOnClickListener(v -> loadFragment(new cake()));
        pinkCake.setOnClickListener(v -> loadFragment(new cake2()));
        chocolateCake.setOnClickListener(v -> loadFragment(new cake3()));
        vanillaCake.setOnClickListener(v -> loadFragment(new cake4()));
        bunchCake.setOnClickListener(v -> loadFragment(new cake5()));
        cakeBall.setOnClickListener(v -> loadFragment(new cake6()));
        moreCake1.setOnClickListener(v -> loadFragment(new cake7()));
        berryCake.setOnClickListener(v -> loadFragment(new cake8()));
        tastyCake.setOnClickListener(v -> loadFragment(new cake9()));
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

    // Helper method to load fragments
    private void loadFragment(Fragment fragment) {
        fragmentContainer.setVisibility(View.VISIBLE);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit();
    }
}
