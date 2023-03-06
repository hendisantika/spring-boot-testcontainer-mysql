package com.hendisantika;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;


/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-testcontainer-mysql
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 8/26/22
 * Time: 06:54
 * To change this template use File | Settings | File Templates.
 */
@Data
@Embeddable
public class Author {

    @Column(name = "author_name")
    private String name;
}
