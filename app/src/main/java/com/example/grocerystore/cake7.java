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

public class cake7 extends Fragment {

    private ImageButton fabBack, btnAdd, btnSubtract;
    private TextView solutionTv;
    private Button addToCartBtn;
    private int quantity = 0;

    public cake7() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cake7, container, false); // Ensure your layout file is named fragment_cake7.xml
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Bind views
        fabBack = view.findViewById(R.id.fab_back);
        btnAdd = view.findViewById(R.id.btn_add);
        btnSubtract = view.findViewById(R.id.btn_subtract);
        solutionTv = view.findViewById(R.id.solution_Tv);
        addToCartBtn = view.findViewById(R.id.addtocart);

        // Initialize quantity display
        updateQuantity();

        // Back button functionality
        fabBack.setOnClickListener(v -> requireActivity().onBackPressed());

        // Increment button
        btnAdd.setOnClickListener(v -> {
            quantity++;
            updateQuantity();
        });

        // Decrement button
        btnSubtract.setOnClickListener(v -> {
            if (quantity > 0) {
                quantity--;
                updateQuantity();
            }
        });

        // Add to cart button
        addToCartBtn.setOnClickListener(v -> {
            if (quantity > 0) {
                Toast.makeText(getContext(), quantity + " Chocolate Cakes added to cart", Toast.LENGTH_SHORT).show();
                // TODO: Add cart logic if needed
            } else {
                Toast.makeText(getContext(), "Please select quantity first", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void updateQuantity() {
        solutionTv.setText(String.valueOf(quantity));
    }
}
