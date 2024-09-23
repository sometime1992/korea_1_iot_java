package example;

class Parent {
    int x = 100; // 500
    
    Parent() {
        this(500);
    }
 
    Parent(int x) {
        this.x = x;
    }
 
    int getX() {
        return x;
    }
}
/*
	Parent p1 = new Parent();
	// Parent(500);
	// p1.x = 500;

	Parent p2 = new Parent(300);
	// p2.x = 300;
*/
class Child extends Parent {
    int x = 4000; // 5000
    
    Child() {
    	// super();
        this(5000);
    }
 
    Child(int x) {
    	// super();
        this.x = x;
    }
    
    @Override
    int getX() {
    	return x;
    }
    
    
}
 
public class Example01 {
    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println(obj.getX()); // 오버라이딩 전이면 부모 클래스의 값을 가져온다
        System.out.println(obj.x);
        System.out.println(obj.getX());
    }
}