package chapter13;

public class SingletonMain {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		System.out.println(singleton1); // chapter13.Singleton@5f184fc6
		
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton2); // chapter13.Singleton@5f184fc6

		if(singleton1 == singleton2) {
			System.out.println("동일한 인스턴스");
			// 동일한 인스턴스
		} else {
			System.out.println("다른 인스턴스");
		}
		
		
	}
}
