package com.sunytube.dao;

import com.sun.javafx.collections.MappingChange;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface DemoDao {

    public Long query(Long id);
}
