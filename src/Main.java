import java.util.Scanner;

class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập vào độ dài 3 cạnh của tam giác:");
            double side1 = scanner.nextDouble();
            double side2 = scanner.nextDouble();
            double side3 = scanner.nextDouble();

            if (side1 <= 0 || side2 <= 0 || side3 <= 0 || side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
                throw new IllegalTriangleException("Đây không phải là tam giác hợp lệ!");
            }

            System.out.println("Đây là tam giác hợp lệ.");
        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi: Vui lòng nhập số.");
        }
    }
}
