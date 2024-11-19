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
import com.example.greensort.databinding.FragmentWaterConservationBinding;


public class WaterConservation extends Fragment {

    private FragmentWaterConservationBinding fragmentWaterConservationBinding;
    private TextView waterConservationTextView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentWaterConservationBinding = FragmentWaterConservationBinding.inflate(inflater, container, false);
        View view = fragmentWaterConservationBinding.getRoot();

        waterConservationTextView = fragmentWaterConservationBinding.waterConservation;
        waterConservationTextView.setText(HtmlCompat.fromHtml(getString(R.string.water_conservation_content), HtmlCompat.FROM_HTML_MODE_LEGACY));
        return view;
    }
}