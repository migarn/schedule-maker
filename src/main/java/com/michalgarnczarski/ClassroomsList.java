package com.michalgarnczarski;

import java.util.ArrayList;
import java.util.List;

public class ClassroomsList {

    private String name;
    private List<Classroom> classrooms;

    public ClassroomsList(String name) {
        this.name = name;
        this.classrooms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Classroom> getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(List<Classroom> classrooms) {
        this.classrooms = classrooms;
    }

    public void addClassroom(String number, int capacity) {
        this.classrooms.add(new Classroom(number, capacity));
    }


}
