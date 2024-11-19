package com.example.greensort.learn;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.greensort.R;
import com.example.greensort.databinding.FragmentEnergyConservationBinding;
import com.example.greensort.databinding.FragmentEnvironmentalLawsBinding;


public class EnvironmentalLaws extends Fragment {

    private FragmentEnvironmentalLawsBinding fragmentEnvironmentalLawsBinding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentEnvironmentalLawsBinding = FragmentEnvironmentalLawsBinding.inflate(inflater, container, false);

        View view = fragmentEnvironmentalLawsBinding.getRoot();
        return view;
    }
}