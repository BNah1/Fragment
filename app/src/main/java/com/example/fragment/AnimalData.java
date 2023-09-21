package com.example.fragment;

import java.util.ArrayList;

public class AnimalData {
    public static ArrayList<Image> generateImageData(){

        ArrayList<Image> image = new ArrayList<>();
        image.add(new Image(0,"https://assets.altarofgaming.com/wp-content/uploads/2021/09/adele-class-maplestory-classes.png","A"));
        image.add(new Image(1,"https://assets.altarofgaming.com/wp-content/uploads/2021/09/evan-class-maplestory-classes.png","B"));
        image.add(new Image(2,"https://assets.altarofgaming.com/wp-content/uploads/2021/09/phantom-class-maplestory-classes.png","C"));
        image.add(new Image(3,"https://assets.altarofgaming.com/wp-content/uploads/2021/09/mercedes-class-maplestory-classes.png","D"));


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
