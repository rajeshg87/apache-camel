package com.rajesh.camel.controller;

import com.rajesh.camel.service.DateTimeService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class DateTimeController {

    private DateTimeService dateTimeService;

    @GetMapping(path = "/getCurrentDateAndTime")
    public String getCurrentDateAndTime(){
        return dateTimeService.getCurrentDateAndTime();
    }
}
