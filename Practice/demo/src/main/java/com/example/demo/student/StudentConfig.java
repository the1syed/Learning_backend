package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student syed = new Student("Syed", 28, LocalDate.of(2000, Month.DECEMBER, 22), "05syed08@gmail.com");
            Student syed2 = new Student("Syed2", 8, LocalDate.of(2000, Month.DECEMBER, 2), "058@gmail.com");
            repository.saveAll(List.of(syed,syed2));
        };
    }
}
