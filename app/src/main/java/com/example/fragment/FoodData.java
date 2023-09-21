package com.example.fragment;

import java.util.ArrayList;

public class FoodData {
    public static ArrayList<Image> generateImageData(){

        ArrayList<Image> image = new ArrayList<>();
        image.add(new Image(0,"https://unsplash.com/photos/Mzy-OjtCI70","Cake"));
        image.add(new Image(1,"https://unsplash.com/photos/-GFCYhoRe48","Burgers"));
        image.add(new Image(2,"https://unsplash.com/photos/TqOEGdRNowY","Lobster"));
        image.add(new Image(3,"https://unsplash.com/photos/MqT0asuoIcU","Pizza"));
        image.add(new Image(4,"https://unsplash.com/photos/lP5MCM6nZ5A","Taco"));
        image.add(new Image(5,"https://unsplash.com/photos/vIm26fn_QKg","Salad"));
        image.add(new Image(6,"https://unsplash.com/photos/pe9dvM1rQkM","Steak"));

        return image;
    }

    public static Image getImageFromId(int id) {
        ArrayList<Image> img = generateImageData();
        for (int i = 0; i < img.size(); i++)
            if (img.get(i).getId() == id)
                return img.get(i);
        return null;
    }
}
