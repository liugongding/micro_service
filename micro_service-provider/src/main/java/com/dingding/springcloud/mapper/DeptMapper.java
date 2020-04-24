package com.dingding.springcloud.mapper;

import com.dingding.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author liudingding
 * @ClassName DeptMapper
 * @description
 * @date 2020/1/22 1:05
 * Version 1.0
 */
@Mapper
public interface DeptMapper {

    int insertDept(Dept dept);

    int deleteById(Integer id);

    Dept getById(Integer id);

    List<Dept> getAll();

    int updateDept(Integer id);
}
