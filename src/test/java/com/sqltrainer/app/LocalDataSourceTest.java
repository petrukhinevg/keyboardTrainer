package com.sqltrainer.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ActiveProfiles;

import javax.sql.DataSource;
import java.sql.Connection;

@SpringBootTest
@ActiveProfiles("local")
class LocalDataSourceTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void shouldUseH2Datasource() throws Exception {
        try (Connection connection = dataSource.getConnection()) {
            String databaseProduct = connection.getMetaData().getDatabaseProductName();
            Assertions.assertEquals("H2", databaseProduct, "Expected H2 datasource for local profile");
        }

        Integer probeResult = jdbcTemplate.queryForObject("SELECT 1", Integer.class);
        Assertions.assertEquals(Integer.valueOf(1), probeResult, "Expected datasource probe query to return 1");
    }
}
