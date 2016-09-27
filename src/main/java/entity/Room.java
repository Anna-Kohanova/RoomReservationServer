package entity;

import java.io.Serializable;

/**
 * Room object
 * Created by Ania on 20.09.2016.
 */
public class Room implements Serializable {
    private String name;
    private int number;

    public Room(String name, int number) {
        this.setName(name);
        this.setNumber(number);
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
