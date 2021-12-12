package com.backendrest.microservice.services;

import com.backendrest.microservice.model.CheckTime;
import com.backendrest.microservice.model.ErrorResponse;

import java.text.ParseException;

public interface CheckTimeService {
    CheckTime convertNoArgs();
    CheckTime convert(String date) throws ParseException, ErrorResponse;
}
