package com.example.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;


public class ContentFrag extends Fragment {
    GridView gridview;
    ImageAdapter  adapter;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.content_frag, container, false);

        // Hiển thị ảnh tải về lên gridview
        gridview = view.findViewById(R.id.gridview);
        adapter = new ImageAdapter(AnimalData.generateImageData(),getActivity().getApplicationContext());
        gridview.setAdapter(adapter);
        return view;
    }
//    public void updateContent (int position){
//        switch (position) {
//            case 0:
//                adapter = new ImageAdapter(FlowerData.generateImageData(),getActivity().getApplicationContext());
//                gridview.setAdapter(adapter);
//                break;
//            case 1:
//                adapter = new ImageAdapter(AnimalData.generateImageData(),getActivity().getApplicationContext());
//                gridview.setAdapter(adapter);
//                break;
//            case 2:
//                adapter = new ImageAdapter(FoodData.generateImageData(),getActivity().getApplicationContext());
//                gridview.setAdapter(adapter);
//                break;
//        }
//
//    }




    }



