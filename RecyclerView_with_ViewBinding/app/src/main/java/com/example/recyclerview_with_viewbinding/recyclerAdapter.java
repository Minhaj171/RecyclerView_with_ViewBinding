package com.example.recyclerview_with_viewbinding;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview_with_viewbinding.databinding.RecyclerRowBinding;

import org.xmlpull.v1.XmlPullParser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MD Minhajul Islam on 6/16/2021.
 */
public class recyclerAdapter  extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<String> movieList = new ArrayList<>();
    public  void updateMovieList(List<String> movieList){
        this.movieList = movieList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context;
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(layoutInflater, parent, false);
        return new ViewHolder(recyclerRowBinding);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {   }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        RecyclerRowBinding recyclerRowBinding;

        public ViewHolder(@NonNull RecyclerRowBinding recyclerRowBinding){
            super(recyclerRowBinding.getRoot());
            this.recyclerRowBinding = recyclerRowBinding;
            this.recyclerRowBinding.movieName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Log.d(TAG, "onClick" + getAbsoluteAdapterPosition());
                }
            });
        }
    }
}
