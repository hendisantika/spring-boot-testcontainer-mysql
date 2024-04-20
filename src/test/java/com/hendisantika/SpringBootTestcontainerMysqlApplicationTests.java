package com.hendisantika;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@Testcontainers
@SpringBootTest(
        properties = {
                "management.endpoint.health.show-details=always",
                "spring.datasource.url=jdbc:tc:mysql:8:///test"
        },
        webEnvironment = RANDOM_PORT
)
class SpringBootTestcontainerMysqlApplicationTests {

    @Autowired
    private BookRepository bookRepository;

    @Test
    void createNewBook() {
        Book book = new Book();
        Author author = new Author();
        author.setName("Itadori Yuji");

        book.setAuthor(author);
        book.setTitle("Mudah belajar Sihir");

        bookRepository.save(book);

        long count = bookRepository.count();
        Assertions.assertEquals(1, count);
    }

}
