package com.exceltoibank2.config;

import com.exceltoibank2.service.ExcelReader;
import org.springframework.context.annotation.*;

import java.io.IOException;

@Configuration
public class AnnotationConfig {
    @Bean
    public ExcelReader excelReader() throws IOException {
        return new ExcelReader();
    }
}
