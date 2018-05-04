package com.exceltoibank2.service;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class FileXLS implements ExcelFile{
    private HSSFWorkbook workbook;
    private HSSFSheet currentSheet;
    private HSSFRow currentRow;
    private String file;

    public FileXLS() {
        System.out.println("Hi from Spring!");
    }

    public FileXLS(String file) throws IOException {
        this.file = file;
        initWorkbook();
        initSheet();
        initRow();
    }

    // Get xls file
    public void initWorkbook() throws IOException {
        workbook = new HSSFWorkbook(new FileInputStream(file));
    }

    // Get first currentSheet in the file
    public void initSheet() {
        currentSheet = workbook.getSheetAt(0);
    }

    // Get first currentRow in the currentSheet
    public void initRow() {
        currentRow = currentSheet.getRow(0);
    }

    public HSSFWorkbook getWorkbook() {
        return workbook;
    }

    public HSSFSheet getCurrentSheet() {
        return currentSheet;
    }

    public HSSFRow getCurrentRow() {
        return currentRow;
    }
}
