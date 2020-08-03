package com.michalgarnczarski;

import org.apache.poi.ss.usermodel.Sheet;

public class ClassroomsListImporter extends XLSDataImporter {

    // The class extends XLSDataImporter. Apart from reading xls(x) files, the class can return data as ClasroomsList
    // object.

    public ClassroomsListImporter(String path) {
        super(path);
    }

    public ClassroomsList importClassroomsList() throws Exception {

        // Method returns data imported from xls(x) file as ClassroomsList object.
        // Method throws exceptions which may occur during importing data to ClasroomsList data structure.

        ClassroomsList classroomsList = new ClassroomsList(this.fileName);

        // It is assumed that data valid from import are only in first sheet (index 0).

        Sheet sheet = this.importedData.getSheetAt(0);

        // It is assumed that first row is only for the headings and actual data are on the next rows.

        for (int i = 1; i < sheet.getLastRowNum() + 1; i++) {

            // First column is for the classrooms numbers. Data can be correctly parsed from text and number formats.
            // Data parsed from number format are cleaned from floating zeroes by 'replace' method.

            String number = sheet.getRow(i).getCell(0).toString().replace(".0","");

            // Second column is for the classrooms capacity. Data can be correctly parsed from both text and number
            // formats. Parsing from double to int is implemented to display values without floating zeroes.

            int capacity = (int) Double.parseDouble(sheet.getRow(i).getCell(1).toString());

            classroomsList.addClassroom(number, capacity);
        }

        return classroomsList;
    }
}
