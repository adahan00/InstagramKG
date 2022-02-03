package com.geektech.insta.ui.fragments.view_pager;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.insta.R;

import java.util.ArrayList;


public class SecondFragment extends Fragment {


    private FirstAdapter adapter = new FirstAdapter();
    private RecyclerView rv;
    private ArrayList<Integer> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        list.add(R.drawable.ic_launcher_background);
        list.add(R.drawable.ic_launcher_background);
        list.add(R.drawable.ic_launcher_background);
        list.add(R.drawable.ic_launcher_background);
        list.add(R.drawable.ic_launcher_background);
        list.add(R.drawable.ic_launcher_background);
        list.add(R.drawable.ic_launcher_background);
        list.add(R.drawable.ic_launcher_background);
        list.add(R.drawable.ic_launcher_background);
        list.add(R.drawable.ic_launcher_background);
        list.add(R.drawable.ic_launcher_background);
        list.add(R.drawable.ic_launcher_background);
        list.add(R.drawable.ic_launcher_background);
        list.add(R.drawable.ic_launcher_background);
        list.add(R.drawable.ic_launcher_background);
        list.add(R.drawable.ic_launcher_background);
        list.add(R.drawable.ic_launcher_background);
        list.add(R.drawable.ic_launcher_background);
        list.add(R.drawable.ic_launcher_background);
        list.add(R.drawable.ic_launcher_background);
        list.add(R.drawable.ic_launcher_background);
        list.add(R.drawable.ic_launcher_background);
        list.add(R.drawable.ic_launcher_background);
        list.add(R.drawable.ic_launcher_background);
        list.add(R.drawable.ic_launcher_background);
        list.add(R.drawable.ic_launcher_background);
        list.add(R.drawable.ic_launcher_background);
        list.add(R.drawable.ic_launcher_background);
        list.add(R.drawable.ic_launcher_background);
        adapter.setArrayList(list);
        rv = view.findViewById(R.id.rv_first);
        rv.setAdapter(adapter);
    }


}