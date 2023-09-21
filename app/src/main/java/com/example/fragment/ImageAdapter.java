package com.example.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class    ImageAdapter extends BaseAdapter {
    private ArrayList<Image> image_list;
    private Context context;



    public ImageAdapter(ArrayList<Image> image_list, Context context) {
        this.image_list = image_list;
        this.context = context;
    }


    @Override
    public int getCount() {
        return image_list.size();
    }

    @Override
    public Object getItem(int position) {
        return image_list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return image_list.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final MyView dataitem;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            dataitem = new MyView();
            convertView = inflater.inflate(R.layout.image_content, null);
            dataitem.iv_photo = convertView.findViewById(R.id.imv_photo);
            dataitem.tv_caption = convertView.findViewById(R.id.tv_title);
            convertView.setTag(dataitem);
        } else {
            dataitem = (MyView) convertView.getTag();
        }

        //new DownloadImage(dataitem.iv_photo).execute(photo_list.get(position).getSource_photo());
        ImageLoader imageLoader = new ImageLoader(context);
        imageLoader.loadImage(image_list.get(position).getSource_photo(), dataitem.iv_photo);
        dataitem.tv_caption.setText(image_list.get(position).getTitle_photo());
        return convertView;
    }

    private static class MyView {
        ImageView iv_photo;
        TextView tv_caption;
    }
}
