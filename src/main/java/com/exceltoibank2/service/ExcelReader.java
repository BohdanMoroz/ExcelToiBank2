package com.exceltoibank2.service;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    private ExcelFile file;

    private String[][] arr;


    public ExcelReader(ExcelFile file) throws IOException {
        this.file = file;
    }




//    public void arrPrint() {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(arr[i][j] + "   ");
//            }
//            System.out.println("\n");
//        }
//    }
//
//    public String[][] getArr() {
//        return arr;
//    }

}
