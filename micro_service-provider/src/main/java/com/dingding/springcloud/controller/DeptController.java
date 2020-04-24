package com.dingding.springcloud.controller;

import com.dingding.springcloud.entity.Dept;
import com.dingding.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author liudingding
 * @ClassName DeptController
 * @description
 * @date 2020/1/22 20:34
 * Version 1.0
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept getById(@PathVariable("id") Integer id){
        return deptService.getById(id);
    }

    @GetMapping(value = "/dept/list")
    public List<Dept> list(){
        return deptService.getAll();
    }

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public int add(@RequestBody Dept dept) {
        return deptService.insertDept(dept);
    }

    @RequestMapping(value = "/hi")
    public String sayHi(@RequestParam String message){
        return "Hi，your message is :" + message + " i am from port：+ " + port;
    }
}
