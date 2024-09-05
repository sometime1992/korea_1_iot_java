package chapter03;

import java.util.ArrayList;
import java.util.Arrays;

public class D_Array {
	public static void main(String[] args) {
		// 자바의 기본 배열 형태
		// : 한 번 생성되면 크기 변경 X
		// >> 변경 시 새로운 배열 생성하여 원래 배열 요소를 복사
		int[] numbers = new int[5];
		System.out.println(Arrays.toString(numbers)); // [0, 0, 0, 0, 0]
		
		// 공통점 - 주소값을 가짐, (연속적)순서대로 담김
		
		// == 동적 배열 (ArrayList) 사용법 ==
		// : 자바의 ArrayList 라이브러리 내부의 기능
		// : java.utils.ArrayList를 import 해서 사용
		
		// cf) 동적 배열의 경우 배열의 타입 지정 시 일반 데이터 타입X, 참조 타입으로 작성
		// int >> Integer
		// char >> Charactor
		// boolean >> Boolean
		// String
		
		// +) 참조 타입은 기본값이 모두 null
		// [null, null, null, ...]
		
		// +) 기본 타입은 null값을 가질 수 X - int a = null; (X)
		
		Integer a = 123;
		System.out.println(a); // 123 (주소를 찾아가서 값을 출력)
		
		// == ArrayList 생성 ==
		// ArrayList<데이터타입> 배열명 = new ArrayList<>(선택);
		// >> 소괄호 안의 선택값은 초기용량을 설정
		//		: 지정하지 않을 경우 기본 용량 10
		ArrayList<Integer> arrayList = new ArrayList<>(20);
		
		
		
	}
}
