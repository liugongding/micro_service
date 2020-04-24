package com.dingding.springcloud.service;

import com.dingding.springcloud.entity.Dept;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author liudingding
 * @ClassName Dept
 * @description
 * @date 2020/1/25 20:04
 * Version 1.0
 */
@Service
public class DeptService {

    private static final String REST_URL_PREFIX = "http://MICRO-SERVICE-PROVIDER/";

    @Autowired
    private RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi( String message){
        return restTemplate.getForObject(REST_URL_PREFIX+"hi?message=" + message, String.class);
    }

    public String hiError(String message){
        return "Hi，your message is :\"" + message + "\" but request error.";
    }

    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PREFIX + "dept/list", List.class);
    }

    public Dept getDept(Integer id){
        return restTemplate.getForObject(REST_URL_PREFIX + "dept/get/" + id, Dept.class);
    }

    public int add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX + "dept/add", dept, Integer.class);
    }

}
