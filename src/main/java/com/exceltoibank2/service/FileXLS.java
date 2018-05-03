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
    String file;

    private int firstRow;
    private int lastRow;

    public FileXLS() {
        System.out.println("Hi from Spring!");
    }

    public FileXLS(String file) throws IOException {
        this.file = file;
        initWorkbook();
        initSheet();
        initRow();
        initFirstRow();
        initLastRow();
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

    // Get currentRow to start for
    private void initFirstRow() {
        firstRow = currentSheet.getFirstRowNum();
    }

    // Get currentRow to end by
    private void initLastRow() {
        lastRow = currentSheet.getLastRowNum();
    }

    //FIXME replace to List
//    private void initArray() {
//        arr = new String[arrayLength][3];
//    }

    //FIXME
    public void readDoc() throws IOException {
        for (int i = firstRow, j = 0; i <= lastRow; i++, j++) {
            currentRow = ((HSSFSheet) currentSheet).getRow(i);
            for (int z = 0; z < 3; z++) {
//                arr[j][z] = getArrText(z);
            }
        }
        ((HSSFWorkbook) workbook).close();
    }

    private String getArrText(int i) {
        switch (i) {
            case 0: return Integer.toString( (int) ((HSSFRow) currentRow).getCell(0).getNumericCellValue());
            case 1: return ((HSSFRow) currentRow).getCell(1).getStringCellValue();
            case 2: return Integer.toString( (int) ((HSSFRow) currentRow).getCell(2).getNumericCellValue());
            default: return "NULL";
        }
    }

//    public HSSFSheet getCurrentSheet() {
//        return currentSheet;
//    }
//
//    public HSSFRow getCurrentRow() {
//        return currentRow;
//    }
//
//    public HSSFWorkbook getWorkbook() {
//        return workbook;
//    }
}
