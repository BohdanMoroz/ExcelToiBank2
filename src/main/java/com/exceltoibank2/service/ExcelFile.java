package com.exceltoibank2.service;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.IOException;

public interface ExcelFile {
    public void initWorkbook() throws IOException;
    public void initSheet();
    public void initRow();

    public Workbook getWorkbook();
    public Sheet getCurrentSheet();
    public Row getCurrentRow();
}
