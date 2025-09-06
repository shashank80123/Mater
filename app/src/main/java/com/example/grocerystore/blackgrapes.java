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

public class blackgrapes extends Fragment {

    private int quantity = 0;
    private TextView quantityTextView;
    private ImageButton btnAdd, btnSubtract, backBtn;
    private Button addToCart;

    public blackgrapes() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout
        return inflater.inflate(R.layout.fragment_blackgrapes, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Link views
        quantityTextView = view.findViewById(R.id.solution_Tv);
        btnAdd = view.findViewById(R.id.btn_add);
        btnSubtract = view.findViewById(R.id.btn_subtract);
        backBtn = view.findViewById(R.id.fab_back);
        addToCart = view.findViewById(R.id.addtocart);

        // Add quantity
        btnAdd.setOnClickListener(v -> {
            quantity++;
            updateQuantity();
        });

        // Subtract quantity
        btnSubtract.setOnClickListener(v -> {
            if (quantity > 0) {
                quantity--;
                updateQuantity();
            }
        });

        // Back button
        backBtn.setOnClickListener(v -> {
            requireActivity().getSupportFragmentManager().popBackStack();
        });

        // Add to cart button
        addToCart.setOnClickListener(v -> {
            if (quantity > 0) {
                Toast.makeText(getContext(), quantity + " black grapes added to cart", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getContext(), "Please select at least 1 item", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void updateQuantity() {
        quantityTextView.setText(String.valueOf(quantity));
    }
}
