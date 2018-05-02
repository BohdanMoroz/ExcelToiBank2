package com.exceltoibank2.service;

import java.io.IOException;

public interface ExcelFile {
    public void initWorkbook() throws IOException;
    public void initSheet();
    public void initRow();

    public Object getCurrentSheet();
    public Object getCurrentRow();
    public Object getWorkbook();
}
