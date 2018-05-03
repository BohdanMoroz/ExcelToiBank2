package com.exceltoibank2.config;

import com.exceltoibank2.service.ExcelReader;
import com.exceltoibank2.service.FileXLS;
import org.springframework.context.annotation.*;

import java.io.IOException;

@Configuration
public class AnnotationConfig {
    @Bean
    public FileXLS fileXLS() throws IOException {
//        return new FileXLS("./src/main/resources/file.xls");
        return new FileXLS();
    }
}
