package com.rajesh.camel.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DateTimeServiceImpl implements DateTimeService {

    @Autowired
    Environment environment;

    @Override
    public String getCurrentDateAndTime() {
        String message = environment.getProperty("message");
        LocalDateTime localDateTime = LocalDateTime.now();
        return new StringBuilder().append(message)
                .append(StringUtils.SPACE)
                .append(localDateTime.toString())
                .toString();
    }
}
