package hu.esamu.rft.esamurft;


/**
 * Created by Pisti on 2016. 11. 09..
 */

public class Item {
    private String name;
    private int number;

    public Item(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

}
