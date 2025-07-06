package com.library.config;

import com.library.entity.Book;
import com.library.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadSampleData(BookRepository bookRepository) {
        return args -> {
            bookRepository.save(new Book(null, "The Alchemist"));
            bookRepository.save(new Book(null, "Spring in Action"));
            bookRepository.save(new Book(null, "Clean Code"));
        };
    }
}
