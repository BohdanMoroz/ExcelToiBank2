import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    private String file;
    private String text = "";

    private HSSFWorkbook workbook;
    private HSSFSheet currentSheet;
    private HSSFRow currentRow;

    private int firstRow;
    private int lastRow;
//    private int cellNumbers = 0;

    private int arrayLength;

    private String[] arr;

    public ExcelReader() {
        System.out.println("Hi from Spring!");
    }

    public ExcelReader(String file) throws IOException {
        this.file = file;
        initWorkbook();
        initSheet();
        initFirstRow();
        initLastRow();
//        calculateCellNumbers();
        calculateArrayLength();
        initArray();
    }

    // Get xls file
    private void initWorkbook() throws IOException {
        workbook = new HSSFWorkbook(new FileInputStream(file));
    }

    // Get first currentSheet in the file
    private void initSheet() {
        currentSheet = workbook.getSheetAt(0);
    }

    // Get first currentRow in the currentSheet
    private void initRow() {
        currentRow = currentSheet.getRow(0);
    }

    // Get currentRow to start for
    private void initFirstRow() {
        firstRow = currentSheet.getFirstRowNum();
    }


    // Get currentRow to end by
    private void initLastRow() {
        lastRow = currentSheet.getLastRowNum();
    }

    // FIXME: try to improve statement
    private void calculateArrayLength() {
        arrayLength = lastRow - firstRow + 1;
    }


    private void initArray() {
        arr = new String[arrayLength];
    }

    public void readDoc() throws IOException {
        for (int i = firstRow, j = 0; i <= lastRow; i++, j++) {
            currentRow = currentSheet.getRow(i);
            arr[j] = currentRow.getCell(0).getStringCellValue();
        }
        workbook.close();
    }

    public void arrPrint() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public String getText() {
        return text;
    }

}
