package org.example;
import jakarta.xml.ws.Endpoint;

public class RunServer {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/ws/user", new UserWebService());
        System.out.println("Server đã chạy tại: http://localhost:8080/ws/user?wsdl");
    }
}