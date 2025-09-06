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

public class cantal extends Fragment {

    private TextView solutionTv;
    private int quantity = 0;

    public cantal() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cantal, container, false);

        ImageButton btnAdd = view.findViewById(R.id.btn_add);
        ImageButton btnSubtract = view.findViewById(R.id.btn_subtract);
        ImageButton btnBack = view.findViewById(R.id.fab_back);
        Button addToCart = view.findViewById(R.id.addtocart);
        solutionTv = view.findViewById(R.id.solution_Tv);

        btnAdd.setOnClickListener(v -> {
            quantity++;
            updateQuantityText();
        });

        btnSubtract.setOnClickListener(v -> {
            if (quantity > 0) {
                quantity--;
                updateQuantityText();
            }
        });

        btnBack.setOnClickListener(v -> requireActivity().onBackPressed());

        addToCart.setOnClickListener(v ->
                Toast.makeText(getActivity(), "Added to cart: " + quantity + " item(s)", Toast.LENGTH_SHORT).show()
        );

        return view;
    }

    private void updateQuantityText() {
        solutionTv.setText(String.valueOf(quantity));
    }
}
