package com.exceltoibank2.service;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    private ExcelFile file;

    private Object workbook;
    private Object currentSheet;
    private Object currentRow;

    private int firstRow;
    private int lastRow;
//    private int cellNumbers = 0;

    private int arrayLength;

    private String[][] arr;

//    public ExcelReader() {
//        System.out.println("Hi from Spring!");
//    }

    public ExcelReader(ExcelFile file) throws IOException {
        this.file = file;
//        initWorkbook();
//        initSheet();
        workbook = file.getWorkbook();
        currentSheet = (HSSFSheet) file.getCurrentSheet();
        currentRow = file.getCurrentRow();
        initFirstRow();
        initLastRow();
//        calculateCellNumbers();
        calculateArrayLength();
        initArray();
    }

    // Get currentRow to start for
    private void initFirstRow() {
        firstRow = currentSheet.getFirstRowNum();
    }


    // Get currentRow to end by
    private void initLastRow() {
        lastRow = ((HSSFSheet) currentSheet).getLastRowNum();
    }

    // FIXME: try to improve statement
    private void calculateArrayLength() {
        arrayLength = lastRow - firstRow + 1;
    }


    private void initArray() {
        arr = new String[arrayLength][3];
    }

    //FIXME
    public void readDoc() throws IOException {
        for (int i = firstRow, j = 0; i <= lastRow; i++, j++) {
            currentRow = ((HSSFSheet) currentSheet).getRow(i);
            for (int z = 0; z < 3; z++) {
                arr[j][z] = getArrText(z);
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

    public void arrPrint() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println("\n");
        }
    }

    public String[][] getArr() {
        return arr;
    }

}
