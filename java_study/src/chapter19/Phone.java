package chapter19;

import lombok.Builder;
import lombok.Data;

@Builder
@Data 
// >> getter, Setter, equals, toString 등을 생성
// >> 클래스의 여러 메서드가 생성
public class Phone {
	private String model;
	private Integer number;
}
