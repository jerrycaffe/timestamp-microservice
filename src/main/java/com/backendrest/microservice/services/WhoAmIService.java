package com.backendrest.microservice.services;

import com.backendrest.microservice.model.WhoAmI;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public interface WhoAmIService {
    public WhoAmI userInformation(HttpServletRequest request);
}
