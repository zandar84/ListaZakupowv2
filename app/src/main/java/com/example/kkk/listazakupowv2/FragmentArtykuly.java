package com.example.kkk.listazakupowv2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FragmentArtykuly extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Artykul> lstArtykul;

    public FragmentArtykuly() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.artykuly_fragment, container, false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.artykulyRecyclerView);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(),lstArtykul);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstArtykul = new ArrayList<>();
        lstArtykul.add(new Artykul("Jogurt Bakoma 400ml", "1,69zł", R.drawable.ic_restaurant_menu));
        lstArtykul.add(new Artykul("Wino Komandos", "3,50zł", R.drawable.ic_restaurant_menu));
        lstArtykul.add(new Artykul("Poo Poo on a Stick", "0,00zł", R.drawable.ic_restaurant_menu));
        lstArtykul.add(new Artykul("Masło 500g", "14,99zł", R.drawable.ic_restaurant_menu));
        lstArtykul.add(new Artykul("Banany", "3,99zł", R.drawable.ic_restaurant_menu));
        lstArtykul.add(new Artykul("Makaron nitki", "1,89zł", R.drawable.ic_restaurant_menu));
        lstArtykul.add(new Artykul("Nuka Cola", "2,59zł", R.drawable.ic_restaurant_menu));
        lstArtykul.add(new Artykul("Papier toaletowy", "0,69zł", R.drawable.ic_restaurant_menu));
        lstArtykul.add(new Artykul("Karma dla kota Whiskas 2kg", "18,89zł", R.drawable.ic_restaurant_menu));
        lstArtykul.add(new Artykul("Antyperspirant Nivew Men Black&White", "10,65zł", R.drawable.ic_restaurant_menu));
        lstArtykul.add(new Artykul("Karma dla kota saszetki 400g", "1,69zł", R.drawable.ic_restaurant_menu));

    }
}
