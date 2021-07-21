package com.example.homework6;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class SecondFragment extends Fragment {

    RecyclerView recyclerView;
    MainAdapterNumber adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


     View view =   inflater.inflate(R.layout.fragment_second, container, false);

     recyclerView = view.findViewById(R.id.recycler_secondFragment);
     adapter = new MainAdapterNumber();
     recyclerView.setAdapter(adapter);
     RecyclerView.LayoutManager manager = new LinearLayoutManager(this.getContext(),
             LinearLayoutManager.VERTICAL, false);
     recyclerView.setLayoutManager(manager);


     ArrayList<String> list = new ArrayList<>();

     list.add(0,"1");
        list.add(1,"2");
        list.add(2,"3");
        list.add(3,"4");
        list.add(4,"5");
        list.add(5,"6");
        list.add(6,"7");
        list.add(7,"8");
        list.add(8,"9");
        list.add(9,"10");
        list.add(10,"11");
        list.add(11,"12");
        list.add(12,"13");
        list.add(13,"14");
        list.add(14,"15");
        adapter.addText(list);












        return view;
    }


}