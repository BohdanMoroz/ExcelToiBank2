import org.springframework.context.annotation.*;

import java.io.IOException;

@Configuration
public class AnnotationConfig {
    @Bean
    public ExcelReader excelReader() throws IOException {
        return new ExcelReader("./src/main/resources/file.xls");
    }
}
