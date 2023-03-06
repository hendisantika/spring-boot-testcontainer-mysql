package com.hendisantika;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testcontainer-mysql
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 8/26/22
 * Time: 06:55
 * To change this template use File | Settings | File Templates.
 */
@Data
@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    @Embedded
    private Author author;

    private String title;
}
