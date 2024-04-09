package com.erichgamma.api.common.service;

import com.erichgamma.api.common.component.PageRequestVo;

import java.util.List;
import java.util.Optional;

public interface QueryService <T>{
    List<T> findAll();
    Optional<T> findById(Long id);
    Long count();
    Boolean existsById(Long id);
}
