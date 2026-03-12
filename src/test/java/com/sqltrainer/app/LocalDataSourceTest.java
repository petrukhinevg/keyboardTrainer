package com.sqltrainer.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ActiveProfiles;

import javax.sql.DataSource;
import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
            assertEquals("H2", databaseProduct, "Expected H2 datasource for local profile");
        }

        Integer probeResult = jdbcTemplate.queryForObject("SELECT 1", Integer.class);
        assertEquals(Integer.valueOf(1), probeResult, "Expected datasource probe query to return 1");
    }
}
