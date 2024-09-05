package chapter02;

import java.util.Scanner;

public class E_Practice {
	// main 메서드
	// main + 자동 완성 (ctrl +space)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean isRun = true;
		
		// syso + 자동완성
		System.out.println("프로그램 시작");
		
		while(isRun) {
			System.out.println("[메인 메뉴]");
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 조회");
			System.out.println("3. 회원 탈퇴");
			System.out.println("q. 프로그램 종료");
			
			System.out.print("메뉴 선택");
			// .nextLine(); : 개행 문자(enter키 값, 줄바꿈)까지 처리
			String selectedMenue = sc.nextLine();
			
			switch (selectedMenue) {
			case "1" :
				System.out.println("회원 등록 페이지입니다.");
				break;
			case "2" :
				System.out.println("회원 조회 기능입니다.");
				boolean isRunMenue2 = true;
				while (isRunMenue2) {
					System.out.println("[회원 조회]");
					System.out.println("1. 회원 번호로 조회");
					System.out.println("2. 회원 이름으로 조회");
					System.out.println("b. 뒤로가기");
					selectedMenue = sc.nextLine();
					switch (selectedMenue) {
					case "1":
						System.out.println(">> 번호로 회원을 조회합니다.");
						break;
					case "2":
						System.out.println(">> 이름 회원을 조회합니다.");
						break;
					case "b":
						System.out.println(">> 프로그램을 종료합니다.");
						isRun = false;
						isRunMenue2 = false;
						break;
					default:
						System.out.println("잘못된 입력입니다. 다시 입력하세요");
						break;
					}	
				}
				
				break;
			case "3" :
				System.out.println("회원 탈퇴 기능입니다.");
				break;
			case "q" :
				System.out.println("프로그램을 종료합니다.");
				isRun = false;
				break;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			}
			
		}
		
		sc.close();
		System.out.println("프로그램 종료");
		
		// 저장: ctrl + s
		// 실행: ctrl + f11
		
	}
}
