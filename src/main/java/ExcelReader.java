import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    private String file;
    private String text = "";

    private HSSFWorkbook workbook;
    private HSSFSheet sheet;
    private HSSFRow row;

    private int rowNumbers;
//    private int cellNumbers = 0;

    private String[] arr;

    public ExcelReader(String file) throws IOException {
        this.file = file;
        initWorkbook();
        initSheet();
        calculateRowNumbers();
//        calculateCellNumbers();
        initArray();
    }

    // Get xls file
    private void initWorkbook() throws IOException {
        workbook = new HSSFWorkbook(new FileInputStream(file));
    }

    // Get first sheet in the file
    private void initSheet() {
        sheet = workbook.getSheetAt(0);
    }

    // Get first row in the sheet
    private void initRow() {
        row = sheet.getRow(0);
    }

    private void calculateRowNumbers() {
//        startRow = sheet.getFirstRowNum();
        rowNumbers = sheet.getLastRowNum();
    }

    private void initArray() {
        arr = new String[rowNumbers];
    }

    public void readDoc() throws IOException {
        for (int i = 0; i < rowNumbers; i++) {
            row = sheet.getRow(i);
            text = row.getCell(cellNumbers).getStringCellValue();
            arr[i] = text;
        }
        workbook.close();
    }

    public void arrPrint() {
        for (int i = 0; i < rowNumbers; i++) {
            System.out.println(arr[i]);
        }
    }

    public String getText() {
        return text;
    }

}
