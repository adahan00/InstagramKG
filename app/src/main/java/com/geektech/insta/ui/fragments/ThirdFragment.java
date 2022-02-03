package com.geektech.insta.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.insta.R;
import com.geektech.insta.databinding.FragmentUsersBinding;
import com.geektech.insta.ui.fragments.view_pager.FirstFragment;
import com.geektech.insta.ui.fragments.view_pager.PagerAdapter;
import com.geektech.insta.ui.fragments.view_pager.SecondFragment;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;


public class ThirdFragment extends Fragment {

    private FragmentUsersBinding binding;
    private PagerAdapter adapter;
    private ArrayList<Fragment> list  = new ArrayList<>();
    private int muasu[] = {R.drawable.ic_grid ,R.drawable.ic_camera };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding =  FragmentUsersBinding.inflate(LayoutInflater.from(getContext()),container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        list.add(new FirstFragment());
        list.add(new SecondFragment());
        adapter = new PagerAdapter(this);
        adapter.setFragmentList(list);
        binding.viewpager.setAdapter(adapter);


        new TabLayoutMediator(binding.tabLayout, binding.viewpager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setIcon(muasu[position]);

            }
        }).attach();

    }

}