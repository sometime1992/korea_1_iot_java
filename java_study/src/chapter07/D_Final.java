package chapter07;


// final 키워드
// : 변수, 메서드, 클래스에서의 사용법

class MyFinalClass {
	// 1. final 변수
	// : 상수를 지정하는 키워드
	// >> 재할당이 불가능, 선언과 동시에 초기화
	// >> 변수명을 모두 대문자로 작성, 단어와 단어의 연결을 (_)기호로 연결
	final int FINAL_VALIABLE = 30;
	// FINAL_VALIABLE = 10; - Error
	
	// 2. final 메서드
	// : 자식 클래스에서 오버라이드(재정의) 할 수 없는 메서드를 의미
	// 접근제한자 final 반환타입 메서드명() {}
	public final void myMethod() {
		System.out.println("재정의 할 수 없는 메서드");
	}
}

// 3. final 클래스
// final class 클래스명
// : 더 이상 상속될 수 없는 클래스를 의미
// >> final 클래스를 부모 클래스로 사용할 수 X
final class ChildClass extends MyFinalClass {
//	@Override
//	public void myMethod() {
//		
//	}
	// : 상속받은 final 메서드는 자식 클래스에서 재정의 되지 X
	// >> 생략된 형태만으로 사용 가능
}

//class GrandSon extends ChildClass { 
//	- Error(final 클래스를 상속받지 못함)
//}

public class D_Final {
	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		cc.myMethod(); // 재정의 할 수 없는 메서드
		
		// 하이픈 VS 언더스코어
//		choco-cake
//		choco_cake (하나의 단어로 인식)
		
		// final 장단점
		
		// - 장점
		// : 불변성
		// >> 안정성 보장
		
		// - 단점
		// : 유연성 감소
		// >> 상속 X, 오버라이딩 X: 그 자체로만 사용 가능
	}
}
