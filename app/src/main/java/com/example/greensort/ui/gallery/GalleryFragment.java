package com.example.greensort.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavAction;
import androidx.navigation.Navigation;

import com.example.greensort.R;
import com.example.greensort.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding fragmentGalleryBinding;
    private Button start_test_wastemanagement;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        fragmentGalleryBinding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = fragmentGalleryBinding.getRoot();


        start_test_wastemanagement = fragmentGalleryBinding.startTestWastemanagement;

        start_test_wastemanagement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_nav_gallery_to_wasteManagementQuiz);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        fragmentGalleryBinding = null;
    }
}