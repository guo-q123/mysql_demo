package com.chehejia.web.mysql_demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class MysqlDemoApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("new UUID().toString() = " + UUID.randomUUID());
        System.out.println();
    }

}
