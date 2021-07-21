package com.example.homework6;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class MainViewHolder extends RecyclerView.ViewHolder {


    TextView firstText;
    TextView secondText;



















    public MainViewHolder(@NonNull View itemView) {
        super(itemView);

        firstText = itemView.findViewById(R.id.text_View1);
        secondText = itemView.findViewById(R.id.text_view2);

    }

    public void onBind( ItemModel data){
        firstText.setText(data.name);
        secondText.setText(data.name2);

    }
}
