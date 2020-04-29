package com.utils;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class TestService {

    public void view(){
        System.out.println("spring框架测试");
    }
}
