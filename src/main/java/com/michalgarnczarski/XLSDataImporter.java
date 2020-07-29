package com.michalgarnczarski;

import java.io.IOException;
import java.util.LinkedHashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
import java.io.File;

public class XLSDataImporter {

    private String path;
    private String fileName;
    private Workbook importedData;

    public XLSDataImporter(String path) {
        this.path = path; // potrzebne?
        this.path = parseFileName();
        this.importedData = importData(path);
    }

    private Workbook importData(String path) {
        try {
            return WorkbookFactory.create(new File(path));
        } catch (EncryptedDocumentException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
