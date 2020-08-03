package com.michalgarnczarski;

import org.apache.poi.ss.usermodel.Sheet;

public class ClassroomsListImporter extends XLSDataImporter {

    public ClassroomsListImporter(String path) {
        super(path);
    }

    public ClassroomsList importClassroomsList() throws Exception {

        ClassroomsList classroomsList = new ClassroomsList(this.fileName);

        Sheet sheet = this.importedData.getSheetAt(0);

        for (int i = 1; i < sheet.getLastRowNum() + 1; i++) {
            String number = sheet.getRow(i).getCell(0).toString().replace(".0","");
            int capacity = (int) Double.parseDouble(sheet.getRow(i).getCell(1).toString());
            classroomsList.addClassroom(number, capacity);
        }

        return classroomsList;
    }
}
