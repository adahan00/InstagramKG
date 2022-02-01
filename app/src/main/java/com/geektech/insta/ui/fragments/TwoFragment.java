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
        for (int i = 0; i < 999; i++) {
            likeList.add(new Model("Kendall liked your photo. 1h",
                    "https://imgs.capitalfm.com/images/256964?crop=16_9&width=660&relax=1&signature=mdk73wTP9MExJloMhoYHJAt6uT0=",
                    "https://i2-prod.mirror.co.uk/incoming/article22825655.ece/ALTERNATES/s1200b/2_Kylie-and-Kendall-Jenner.jpg"));
        }
        return likeList;
    }
}