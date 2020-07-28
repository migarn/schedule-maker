package com.michalgarnczarski;

public class Classroom {

    private String number;
    private int capacity;

    public Classroom(String number, int capacity) {
        this.number = number;
        this.capacity = capacity;
    }

    public String getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }
}
