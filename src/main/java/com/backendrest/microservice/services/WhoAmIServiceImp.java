package com.backendrest.microservice.services;

import com.backendrest.microservice.model.WhoAmI;

import javax.servlet.http.HttpServletRequest;

public class WhoAmIServiceImp implements WhoAmIService{
    private String language;
    private String software;
    private String ipaddress;

    @Override
    public WhoAmI userInformation(HttpServletRequest request) {

        language = String.valueOf(request.getLocale());
        software = request.getHeader("User-Agent");
        ipaddress = request.getRemoteAddr();

        if(ipaddress.equals("0:0:0:0:0:0:0:1")) ipaddress = "127.0.0.1";

        return new WhoAmI(language, ipaddress, software);
    }
}
