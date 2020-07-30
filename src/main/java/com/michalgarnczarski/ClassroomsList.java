package com.michalgarnczarski;

import java.util.Set;

public class ClassroomsList {

    private String name;
    private Set<Classroom> classrooms;

    public ClassroomsList(String name) {
        this.name = name;
    }

    public Set<Classroom> getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(Set<Classroom> classrooms) {
        this.classrooms = classrooms;
    }

    public void addClassroom(String number, int capacity) {
        this.classrooms.add(new Classroom(number, capacity));
    }


}
