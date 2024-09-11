package chapter14.view;

import java.util.Scanner;

public class OrderView {
	// 사용자로부터 주문을 받는 로직
	private Scanner sc = new Scanner(System.in);
	
	// 메뉴 선택을 사용자에게 요청하는 메서드
	public String getUserChoice() {
		System.out.println("====================");
		System.out.println("Selcet an option: ");
		System.out.println("1. Pizza");
		System.out.println("2. Pasta");
		System.out.println("3. Coke");
		System.out.println("4. Ade");
		System.out.println("Your Choice: ");
		return sc.nextLine();
	}
	
	// 주문 수량을 사용자에게 요청하는 메서드
	public int getQuantity() {
		System.out.println("Enter Quantity");
		int quantity = sc.nextInt(); // 개행 문자떄문에 nextInt를 바로 리턴으로 전달하면 수량과 개행문자가 같이 인식이되서 디폴트값이 같이 전달된다.
		sc.nextInt();
		return quantity;
	}
	
	// 총 주문 가격을 표시하는 메서드
	public void displayTotalPrice(int price) {
		System.out.println("Total price: " + price + " KRW");
	}
	
	// 주문 완료 메시지 표시 메서드
	public void displayOrderComplete() {
		System.out.println("Order has been completed");
	}
	
	
}
