package com.michalgarnczarski;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.File;
import java.io.IOException;

public class XLSDataImporter {

    // Do zastanowienia, czy potrzebne są pola

    protected String fileName;
    protected Workbook importedData;

    public XLSDataImporter(String path) {
        File file = new File(path);
        this.importedData = importData(file);
        this.fileName = parseFileName(file);
    }

    private Workbook importData(File file) {

        // Method returns xls(x) file as poi Workbook object.

        try {
            return WorkbookFactory.create(file);
        } catch (EncryptedDocumentException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private String parseFileName(File file) {

        // Method returns filename without an extension.

        return file.getName().replaceAll("\\.[^.]*$","");
    }
}
