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
import com.example.greensort.databinding.FragmentBiodiversityConservationBinding;


public class BiodiversityConservation extends Fragment {

    private FragmentBiodiversityConservationBinding fragmentBiodiversityConservationBinding;
    private TextView biodiversityTextView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentBiodiversityConservationBinding = FragmentBiodiversityConservationBinding.inflate(inflater, container, false);
        View view = fragmentBiodiversityConservationBinding.getRoot();

        biodiversityTextView = fragmentBiodiversityConservationBinding.biodiversityConservationTxtView;
        biodiversityTextView.setText(HtmlCompat.fromHtml(getString(R.string.biodiversity_conservation), HtmlCompat.FROM_HTML_MODE_LEGACY));
        return view;
    }
}