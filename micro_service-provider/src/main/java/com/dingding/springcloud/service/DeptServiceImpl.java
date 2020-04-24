package com.dingding.springcloud.service;

import com.dingding.springcloud.entity.Dept;
import com.dingding.springcloud.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liudingding
 * @ClassName DeptServiceImpl
 * @description
 * @date 2020/1/22 20:32
 * Version 1.0
 */
@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public int insertDept(Dept dept) {
        return deptMapper.insertDept(dept);
    }

    @Override
    public int deleteById(Integer id) {
        return 0;
    }

    @Override
    public Dept getById(Integer id) {
        return deptMapper.getById(id);
    }

    @Override
    public List<Dept> getAll() {
        return deptMapper.getAll();
    }

    @Override
    public int updateDept(Integer id) {
        return 0;
    }
}
