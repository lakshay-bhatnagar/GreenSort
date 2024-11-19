package com.example.greensort.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.greensort.R;
import com.example.greensort.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding fragmentHomeBinding;
    private Button calculate_carbon_footprint;
    private CardView wasteManagement, waterConservation, energyConservation, biodiversityConservation, climateChange, pollution, sustainableAgriculture, environmentalLaws, carbonFootprint;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        fragmentHomeBinding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = fragmentHomeBinding.getRoot();

        wasteManagement = fragmentHomeBinding.wasteManagement;
        waterConservation = fragmentHomeBinding.waterConservation;
        energyConservation = fragmentHomeBinding.energyConservation;
        biodiversityConservation = fragmentHomeBinding.biodiversityConservation;
        climateChange = fragmentHomeBinding.climateChange;
        pollution = fragmentHomeBinding.pollution;
        sustainableAgriculture = fragmentHomeBinding.sustainableAgriculture;
        environmentalLaws = fragmentHomeBinding.environmentalLaws;
        carbonFootprint = fragmentHomeBinding.carbonFootprint;
        calculate_carbon_footprint = fragmentHomeBinding.calculateCarbonFootprint;

        calculate_carbon_footprint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_nav_home_to_carbonFootprintCalculatorFragment);
            }
        });
        wasteManagement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_nav_home_to_wasteManagement2);
            }
        });

        waterConservation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_nav_home_to_waterConservation2);
            }
        });

        energyConservation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_nav_home_to_energyConservation2);
            }
        });

        biodiversityConservation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_nav_home_to_biodiversityConservation2);
            }
        });

        climateChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_nav_home_to_climateChange2);
            }
        });

        pollution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_nav_home_to_pollution2);
            }
        });

        sustainableAgriculture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_nav_home_to_sustainableAgriculture2);
            }
        });

        environmentalLaws.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_nav_home_to_environmentalLaws2);
            }
        });

        carbonFootprint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_nav_home_to_carbonFootprint2);
            }
        });


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        fragmentHomeBinding = null;
    }
}