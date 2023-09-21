package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
//public class MainActivity extends AppCompatActivity implements MenuFrag.IFragmentClickListener
       {

    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hiển thị MenuFrag
        fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        MenuFrag menufrag = new MenuFrag();
        ContentFrag contentfrag = new ContentFrag();
//
        fragmentTransaction.replace(R.id.linearlayout1, menufrag);
        fragmentTransaction.replace(R.id.linearlayout2, contentfrag);
//
//        fragmentTransaction.add(R.id.frag1,new MenuFrag());
//        fragmentTransaction.add(R.id.frag2,new ContentFrag());
//
        fragmentTransaction.commit();


    }
}