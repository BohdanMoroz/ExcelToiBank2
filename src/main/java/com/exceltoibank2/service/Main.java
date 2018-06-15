package com.exceltoibank2.service;

public class Main {


    public static void main(String args[]) throws Exception {

        FileXLSX fileXLSX = new FileXLSX("D:/Java/ExceltoiBank2/src/main/resources/file.xlsx");

        ExcelReader excelReader = new ExcelReader(fileXLSX);
        excelReader.readDoc();

        IBank2Writer iBank2Writer = new IBank2Writer(excelReader.getList());
        iBank2Writer.saveDoc();

        System.out.println("Done!");
    }
}
