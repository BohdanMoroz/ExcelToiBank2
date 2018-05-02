package com.exceltoibank2.service;

import com.exceltoibank2.config.AnnotationConfig;
import com.exceltoibank2.service.ExcelReader;
import com.exceltoibank2.service.IBank2Writer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    static String fileName = "./src/main/resources/file.xls";

    public static void main(String args[]) throws Exception {

//        ExcelReader excelReader = new ExcelReader(fileName);
//        excelReader.readDoc();
//        excelReader.arrPrint();

        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        FileXLS fileXLS = (FileXLS) context.getBean(FileXLS.class);

        ExcelReader excelReader = new ExcelReader(fileXLS);
        excelReader.readDoc();
        excelReader.arrPrint();



//        System.out.println(excelReader.getText());
        IBank2Writer iBank2Writer = new IBank2Writer(excelReader.getArr());
        iBank2Writer.saveDoc();

        System.out.println("Done!");
    }
}
