package com.example.grocerystore;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class mashine1 extends Fragment {

    private TextView solutionTv;
    private int quantity = 0;

    public mashine1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mashine1, container, false);

        // Initialize UI elements
        ImageButton btnAdd = view.findViewById(R.id.btn_add);
        ImageButton btnSubtract = view.findViewById(R.id.btn_subtract);
        ImageButton btnBack = view.findViewById(R.id.fab_back);
        Button addToCart = view.findViewById(R.id.addtocart);
        solutionTv = view.findViewById(R.id.solution_Tv);

        // Add button click
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity++;
                updateQuantityText();
            }
        });

        // Subtract button click
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantity > 0) {
                    quantity--;
                    updateQuantityText();
                }
            }
        });

        // Back button click
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requireActivity().onBackPressed(); // or use Navigation if using Navigation Component
            }
        });

        // Add to Cart button
        addToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Added to cart: " + quantity + " item(s)", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    private void updateQuantityText() {
        solutionTv.setText(String.valueOf(quantity));
    }
}
