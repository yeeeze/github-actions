package com.study.githubactions.user;

import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserRepository {
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public UserRepository(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }


    private static final RowMapper<Users> userMapper = (resultSet, i) -> {
        Long userId = resultSet.getLong("user_id");
        String name = resultSet.getString("name");
        int age = resultSet.getInt("age");

        Users users = new Users(userId, name, age);
        return users;
    };

    List<Users> findAll() {
        return namedParameterJdbcTemplate.query("select * from users", userMapper);
    }
}
