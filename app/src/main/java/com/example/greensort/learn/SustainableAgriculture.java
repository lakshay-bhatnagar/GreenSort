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
import com.example.greensort.databinding.FragmentSustainableAgricultureBinding;


public class SustainableAgriculture extends Fragment {
    private FragmentSustainableAgricultureBinding fragmentSustainableAgricultureBinding;

    private TextView sustainableAgricultureTextView;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentSustainableAgricultureBinding = FragmentSustainableAgricultureBinding.inflate(inflater, container, false);

        View view = fragmentSustainableAgricultureBinding.getRoot();

        sustainableAgricultureTextView = fragmentSustainableAgricultureBinding.sustainableAgricultureTextView;
        sustainableAgricultureTextView.setText(HtmlCompat.fromHtml(getString(R.string.sustainable_agriculture_text), HtmlCompat.FROM_HTML_MODE_LEGACY));
        return view;
    }
}