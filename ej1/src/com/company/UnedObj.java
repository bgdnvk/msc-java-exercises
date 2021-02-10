package com.company;

public class UnedObj {
    int key;
    String value;

    //declaración d clase
    public UnedObj(int key, String value){
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "unedObj{" +
                "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

}