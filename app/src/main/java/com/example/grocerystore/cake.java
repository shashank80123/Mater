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

public class cake extends Fragment {

    private TextView solutionTv;
    private int quantity = 0;

    public cake() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the cake layout XML
        return inflater.inflate(R.layout.fragment_cake, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageButton btnSubtract = view.findViewById(R.id.btn_subtract);
        ImageButton btnAdd = view.findViewById(R.id.btn_add);
        Button addToCartBtn = view.findViewById(R.id.addtocart);
        ImageButton fabBack = view.findViewById(R.id.fab_back);
        solutionTv = view.findViewById(R.id.solution_Tv);

        btnSubtract.setOnClickListener(v -> {
            if (quantity > 0) {
                quantity--;
                updateQuantity();
            }
        });

        btnAdd.setOnClickListener(v -> {
            quantity++;
            updateQuantity();
        });

        addToCartBtn.setOnClickListener(v -> {
            if (quantity > 0) {
                Toast.makeText(getContext(), quantity + " Pestri(s) added to cart", Toast.LENGTH_SHORT).show();
                // TODO: Add real cart logic here
            } else {
                Toast.makeText(getContext(), "Please select at least 1 pestri", Toast.LENGTH_SHORT).show();
            }
        });

        fabBack.setOnClickListener(v -> {
            if (getActivity() != null) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

        updateQuantity();
    }

    private void updateQuantity() {
        solutionTv.setText(String.valueOf(quantity));
    }
}
