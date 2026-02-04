package org.example;

import org.example.client.UserWebService;
import org.example.client.UserWebServiceService;
import java.util.Scanner;

public class RunClient {
    public static void main(String[] args) {
        try {
            UserWebServiceService service = new UserWebServiceService();
            UserWebService port = service.getUserWebServicePort();

            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập tên của bạn: ");
            String name = scanner.nextLine();
            System.out.print("Nhập số điện thoại: ");
            String phone = scanner.nextLine();
            String response = port.guiThongTin(name, phone);

            System.out.println("Kết quả từ Server: " + response);

        } catch (Exception e) {
            System.err.println("Lỗi khi kết nối Server: " + e.getMessage());
        }
    }

}
