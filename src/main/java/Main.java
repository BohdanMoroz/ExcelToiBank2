//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class Main {
//
//    static String fileName = "./src/main/resources/file.xls";
//
//    public static void main(String args[]) throws Exception {
//
////        ExcelReader excelReader = new ExcelReader(fileName);
////        excelReader.readDoc();
////        excelReader.arrPrint();
//
//        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
//        ExcelReader excelReader = (ExcelReader) context.getBean(ExcelReader.class);
//        excelReader.readDoc();
//        excelReader.arrPrint();
//
//
//
////        System.out.println(excelReader.getText());
//        IBank2Writer iBank2Writer = new IBank2Writer(excelReader.getArr());
//        iBank2Writer.saveDoc();
//
//        System.out.println("Done!");
//    }
//}
