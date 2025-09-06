package com.example.grocerystore;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class cabbage extends Fragment {

    private int quantity = 0;
    private TextView quantityText;
    private ImageButton btnAdd, btnSubtract;
    private Button btnAddToCart;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cabbage, container, false);

        quantityText = view.findViewById(R.id.solution_Tv);
        btnAdd = view.findViewById(R.id.btn_add);
        btnSubtract = view.findViewById(R.id.btn_subtract);
        btnAddToCart = view.findViewById(R.id.addtocart);

        btnAdd.setOnClickListener(v -> {
            quantity++;
            updateQuantity();
        });

        btnSubtract.setOnClickListener(v -> {
            if (quantity > 0) {
                quantity--;
                updateQuantity();
            }
        });

        btnAddToCart.setOnClickListener(v -> {
            if (quantity > 0) {
                Toast.makeText(getActivity(), quantity + " Cabbage(s) added to cart", Toast.LENGTH_SHORT).show();
                // TODO: Implement actual cart logic here
            } else {
                Toast.makeText(getActivity(), "Please select quantity", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    private void updateQuantity() {
        quantityText.setText(String.valueOf(quantity));
    }
}
