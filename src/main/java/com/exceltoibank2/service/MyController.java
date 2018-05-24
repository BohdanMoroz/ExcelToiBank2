package com.exceltoibank2.service;

import com.exceltoibank2.config.AnnotationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.*;

import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.disk.*;
import org.apache.commons.fileupload.servlet.*;
import org.apache.commons.io.output.*;

@WebServlet("/MyController")
public class MyController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
//        FileXLSX fileXLSX = (FileXLSX) context.getBean(FileXLSX.class);
//        FileXLS fileXLS = (FileXLS) context.getBean(FileXLS.class);

        File file;
        int maxFileSize = 5000 * 1024;
        int maxMemSize = 5000 * 1024;
        String filePath = "D:/Get";

        String contentType = req.getContentType();

        if (contentType.indexOf("multipart/form-data") >= 0) {
            DiskFileItemFactory
        }

        FileXLS fileXLS = new FileXLS(req.getParameter("file"));

        ExcelReader excelReader = new ExcelReader(fileXLS);
        excelReader.readDoc();

        IBank2Writer iBank2Writer = new IBank2Writer(excelReader.getList());
        iBank2Writer.saveDoc();

        System.out.println("Done!");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
