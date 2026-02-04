package org.example;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public class UserWebService {
    @WebMethod
    public String guiThongTin(@WebParam(name = "username") String name, @WebParam(name = "phone") String phone) {
        System.out.println("Username: " + name);
        System.out.println("Phone: " + phone);
        return "Server: " + name + ", số điện thoại " + phone;
    }

}
