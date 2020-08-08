package com.michalgarnczarski;

import java.util.ArrayList;
import java.util.List;

public class ClassesList {
    private String name;
    private List<Classes> classes;

    public ClassesList(String name) {
        this.name = name;
        this.classes = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public List<Classes> getClasses() {
        return this.classes;
    }

    public void setClasses(List<Classes> classes) {
        this.classes = classes;
    }

    public void addClasses(Classes classes) {
        this.classes.add(classes);
    }
}
