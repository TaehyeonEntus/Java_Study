package ref.ex;

public class ProductOrderMain1 {
    public static void main(String[] args) {
        ProductOrder[] order = {
                createOrder("두부",2000,2),
                createOrder("김치",5000,1),
                createOrder("콜라",1500,3)
        };
        printOrders(order);
    }
    static ProductOrder createOrder(String productname, int price, int quantity){
        ProductOrder p = new ProductOrder();
        p.productName = productname;
        p.price = price;
        p.quantity = quantity;
        return p;
    }

    static void printOrders(ProductOrder[] p){
        int totalAmount = getTotalAmount(p);
        for (int i = 0; i<p.length; i++){
        System.out.println("상품명: " + p[i].productName + ", 가격: " + p[i].price + ", 수량: " + p[i].quantity);
        }
        System.out.println("총 결제 금액 : " +totalAmount);
    }

    static int getTotalAmount(ProductOrder[] p){
        int totalAmount = 0;
        for (int i = 0; i<p.length; i++){
            totalAmount += p[i].price * p[i].quantity;
        }
        return totalAmount;
    }
}
