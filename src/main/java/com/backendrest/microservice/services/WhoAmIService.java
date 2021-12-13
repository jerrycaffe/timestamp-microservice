package com.backendrest.microservice.services;

import com.backendrest.microservice.model.WhoAmI;

import javax.servlet.http.HttpServletRequest;

public interface WhoAmIService {
    public WhoAmI userInformation(HttpServletRequest request);
}
