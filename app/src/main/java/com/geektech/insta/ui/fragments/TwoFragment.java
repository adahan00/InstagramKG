package com.geektech.insta.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.insta.adapter.TwoAdapter;
import com.geektech.insta.data.Model;
import com.geektech.insta.databinding.FragmentLikesBinding;

import java.util.ArrayList;


public class TwoFragment extends Fragment {
    private FragmentLikesBinding binding;
    private TwoAdapter adapter;
    ArrayList<Model> likeList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentLikesBinding.inflate(LayoutInflater.from(getContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new TwoAdapter(getContext(), loadData());
        binding.recyclerLikes.setAdapter(adapter);
    }

    private ArrayList<Model> loadData() {
        likeList = new ArrayList<>();
            likeList.add(new Model("Adahan liked your photo. 1h",
                    "https://stihi.ru/pics/2012/10/23/8769.jpg",
                    "https://icdn.lenta.ru/images/2019/09/17/16/20190917163805368/pic_cfaef76bdd9da7859821c486ad660b77.jpg"));

        return likeList;
    }
}