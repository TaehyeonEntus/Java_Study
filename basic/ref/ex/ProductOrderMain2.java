package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        scanner.nextLine(); //입력 버퍼 지우기

        ProductOrder[] order = new ProductOrder[n];
        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); //입력 버퍼 지우기

            order[i] = createOrder(productName,price,quantity);
        }

        printOrders(order);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder p = new ProductOrder();
        p.productName = productName;
        p.price = price;
        p.quantity = quantity;
        return p;
    }

    static void printOrders(ProductOrder[] p) {
        int totalAmount = getTotalAmount(p);
        for (int i = 0; i < p.length; i++) {
            System.out.println("상품명: " + p[i].productName + ", 가격: " + p[i].price + ", 수량: " + p[i].quantity);
        }
        System.out.println("총 결제 금액 : " + totalAmount);
    }

    static int getTotalAmount(ProductOrder[] p) {
        int totalAmount = 0;
        for (int i = 0; i < p.length; i++) {
            totalAmount += p[i].price * p[i].quantity;
        }
        return totalAmount;
    }
}
