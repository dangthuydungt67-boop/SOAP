package org.example;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public class UserWebService {
    @WebMethod
    public String guiThongTin(@WebParam(name = "username") String name, @WebParam(name = "phone") String phone) {
        // YÊU CẦU 4: In ra log tại Server
        System.out.println("==== LOG SERVER ====");
        System.out.println("Username: " + name);
        System.out.println("Phone: " + phone);
        return "Server: Hello " + name + ", tôi đã nhận được số " + phone;
    }
}