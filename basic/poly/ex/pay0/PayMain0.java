package poly.ex.pay0;

public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        //카카오 결제
        payService.processPay("kakao",5000);

        //네이버 결제
        payService.processPay("naver",5000);

        payService.processPay("apple",5000);

        payService.processPay("null",5000);

    }
}
