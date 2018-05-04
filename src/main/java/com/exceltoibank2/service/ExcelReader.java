package com.exceltoibank2.service;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelReader {
//    private ExcelFile file;

    private Workbook workbook;
    private Sheet currentSheet;
    private Row currentRow;

    private int firstRow;
    private int lastRow;

    private Pojo pojo;

    private List<Pojo> list = new ArrayList<Pojo>();

    public ExcelReader() {
        System.out.println("Hi, Spring! (From ExcelReader)");
    }

    public ExcelReader(ExcelFile file) throws IOException {
//        this.file = file;
        workbook = file.getWorkbook();
        currentSheet = file.getCurrentSheet();
        currentRow = file.getCurrentRow();
        initFirstRow();
        initLastRow();
    }

    // Get currentRow to start for
    private void initFirstRow() {
        firstRow = currentSheet.getFirstRowNum();
    }

    // Get currentRow to end by
    private void initLastRow() {
        lastRow = currentSheet.getLastRowNum();
    }

    public void readDoc() throws IOException {
        for (int i = firstRow; i <= lastRow; i++) {
            currentRow = currentSheet.getRow(i);

            pojo = new Pojo();

            pojo.setFirstField( Integer.toString( (int) currentRow.getCell(0).getNumericCellValue()) );
            pojo.setSecondField( currentRow.getCell(1).getStringCellValue() );
            pojo.setThirdField( Integer.toString( (int) currentRow.getCell(2).getNumericCellValue()) );

            list.add(pojo);
        }
        workbook.close();
    }

    public List<Pojo> getList() {
        return list;
    }

}
