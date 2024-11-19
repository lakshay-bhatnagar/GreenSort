package com.example.greensort.quizzes;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.greensort.R;
import com.example.greensort.databinding.FragmentWasteManagementQuizBinding;


public class WasteManagementQuiz extends Fragment {

    private FragmentWasteManagementQuizBinding wasteManagementQuizBinding;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        wasteManagementQuizBinding = FragmentWasteManagementQuizBinding.inflate(inflater, container, false);
        View view = wasteManagementQuizBinding.getRoot();

        return view;
    }
}