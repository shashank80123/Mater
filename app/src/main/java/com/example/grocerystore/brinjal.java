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

public class brinjal extends Fragment {

    private int quantity = 0;
    private TextView quantityTextView;
    private ImageButton btnAdd, btnSubtract;
    private Button addToCartBtn;
    private ImageButton backBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_brinjal, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        quantityTextView = view.findViewById(R.id.solution_Tv);
        btnAdd = view.findViewById(R.id.btn_add);
        btnSubtract = view.findViewById(R.id.btn_subtract);
        addToCartBtn = view.findViewById(R.id.addtocart);
        backBtn = view.findViewById(R.id.fab_back);

        quantityTextView.setText(String.valueOf(quantity));

        btnAdd.setOnClickListener(v -> {
            quantity++;
            quantityTextView.setText(String.valueOf(quantity));
        });

        btnSubtract.setOnClickListener(v -> {
            if (quantity > 0) {
                quantity--;
                quantityTextView.setText(String.valueOf(quantity));
            }
        });

        addToCartBtn.setOnClickListener(v -> {
            // Add your add-to-cart logic here
        });

        backBtn.setOnClickListener(v -> {
            requireActivity().getSupportFragmentManager().popBackStack();
        });
    }
}
