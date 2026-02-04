package org.example;

import org.example.client.UserWebService;
import org.example.client.UserWebServiceService;
import java.util.Scanner;

public class RunClient {
    public static void main(String[] args) {
        try {
            // Khởi tạo Service và Port (Cầu nối)
            UserWebServiceService service = new UserWebServiceService();
            UserWebService port = service.getUserWebServicePort();

            // Nhập liệu từ bàn phím
            Scanner scanner = new Scanner(System.in);
            System.out.println("=== CHƯƠNG TRÌNH SOAP CLIENT ===");
            System.out.print("Nhập tên của bạn: ");
            String name = scanner.nextLine();
            System.out.print("Nhập số điện thoại: ");
            String phone = scanner.nextLine();

            // Gọi hàm lên Server
            System.out.println("Đang gửi dữ liệu...");
            String response = port.guiThongTin(name, phone);

            // In kết quả trả về
            System.out.println("------------------------------");
            System.out.println("Kết quả từ Server: " + response);
            System.out.println("------------------------------");

        } catch (Exception e) {
            System.err.println("Lỗi khi kết nối Server: " + e.getMessage());
        }
    }
}