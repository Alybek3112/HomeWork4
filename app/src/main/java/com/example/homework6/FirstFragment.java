
package com.example.homework6;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class FirstFragment extends Fragment {

    RecyclerView recyclerView;
    MainAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first, container, false);

        recyclerView = view.findViewById(R.id.recycler_firstFragment);
        adapter = new MainAdapter();
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this.getContext(),
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);

        ArrayList<ItemModel> list = new ArrayList<>();
        list.add(0, new ItemModel("", "effrfrf"));
        list.add(1, new ItemModel("Нурбек", "dvcverv"));
        list.add(2, new ItemModel("Нуракбар",""));
        list.add(3, new ItemModel("Мурас",""));
        list.add(4, new ItemModel("Илим",""));
        list.add(5, new ItemModel("Бекмурат",""));
        list.add(6, new ItemModel("Эрмек",""));
        list.add(7, new ItemModel("Нуркыз",""));
        list.add(8, new ItemModel("Анарбек",""));
        list.add(9, new ItemModel("Айдана",""));
        list.add(10, new ItemModel("Кайрат",""));
        list.add(11, new ItemModel("Нурболот",""));
        list.add(12, new ItemModel("Али",""));
        list.add(13, new ItemModel("Эламан",""));
        list.add(14, new ItemModel("Нурел",""));

        adapter.addText(list);


        return view;
    }

}
