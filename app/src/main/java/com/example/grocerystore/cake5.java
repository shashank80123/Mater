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

public class cake5 extends Fragment {

    private ImageButton fabBack, btnAdd, btnSubtract;
    private TextView solutionTv;
    private Button addToCartBtn;
    private int quantity = 0;

    public cake5() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cake5, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Initialize UI components
        fabBack = view.findViewById(R.id.fab_back);
        btnAdd = view.findViewById(R.id.btn_add);
        btnSubtract = view.findViewById(R.id.btn_subtract);
        solutionTv = view.findViewById(R.id.solution_Tv);
        addToCartBtn = view.findViewById(R.id.addtocart);

        updateQuantity();

        // Back button click handler
        fabBack.setOnClickListener(v -> requireActivity().onBackPressed());

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

        // Add to cart
        addToCartBtn.setOnClickListener(v -> {
            if (quantity > 0) {
                Toast.makeText(getContext(), quantity + " item(s) added to cart", Toast.LENGTH_SHORT).show();
                // TODO: Store in cart logic
            } else {
                Toast.makeText(getContext(), "Please select quantity before adding to cart", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void updateQuantity() {
        solutionTv.setText(String.valueOf(quantity));
    }
}
