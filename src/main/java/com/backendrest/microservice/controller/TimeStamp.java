package com.backendrest.microservice.controller;

import com.backendrest.microservice.exception.ApiException;
import com.backendrest.microservice.exception.ApiExceptionHandler;
import com.backendrest.microservice.model.CheckTime;
import com.backendrest.microservice.model.ErrorResponse;
import com.backendrest.microservice.services.CheckTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.time.ZonedDateTime;

import static java.util.Objects.requireNonNull;

@RestController
@RequestMapping("/api/v1/")
public class TimeStamp {



   @Autowired //constructor injection here mr biola you feel me?
    private CheckTimeService checkTimeService;


    @GetMapping(value = "/timestamps", produces = "application/json")
    public CheckTime home() {
        return checkTimeService.convertNoArgs();
    }

    @GetMapping(value = "timestamps/{date}", produces = "application/json")
    public CheckTime convert(@PathVariable("date") String date) throws ErrorResponse, ParseException {

        return checkTimeService.convert(date);
    }
}
