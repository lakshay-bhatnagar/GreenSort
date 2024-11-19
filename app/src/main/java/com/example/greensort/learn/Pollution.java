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
import com.example.greensort.databinding.FragmentPollutionBinding;

public class Pollution extends Fragment {

    private FragmentPollutionBinding fragmentPollutionBinding;

    private TextView pollutionTextView;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentPollutionBinding = FragmentPollutionBinding.inflate(inflater, container, false);

        View view = fragmentPollutionBinding.getRoot();

        pollutionTextView = fragmentPollutionBinding.pollutionTextView;
        pollutionTextView.setText(HtmlCompat.fromHtml(getString(R.string.waste_management_content), HtmlCompat.FROM_HTML_MODE_LEGACY));

        return view;
    }
}