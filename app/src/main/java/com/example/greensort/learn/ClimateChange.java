package com.example.greensort.learn;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.text.HtmlCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.greensort.R;
import com.example.greensort.databinding.FragmentClimateChangeBinding;
import com.example.greensort.databinding.FragmentEnergyConservationBinding;

public class ClimateChange extends Fragment {

    private FragmentClimateChangeBinding fragmentClimateChangeBinding;

    private TextView climateChangeTextView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentClimateChangeBinding = FragmentClimateChangeBinding.inflate(inflater, container, false);

        View view = fragmentClimateChangeBinding.getRoot();

        climateChangeTextView = fragmentClimateChangeBinding.climateChangeTextView;

        climateChangeTextView.setText(HtmlCompat.fromHtml(getString(R.string.climate_change_info), HtmlCompat.FROM_HTML_MODE_LEGACY));
        return view;
    }
}