package com.erichgamma.api.common.query;

import com.erichgamma.api.common.component.PageRequestVo;

import java.util.List;
import java.util.Optional;

public interface QueryService <T>{
    List<T> findAll(PageRequestVo vo);
    Optional<T> findById(Long id);
    Long count();
    Boolean existsById(Long id);
}
