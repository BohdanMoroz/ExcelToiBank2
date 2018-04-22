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

    private int startRow;
    private int endRow;
    private int startCell;
    private int endCell;

    public ExcelReader(String file) throws IOException {
        this.file = file;
        initWorkbook();
        initSheet();
        calculateRowNumbers();
    }

    private void initWorkbook() throws IOException {
        workbook = new HSSFWorkbook(new FileInputStream(file));
    }

    private void initSheet() {
        sheet = workbook.getSheetAt(0);
    }

    private void calculateRowNumbers() {
        startRow = sheet.getFirstRowNum();
        endRow = sheet.getLastRowNum();
    }

    private void calculateCellNumbers() {
        startCell = row.getFirstCellNum();
        endCell = row.getLastCellNum();
    }

    public void readDoc() throws IOException {
        for (int i = startRow; i <= endRow; i++) {
            row = sheet.getRow(i);
            calculateCellNumbers();

            for (int j = startCell; j < endCell; j++) {
                text += row.getCell(j).getStringCellValue() +  "    ";
            }

            text += "\n";
        }
        workbook.close();
    }

    public String getText() {
        return text;
    }



}
