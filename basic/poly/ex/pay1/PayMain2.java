package poly.ex.pay1;

import java.util.Scanner;

public class PayMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayService payService = new PayService();
        while(true){
            System.out.print("결제 수단을 입력하세요: ");
            String option = scanner.nextLine();

            System.out.print("결제 금액을 입력하세요: ");
            int amount = scanner.nextInt();

            scanner.nextLine(); //입력버퍼 초기화

            payService.processPay(option,amount);
        }
/*

        //카카오 결제
        payService.processPay("kakao",5000);

        //네이버 결제
        payService.processPay("naver",5000);

        payService.processPay("apple",5000);

        payService.processPay("null",5000);
*/

    }
}
