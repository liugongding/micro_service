package com.dingding.springcloud.controller;

import com.dingding.springcloud.entity.Dept;
import com.dingding.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author liudingding
 * @ClassName DeptConsumerController
 * @description
 * @date 2020/1/23 16:18
 * Version 1.0
 */
//@SuppressWarnings("ALL")
@RestController
public class DeptConsumerController {

    private static final String REST_URL_PREFIX = "http://localhost:17001";

    private static final String REST_URL_PROVIDER = "http://MICRO-SERVICE-PROVIDER";


    @Autowired
    @Qualifier(value = "remoteRestTemplate")
    private RestTemplate restTemplate;

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/consumer/dept/add")
    public int add(Dept dept) {
        return deptService.add(dept);
    }

    @GetMapping(value = "/consumer/dept/get/{id}")
    public Dept getDept(@PathVariable("id") Integer id){
        return deptService.getDept(id);
    }

    @GetMapping(value = "/consumer/dept/list")
    public List<Dept> list(){
        return deptService.list();
    }


    @RequestMapping(value = "/hi")
    public String sayHi(@RequestParam String message){
        return deptService.sayHi(message);
    }

    @RequestMapping(value = "/hello")
    public String test(){
        return "hello";
    }
}
