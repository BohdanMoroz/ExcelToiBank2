package com.exceltoibank2.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class IBank2Writer {
    private List<Pojo> list;
    private PrintWriter writer;
    private String fileName = "./src/main/resources/test.txt";
    private String encoding = "UTF-8";

    private String config;

    public IBank2Writer(List<Pojo> list) throws IOException{
        this.list = new ArrayList<Pojo>(list);
        writer = new PrintWriter(fileName, encoding);
    }

//    private String getConfig() {
//
//    }

    public void saveDoc() {

        //Think about using forEach
        for (int i = 0; i < 2; i++) {
            writer.println();
            writer.println("CARD_HOLDERS." + i + ".CARD_NUM=" + list.get(i).getFirstField());
            writer.println("CARD_HOLDERS." + i + ".CARD_HOLDER=" + list.get(i).getSecondField());
            writer.println("CARD_HOLDERS." + i + ".CARD_HOLDER_INN=" + list.get(i).getThirdField());
            writer.println("CARD_HOLDERS." + i + ".SKS_NUMBER=" + list.get(i).getFirstField());
        }

        writer.close();
    }
}
