package com.example.homework6;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainVIewHolderNUmber extends RecyclerView.ViewHolder {

    TextView textView;


    public MainVIewHolderNUmber(@NonNull View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.textView_number);

    }
    public void onBind(String data){
        textView.setText(data);
    }
}
