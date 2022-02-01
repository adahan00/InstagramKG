package com.geektech.insta.ui.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.insta.databinding.FragmentUsersBinding;


public class ThridFragment extends Fragment {
    private FragmentUsersBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding =  FragmentUsersBinding.inflate(LayoutInflater.from(getContext()),container, false);
        return binding.getRoot();
    }
}