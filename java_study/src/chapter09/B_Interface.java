package chapter09;

// 인터페이스(Interface) - 상호작용하다
// : 객체가 어떤 방식으로 동작해야 하는지를 정의하는 추상 타입
// >> 추상 메서드와 상수만으로 구성된 특수한 클래스 (구체적인 기능이 없음 only 틀만)
// >> 모든 메서드가 추상 메서드인 추상 클래스와 유사
// - 객체의 기능을 정의하고, 실제 구현은 인터페이스를 구현하는 클래스에서 담당

// ** 추상클래스는 다중 상속이 불가 **

// == 인터페이스의 필요성 =
// : 서로 다른 클래스에 대해 공통된 동작을 보장할 때
// : 여러 인터페이스를 동시에 구현 가능
// >> 한 클래스에 대해 여러 개의 인터페이스 구현이 가능

// = 인터페이스 구현 방법 =
// interface 키워드를 사용하여 선언

// 카드 게임에 대한 정의
// interFace 인터페이스명 {

// }

// >> 접근 제어자로 public과 default만 사용 가능
interface PlayingCard {
	// 1. 멤버 변수(필드)
	// :  public static final 특성을 가짐
	// >> 해당 키워드들이 생략 O
	// >> 타입 상수명 = 값;
	public static final int Spade = 4;
	final int DIAMOND = 3;
	static int HEART = 2;
	int CLOVER = 1;
	
	// 2. 메서드(추상) (public abstract이 항상 포함)
	// >> 모든 메서드는 추상 메서드여야 함 (abstract 키워드가 생략 가능)
	// >> 해당 인터페이스의 활용을 위해 모든 클래스에서 접근이 가능 (public 키워드가 생략 가능)
	
	// String getCardNumber(); == public abstract String getCardNumber();
	public abstract String getCardNumber();
	String getCardKind();
	
	// 3. 디폴트 메서드
	// : 인터페이스에 새 기능을 추가하면서 기존 구현을 포함
	// >> 기본 구현 제공, 오버라이딩(재정의) 가능
	default void defaultMethod() {
		System.out.println("디폴트 메서드입니다.");
	}
	
	// 4. 정적 메서드
	// : 인터페이스에서 직접 구현
	// >> 인터페이스 이름으로 직접 호출, 오버라이딩 불가능
	static void staticMethod() {
		System.out.println("정적 메서드입니다.");
	}
}

// == 인터페이스 구현 ==
// >> 클래스에 implements 키워드를 사용하여 인터페이스 구현
class Card implements PlayingCard{
	private String cardNumber;
	private String cardKind;
	
	public Card(String cardNumber, String cardKind) {
		this.cardKind = cardKind;
		this.cardNumber = cardNumber;
	}
	
	// ** 인터페이스 안의 메서드를 구현한 클래스 메서드는 public 지정 **
	public String getCardNumber() {
		return cardNumber;
	}
	
	public String getCardKind() {
		return cardKind;
	}
	
	@Override
	public void defaultMethod() {
		System.out.println("Card 클래스에서 재정의된 디폴트 메서드입니다.");
	}
}

public class B_Interface {
	public static void main(String[] args) {
		// == 인터페이스의 추상 메서드 사용 ==
		Card card = new Card("7", "Heart");
		System.out.println(card.getCardNumber());
		System.out.println(card.getCardKind());
		
		// 재정의(오버라이딩)가 선택적
		card.defaultMethod(); // 디폴트 메서드입니다.

		// card.staticMethod(); - Error
		PlayingCard.staticMethod(); // 인터페이스에서 생성된 static변수는 인터페이스 이름으로만 호출 가능
		
		// 인터페이스의 필드(상수) 사용
		System.out.println(PlayingCard.CLOVER);
		System.out.println(PlayingCard.DIAMOND);
		System.out.println(PlayingCard.HEART);
		System.out.println(PlayingCard.Spade);
		
		
		
	}
}
