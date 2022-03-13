package com.example.testapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.MyViewHolder> {


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 1){
            View itemView1 = LayoutInflater.from(parent.getContext()).inflate(R.layout.first, parent, false);
            return new MyViewHolder(itemView1);
        } else if(viewType == 2){
            View itemView2= LayoutInflater.from(parent.getContext()).inflate(R.layout.second, parent, false);
            return new MyViewHolder(itemView2);
        } else{
            View itemView3 = LayoutInflater.from(parent.getContext()).inflate(R.layout.third, parent, false);
            return new MyViewHolder(itemView3);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    @Override
    public int getItemViewType(int position) {
        super.getItemViewType(position);
        return position;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}