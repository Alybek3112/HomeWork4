package com.example.homework6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapterNumber extends RecyclerView.Adapter<MainVIewHolderNUmber> {

    ArrayList<String> list = new ArrayList<>();

    public void addText(ArrayList<String> data){
        list.addAll(data);
        notifyDataSetChanged();
    }






    @NonNull
    @Override
    public MainVIewHolderNUmber onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_list_second, parent, false);
        return new MainVIewHolderNUmber(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainVIewHolderNUmber holder, int position) {
        holder.onBind(list.get(position));


    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
