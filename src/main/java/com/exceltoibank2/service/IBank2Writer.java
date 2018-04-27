package com.exceltoibank2.service;

import java.io.IOException;
import java.io.PrintWriter;

public class IBank2Writer {
    private String[][] text;
    private PrintWriter writer;
    private String fileName = "./src/main/resources/test.txt";
    private String encoding = "UTF-8";

    private String config;

    public IBank2Writer(String[][] text) throws IOException{
        this.text = text;
        writer = new PrintWriter( fileName, encoding);
    }

//    private String getConfig() {
//
//    }

    public void saveDoc() {
        for (int i = 0; i < 2; i++) {
            writer.println();
            writer.println("CARD_HOLDERS." + i + ".CARD_NUM=" + text[i][0]);
            writer.println("CARD_HOLDERS." + i + ".CARD_HOLDER=" + text[i][1]);
            writer.println("CARD_HOLDERS." + i + ".CARD_HOLDER_INN=" + text[i][2]);
            writer.println("CARD_HOLDERS." + i + ".SKS_NUMBER=" + text[i][0]);
        }

        writer.close();
    }
}
