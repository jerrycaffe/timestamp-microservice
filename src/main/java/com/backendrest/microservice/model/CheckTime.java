package com.backendrest.microservice.model;

public class CheckTime {
    private final Long unix;
    private final String utc;

    public CheckTime(Long unix, String utc){
        this.unix = unix;
        this.utc = utc;
    }

    public Long getUnix() {
        return unix;
    }

    public String getUtc() {
        return utc;
    }

    @Override
    public String toString() {
        return "CheckTime{" +
                "unix=" + unix +
                ", utc='" + utc + '\'' +
                '}';
    }
}
