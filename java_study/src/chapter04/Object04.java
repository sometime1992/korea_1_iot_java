package chapter04;

// 클래스 생성 (Book, Person, ...)
// : 속성 2개
// : 메서드 1개
class Book {
	// 클래스 내부의 데이터(속성)
	String title; // 책 제목
	String publisher; // 출판사
	int pageNumber; // 책 페이지 수
	
	// 클래스 내부의 동작(메서드)
	void displayInfo() {
		System.out.println(title + publisher);
	}
	
	// === 생성자 함수 ===
	// : new 연산자 사용 시 호출 될 메서드
	// >> 생략 시 속성에 기본값이 할당
	// 일반 타입: int(0), boolean(false), char("")
	// 참조 타입: null
	
	// >> 생략 시 클래스명과 동일하면서 매개변수가 없는 메서드
	Book(String title, String publisher, int pageNumber) { // 매개변수로 받은 데이터로 속성 초기화
		// this.클래스속성 = 매개변수명;
		this.title = title;
		this.publisher = publisher;
		this.pageNumber = pageNumber;
	}
}

public class Object04 {
	public static void main(String[] args) {
		// 위에서 정의한 클래스를 사용하여 객체 인스턴스화
		Book myBook = new Book("백설공주", "코리아it아카데미", 50);
		Book anotherBook = new Book("신데렐라", "에이원플라자", 100);
		
		// 속성 출력
		System.out.println(myBook.pageNumber);
		System.out.println(myBook.publisher);
		System.out.println(myBook.title);

		System.out.println(anotherBook.pageNumber);
		System.out.println(anotherBook.publisher);
		System.out.println(anotherBook.title);
		
		// 메서드 호출
		myBook.displayInfo(); // 백설공주코리아it아카데미
		anotherBook.displayInfo(); // 신데렐라에이원플라자
		
		myBook.pageNumber = 1234;
		System.out.println(myBook.pageNumber); // 1234
	}
}
