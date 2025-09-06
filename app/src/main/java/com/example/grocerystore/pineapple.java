package com.example.grocerystore;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class pineapple extends Fragment {

    private int quantity = 0;
    private TextView quantityTextView;
    private ImageButton btnAdd, btnSubtract, backBtn;
    private Button addToCartBtn;

    public pineapple() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pineapple, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Bind views
        quantityTextView = view.findViewById(R.id.solution_Tv);
        btnAdd = view.findViewById(R.id.btn_add);
        btnSubtract = view.findViewById(R.id.btn_subtract);
        backBtn = view.findViewById(R.id.fab_back);
        addToCartBtn = view.findViewById(R.id.addtocart);

        // Increase quantity
        btnAdd.setOnClickListener(v -> {
            quantity++;
            updateQuantity();
        });

        // Decrease quantity
        btnSubtract.setOnClickListener(v -> {
            if (quantity > 0) {
                quantity--;
                updateQuantity();
            }
        });

        // Add to cart logic
        addToCartBtn.setOnClickListener(v -> {
            if (quantity > 0) {
                Toast.makeText(getContext(), quantity + " pineapple(s) added to cart", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getContext(), "Please select at least 1 item", Toast.LENGTH_SHORT).show();
            }
        });

        // Back button logic
        backBtn.setOnClickListener(v -> {
            requireActivity().getSupportFragmentManager().popBackStack();
        });
    }

    private void updateQuantity() {
        quantityTextView.setText(String.valueOf(quantity));
    }
}
