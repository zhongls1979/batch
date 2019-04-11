package com.example.demo.batch.domain;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class FruitRowMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Fruit fruit = new Fruit(rs.getString("fruit_name"),rs.getInt("price"));

        return fruit;
    }
}
