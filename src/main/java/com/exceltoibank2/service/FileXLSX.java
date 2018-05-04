package com.exceltoibank2.service;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class FileXLSX implements ExcelFile{
    private XSSFWorkbook workbook;
    private XSSFSheet currentSheet;
    private XSSFRow currentRow;
    private String file;

    public FileXLSX() {
        System.out.println("Hi from Spring!");
    }

    public FileXLSX(String file) throws IOException {
        this.file = file;
        initWorkbook();
        initSheet();
        initRow();
    }

    // Get xls file
    public void initWorkbook() throws IOException {
        workbook = new XSSFWorkbook(new FileInputStream(file));
    }

    // Get first currentSheet in the file
    public void initSheet() {
        currentSheet = workbook.getSheetAt(0);
    }

    // Get first currentRow in the currentSheet
    public void initRow() {
        currentRow = currentSheet.getRow(0);
    }

    public XSSFWorkbook getWorkbook() {
        return workbook;
    }

    public XSSFSheet getCurrentSheet() {
        return currentSheet;
    }

    public XSSFRow getCurrentRow() {
        return currentRow;
    }
}

