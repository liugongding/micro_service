package com.dingding.springcloud.service;

import com.dingding.springcloud.entity.Dept;

import java.util.List;

public interface DeptService {

    int insertDept(Dept dept);

    int deleteById(Integer id);

    Dept getById(Integer id);

    List<Dept> getAll();

    int updateDept(Integer id);
}
