package chapter18;

// 빌더(Builder)
// : 복잡한 객체 생성을 단순화하는 생성 패턴
// - 객체의 생성자 인수가 많을 때 가독성이 떨어지는 문재를 보완
// - 체이닝 방식을 사용하여 가독성 있고 유연한 객체 생성

// cf) 디자인 패턴
// : 소프트웨어 공학에서 자주 발생하는 문제에 대한 재사용 가능한 해결책
// >> 생성, 구조, 행위 패턴
// >> 빌더 패턴은 '생성'패턴에 포함

// 1. 빌더 패턴의 구조(구현 단계)

// 1) Builder 클래스 생성
// : 객체 생성을 담당하는 "내부" 클래스

// 2) 필수 속성 설정
// : 생성자를 통한 필수 속성을 설정

// 3) 선택적 속성 설정
// : 체이닝 방식으로 선택적 속성을 설절할 수 있는 메서드 추가

// 4) build 메서드
// : 최종적으로 객체를 반환하는 메서드

// 2. 빌더 패턴의 특징
// - 가독성 & 유연성 확장
// - 불변 객체 생성 가능
// : 생성된 객체는 변경할 수 없는 객체로 안정성을 보장 받음

// === 제품 클래스 ==
class Product {
	
	// 필수 속성
	private final String name; // 제품명
	private final int price; // 제품 가격
	
	// 선택적 속성
	private String description; // 제품 설명
	private String manufacturer; // 제조사
	
	// -- 1) Builder 클래스 생성 --
	// 외부에서 직접적인 생성자 호출이 불가!
	private Product(Builder builder) {
		this.name = builder.name;
		this.price = builder.price;
		this.description = builder.description;
		this.manufacturer = builder.manufacturer;		
	}
	
	// 빌더 클래스 (내부 클래스)
	public static class Builder {
		// 필수 속성
		// >> final: 상수(초기값 필수)
		private final String name;
		private final int price;
		
		// 선택적 속성
		private String description;
		private String manufacturer;
		
		// 필수 속성을 위한 빌더 생성자
		public Builder(String name, int price) {
			this.name = name;
			this.price = price;
		}
		
		// 선택적 속성을 위한 메서드
		public Builder description(String description) {
			this.description = description;
			// cf) this 키워드
			// : 해당 클래스로 인스턴스화 된 객체 그 자체
			return this; // this - Builder
		}
		
		public Builder manufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
			return this;
		}
		
		// 최종적으로 Product 객체 반환
		public Product build() {
			return new Product(this);
		}
	}
	
	// --- 빌더 패턴에서는 Getter/Setter가 필요하지 않음
	// 데이터의 값을 할당하는 Setter
//	public void setName(String name) {
//		this.name = name;				
//	}
	
	// 데이터의 값을 호출하는 Getter
	public String getName() {
		return name;
	}
	
}
	
	// 빌더 패턴을 사용할 때는 보통 setter 메소드가 필요하지 않습니다.
	// 이는 객체를 불변(immutable)하게 만들어 변경할 수 없도록 하기 위함입니다
	// getter 메소드의 경우, 필요 여부는 상황에 따라 다릅니다.
	// 빌더 패턴을 사용하면 객체 생성 시 필요한 모든 값을 설정할 수 있으므로,
	// 객체의 상태를 외부에서 읽어야 할 필요가 없다면 getter도 생략할 수 있습니다.
	// 그러나, 객체의 상태를 읽어야 하는 경우에는 getter를 사용하는 것이 일반적입니다
	// 빌더 패턴의 주요 목적은 객체를 안전하게 생성하고, 불변성을 유지하는 것입니다.
	// 따라서 setter를 사용하지 않음으로써 객체의 상태가 변경되지 않도록 보장할 수 있습니다


public class Builder01 {
	public static void main(String[] args) {
		// 빈 제품(Product) 객체를 인스턴스화
//		Product product1 = new Product();
//		product1.setName("아이폰 16");
//		System.out.println(product1.getName()); // 아이폰 16
		
		// a) 필수 속성만 설정한 Product 객체 생성
		Product pd1 = new Product.Builder("아이폰16", 20).build();
		
		// b) 선택적 속성을 설정한 Product 객체 생성
		Product pd2 = new Product.Builder("갤럭시 S24", 18)
				.description("갤럭시 핸드폰")
				.manufacturer("삼성")
				.build(); // 객체 생성 메서드를 반드시 호출! (최종적으로 Product 반환)
		
		Product pd3 = new Product.Builder("갤럭시 북", 18)
				.description("갤럭시 노트북")
				.build(); 
		
		System.out.println(pd1.getName()); // 아이폰16
		System.out.println(pd2.getName()); // 갤럭시 S24
		System.out.println(pd3.getName()); // 갤럭시 북

		
	}
}
