// This is the POJO class which contain information of only one Excel file row (entire).

package com.exceltoibank2.service;

public class CardHolder {
    // FIXME:   rename this fields!
    private String firstField;
    private String secondField;
    private String thirdField;

    public String getFirstField() {
        return firstField;
    }

    public void setFirstField(String firstField) {
        this.firstField = firstField;
    }

    public String getSecondField() {
        return secondField;
    }

    public void setSecondField(String secondField) {
        this.secondField = secondField;
    }

    public String getThirdField() {
        return thirdField;
    }

    public void setThirdField(String thirdField) {
        this.thirdField = thirdField;
    }
}
