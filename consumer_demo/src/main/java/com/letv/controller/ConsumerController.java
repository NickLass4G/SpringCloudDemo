package com.letv.controller;

import com.letv.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author:Administrator
 * @Date: 2019/12/7 16:31
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public User findUser(@PathVariable  Long id){
        String url = "http://localhost:9091/user/" + id;
        return restTemplate.getForObject(url,User.class);
    }
}
