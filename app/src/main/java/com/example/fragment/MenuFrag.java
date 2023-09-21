package com.example.fragment;

import android.app.FragmentManager;
import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class MenuFrag extends ListFragment {

    String[] menus = {"Flowers", "Animals", "Foods"};
    ArrayAdapter<String> adapter;

//    // Khai báo đối tượng cho interface
//    IFragmentClickListener itemfragment;
//
//    //Bổ sung một giao diện con bên trong lớp MenuFrag:
//    public interface IFragmentClickListener{
//        public void onMenuItemClick(int position);
//    }



//    @Override public void onAttach(Context context) {
//        super.onAttach(context);
//        try { itemfragment = (IFragmentClickListener) context; }
//        catch(ClassCastException e){e.printStackTrace();}
//    }


    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.menu_frag,container,false);

        // ListView
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,menus);
        setListAdapter(adapter);
        return view ;




    }
    // Xử lý sự kiện khi click vào danh sách
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        // Viết hàm Updatedata từ ContentFragment

        super.onListItemClick(l, v, position, id);
    }
}
