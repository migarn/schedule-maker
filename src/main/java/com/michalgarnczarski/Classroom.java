package com.michalgarnczarski;

import java.util.Set;

public class Classroom {

    private String number;
    private int capacity;
    private Set<Classes> classesSet;

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

    public Set<Classes> getClassesSet() {
        return classesSet;
    }

    public void setClassesSet(Set<Classes> classesSet) {
        this.classesSet = classesSet;
    }
}
