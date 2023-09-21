package com.example.fragment;

import java.util.ArrayList;

public class FlowerData {

    public static ArrayList<Image> generateImageData(){

        ArrayList<Image> image = new ArrayList<>();
        image.add(new Image(0,"https://unsplash.com/photos/3tYZjGSBwbk","Daisy"));
        image.add(new Image(1,"https://unsplash.com/photos/B1cJcYPoFxY","Lotus"));
        image.add(new Image(2,"https://unsplash.com/photos/bqvhizHNJus"," Cherry Blossom"));
        image.add(new Image(3,"https://unsplash.com/photos/KPbiRsl4FVc","Tulip"));
        image.add(new Image(4,"https://unsplash.com/photos/ptgjRj9-lD8","Rose"));
        image.add(new Image(5,"https://unsplash.com/photos/kkJuQhp9Kw0","Lily"));
        image.add(new Image(6,"https://unsplash.com/photos/DTpKjgHpHj4","Peony"));

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
