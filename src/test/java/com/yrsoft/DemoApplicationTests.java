package com.yrsoft;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Test
    public void contextLoads() throws SQLException {
        Connection conn = dataSource.getConnection();
        System.out.println(conn);
    }

    @Test
    public void showInfo(){
        System.out.println("这是第三个分支");
    }

    @Test
    public void showInfo1(){
        System.out.println("这是第三个分支");
    }
}

