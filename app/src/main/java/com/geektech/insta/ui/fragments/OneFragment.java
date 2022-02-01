package com.geektech.insta.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.insta.adapter.OneAdapter;
import com.geektech.insta.data.Model;
import com.geektech.insta.databinding.FragmentHomeBinding;

import java.util.ArrayList;


public class OneFragment extends Fragment {
    private FragmentHomeBinding binding;
    private OneAdapter adapter;
    ArrayList<Model> homesList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(LayoutInflater.from(getContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new OneAdapter(loadData(), getContext());
        binding.recyclerHome.setAdapter(adapter);
    }

    private ArrayList<Model> loadData() {
        homesList = new ArrayList<>();
            homesList.add(new Model("Mercedes", "https://www.domkrat.by/img/2021/mercedes/mercedes_s-class_w223_minsk_02.jpg"));
            homesList.add(new Model("Mercedes", "https://www.domkrat.by/img/2021/mercedes/mercedes_s-class_w223_minsk_02.jpg"));
            homesList.add(new Model("Mercedes", "https://www.domkrat.by/img/2021/mercedes/mercedes_s-class_w223_minsk_02.jpg"));
            homesList.add(new Model("Mercedes", "https://www.domkrat.by/img/2021/mercedes/mercedes_s-class_w223_minsk_02.jpg"));
            homesList.add(new Model("Mercedes", "https://www.domkrat.by/img/2021/mercedes/mercedes_s-class_w223_minsk_02.jpg"));
            homesList.add(new Model("Mercedes", "https://www.domkrat.by/img/2021/mercedes/mercedes_s-class_w223_minsk_02.jpg"));
            homesList.add(new Model("Mercedes", "https://www.domkrat.by/img/2021/mercedes/mercedes_s-class_w223_minsk_02.jpg"));
            homesList.add(new Model("Mercedes", "https://www.domkrat.by/img/2021/mercedes/mercedes_s-class_w223_minsk_02.jpg"));
            homesList.add(new Model("Mercedes", "https://www.domkrat.by/img/2021/mercedes/mercedes_s-class_w223_minsk_02.jpg"));
            homesList.add(new Model("Mercedes", "https://www.domkrat.by/img/2021/mercedes/mercedes_s-class_w223_minsk_02.jpg"));
            homesList.add(new Model("Mercedes", "https://www.domkrat.by/img/2021/mercedes/mercedes_s-class_w223_minsk_02.jpg"));
            homesList.add(new Model("Mercedes", "https://www.domkrat.by/img/2021/mercedes/mercedes_s-class_w223_minsk_02.jpg"));
            homesList.add(new Model("Mercedes", "https://www.domkrat.by/img/2021/mercedes/mercedes_s-class_w223_minsk_02.jpg"));
            homesList.add(new Model("Mercedes", "https://www.domkrat.by/img/2021/mercedes/mercedes_s-class_w223_minsk_02.jpg"));
            homesList.add(new Model("Mercedes", "https://www.domkrat.by/img/2021/mercedes/mercedes_s-class_w223_minsk_02.jpg"));
            homesList.add(new Model("Mercedes", "https://www.domkrat.by/img/2021/mercedes/mercedes_s-class_w223_minsk_02.jpg"));
            homesList.add(new Model("Mercedes", "https://www.domkrat.by/img/2021/mercedes/mercedes_s-class_w223_minsk_02.jpg"));
            homesList.add(new Model("Mercedes", "https://www.domkrat.by/img/2021/mercedes/mercedes_s-class_w223_minsk_02.jpg"));
            homesList.add(new Model("Mercedes", "https://www.domkrat.by/img/2021/mercedes/mercedes_s-class_w223_minsk_02.jpg"));
            homesList.add(new Model("Mercedes", "https://www.domkrat.by/img/2021/mercedes/mercedes_s-class_w223_minsk_02.jpg"));
            homesList.add(new Model("Mercedes", "https://www.domkrat.by/img/2021/mercedes/mercedes_s-class_w223_minsk_02.jpg"));
            homesList.add(new Model("Mercedes", "https://www.domkrat.by/img/2021/mercedes/mercedes_s-class_w223_minsk_02.jpg"));
        return homesList;
    }
}