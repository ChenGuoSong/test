package com.cgs.example.servicefeign.com.cgs.example.impl;

import com.cgs.example.servicefeign.com.cgs.example.service.ServiceHi;
import org.springframework.stereotype.Component;

@Component
public class ServiceHiImpl implements ServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry" + name;
    }
}
