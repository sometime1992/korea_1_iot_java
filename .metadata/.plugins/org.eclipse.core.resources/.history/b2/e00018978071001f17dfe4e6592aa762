package chapter16;

// 동물들의 행동을 정의할 Animal 인터페이스 정의
interface Animal {
	void performAction(); // 동물의 행동을 정의하는 추상 메서드
}

// 동물원 관리 시스템 구현
class Zoo {
	
	// 사자 클래스
	// 인터페이스 Animal을 구현(implements)하는 사자 클래스
	static class Lion implements Animal {
		private String day; // 요일에 따라 사자의 행동이 달라짐
		
		// 생성자에서 요일을 받음
		public Lion(String day) {
			this.day = day;
		}
		
		@Override
		public void performAction() {
			// a.equalsIgnoreCase(b)
			// : 대소문자 구분 없이 문자열 비교
			if(day.equalsIgnoreCase("Sunday")) {
				// 일요일 - 사냥
				class SundayAction implements Animal {
					@Override
					public void performAction() {
						System.out.println("사자는 사냥합니다.");
					}
				}
				
				// 내부 클래스 객체 생성 후 행동 수행
				Animal specialAction = new SundayAction();
				specialAction.performAction();
				
			} else {
				// 람다 표현식을 사용하여 평소 행동을 정의
				Animal regularAction = () -> System.out.println("사자가 포효합니다."); // regularAction을 () -> System.out.println("사자가 포효합니다.");넣음
				regularAction.performAction(); // 호출
			}
		}
	}
	
	// 원숭이 클래스
	static class Monkey implements Animal {
		@Override
		public void performAction() {
			Animal action = () -> System.out.println("원숭이는 나무를 타고 오릅니다.");
			 action.performAction();
		}
	}
	
	public static void main(String[] args) {
		Animal lion = new Lion("Sunday");
		lion.performAction();
		
		Animal lion2 = new Lion("Saturday");
		lion2.performAction();
		
		Animal monkey = new Monkey();
		monkey.performAction();
		
		Animal penguin = new Animal() {
			// 익명 클래스 - 펭귄의 행동 정의
			@Override
			public void performAction() {
				// 익명클래스 내부에서 펭귄의 행동 정의
				System.out.println("펭귄은 뒤뚱뒤뚱 겉습니다.");
			}
		};
		penguin.performAction();
	}
}


