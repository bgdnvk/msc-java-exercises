package com.company;

public class Plaza {
    int coche;
    String color;
    public Plaza(int coche, String color){
        this.coche = coche;
        this.color = color;
    }

    public int getCoche() {
        return coche;
    }

    public String getColor() {
        return color;
    }

    public void setCoche(int coche) {
        this.coche = coche;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
