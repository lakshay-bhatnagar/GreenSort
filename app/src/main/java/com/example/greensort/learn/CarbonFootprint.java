package com.example.greensort.learn;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.text.HtmlCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.greensort.R;
import com.example.greensort.databinding.FragmentCarbonFootprintBinding;
import com.example.greensort.databinding.FragmentEnergyConservationBinding;


public class CarbonFootprint extends Fragment {

    private FragmentCarbonFootprintBinding fragmentCarbonFootprintBinding;

    private Button carbonFootprintCalculator;
    private TextView carbonFootprintTextView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentCarbonFootprintBinding = FragmentCarbonFootprintBinding.inflate(inflater, container, false);

        View view = fragmentCarbonFootprintBinding.getRoot();

        carbonFootprintTextView = fragmentCarbonFootprintBinding.carbonFootprintTextView;
        carbonFootprintCalculator = fragmentCarbonFootprintBinding.carbonFootprintCalculator;

        carbonFootprintTextView.setText(HtmlCompat.fromHtml(getString(R.string.carbon_footprint_resources), HtmlCompat.FROM_HTML_MODE_LEGACY));

        carbonFootprintCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_carbonFootprint2_to_carbonFootprintCalculatorFragment);
            }
        });
        return view;
    }
}