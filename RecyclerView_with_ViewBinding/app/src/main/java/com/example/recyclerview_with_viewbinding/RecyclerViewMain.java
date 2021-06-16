package com.example.recyclerview_with_viewbinding;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.recyclerview_with_viewbinding.databinding.FragmentRecyclerViewMainBinding;

import java.util.ArrayList;
import java.util.List;


public class RecyclerViewMain extends Fragment {

    FragmentRecyclerViewMainBinding binding;
    private recyclerAdapter RecyclerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentRecyclerViewMainBinding.inflate(getLayoutInflater());
        RecyclerAdapter = new recyclerAdapter();
        binding.recyclerView.setAdapter(RecyclerAdapter);
        initMovieList();
//        View view = inflater.inflate(R.layout.fragment_recycler_view_main, container, false);
        
        return binding.getRoot();
    }

    private void initMovieList() {
        List<String> movieList = new ArrayList<>();
        movieList.add("Iron Man");
        movieList.add("Iron Man2");
        movieList.add("Iron Man3");
        movieList.add("Iron Man4");
        RecyclerAdapter.updateMovieList(movieList);
    }
}