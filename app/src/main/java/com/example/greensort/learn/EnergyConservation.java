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
import com.example.greensort.databinding.FragmentEnergyConservationBinding;


public class EnergyConservation extends Fragment {

    private FragmentEnergyConservationBinding fragmentEnergyConservationBinding;
    private TextView energyConservationTextView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentEnergyConservationBinding = FragmentEnergyConservationBinding.inflate(inflater, container, false);

        View view = fragmentEnergyConservationBinding.getRoot();
        energyConservationTextView = fragmentEnergyConservationBinding.energyConservationTxtView;
        energyConservationTextView.setText(HtmlCompat.fromHtml(getString(R.string.energy_conservation_content), HtmlCompat.FROM_HTML_MODE_LEGACY));

        return view;
    }
}