import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    static String fileName = "./src/main/resources/file.xls";

    public static void main(String args[]) throws Exception {

//        ExcelReader excelReader = new ExcelReader(fileName);
//        excelReader.readDoc();
//        excelReader.arrPrint();

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ExcelReader excelReader = (ExcelReader) context.getBean("ExcelReaderTest");
        excelReader.readDoc();
        excelReader.arrPrint();



//        System.out.println(excelReader.getText());
//        IBank2Writer iBank2Writer = new IBank2Writer(excelReader.getText());
//        iBank2Writer.saveDoc();

        System.out.println("Done!");
    }
}
