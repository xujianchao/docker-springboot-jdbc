package com.docker.dockerspringbootjdbc.service.impl;

import com.docker.dockerspringbootjdbc.po.Person;
import com.docker.dockerspringbootjdbc.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Service("personService")
public class PersonServiceImpl implements PersonService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List <Person> getList() {
        String sql = "select * from person";
        List<Person> userList = jdbcTemplate.query(sql, new RowMapper <Person>() {
            @Override
            public Person mapRow(ResultSet rs, int i) throws SQLException {
                Person user = new Person();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                return user;
            }
        });
        return userList;
    }
}
