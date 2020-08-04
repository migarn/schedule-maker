package com.michalgarnczarski;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FilesListCreator {

    // Class creates file names list for given path.

    public List<String> createList(String path) {

        List<String> filesNames = new ArrayList<>();
        File folder = new File(path);
        File[] files = folder.listFiles();

        for (File file : files) {
            filesNames.add(file.getName().replaceAll("\\.[^.]*$",""));
        }

        return filesNames;
    }
}
