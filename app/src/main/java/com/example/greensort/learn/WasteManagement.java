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
import com.example.greensort.databinding.FragmentWasteManagementBinding;


public class WasteManagement extends Fragment {

    private FragmentWasteManagementBinding fragmentWasteManagementBinding;
    private TextView wasteManagementTextview;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentWasteManagementBinding = FragmentWasteManagementBinding.inflate(inflater, container, false);
        View view = fragmentWasteManagementBinding.getRoot();

        wasteManagementTextview = fragmentWasteManagementBinding.wasteManagementTextview;
        wasteManagementTextview.setText(HtmlCompat.fromHtml(getString(R.string.waste_management_content), HtmlCompat.FROM_HTML_MODE_LEGACY));

        return view;
    }
}