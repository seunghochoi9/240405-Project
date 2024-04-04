package com.example.demo.common.query;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface QueryService <T>{

    List<T> findAll() throws SQLException;
    Optional<T> findById(Long id);
    Long count();
    Optional<T> getOne(String id) throws SQLException;
    Boolean existsById(Long id);
}
