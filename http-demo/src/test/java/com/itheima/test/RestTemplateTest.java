package com.itheima.test;

import com.itheima.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;


@SpringBootTest
public class RestTemplateTest {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void test(){
//        String url = "http://localhost:9091/user/8";
        String url = "http://localhost:8080/consumer/8";
        User user = restTemplate.getForObject(url, User.class);
        System.out.println(user);
    }
}
