package hu.esamu.rft.esamurft;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;


public class Item {
    private String name;
    private int number;
    private String image;

    public Item(String name, int number, String image) {
        this.name = name;
        this.number = number;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getImage() {
        return image;
    }

}
