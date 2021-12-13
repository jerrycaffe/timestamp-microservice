package com.backendrest.microservice.model;

public class WhoAmI {
    private String language;
    private String software;
    private String ipaddress;

    public WhoAmI(String lan, String ip, String soft){
        language = lan;
        software = soft;
        ipaddress = ip;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    @Override
    public String toString() {
        return "WhoAmI{" +
                "language='" + language + '\'' +
                ", software='" + software + '\'' +
                ", ipaddress='" + ipaddress + '\'' +
                '}';
    }
}
