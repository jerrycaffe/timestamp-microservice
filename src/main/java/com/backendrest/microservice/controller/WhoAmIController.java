package com.backendrest.microservice.controller;

import com.backendrest.microservice.model.WhoAmI;
import com.backendrest.microservice.services.WhoAmIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api")
public class WhoAmIController {
    @Autowired
private WhoAmIService whoAmIService;
    @GetMapping(value = "/whoami", produces = "application/json")
    public WhoAmI respond(HttpServletRequest request){

        return whoAmIService.userInformation(request);
    }
}
