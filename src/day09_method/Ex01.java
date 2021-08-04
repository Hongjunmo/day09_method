package day09_method;

public class Ex01 {
	public static void main(String[] args) {
		
		/*
		 	-Class
		 	-사용자 정의 자료형 (사용자가 만들고 싶은데로 만들어 사용하는 자료형)
		 	- 재사용이 가능함
			
		 	객체
		 	-class 자료형으로 변수를 만드는것(참조)
		 	
		 	메소드
		 	-기능을 말함   
		 	-보편적으로 메소드 또는 함수라고 말함
		 	-메소드는 클래스 내부에서 정의하는 것을 말함
		 	-함수는 클래스 없이 독립적으로 사용하는 것
		 	
		 	접근제한자
		 	-publicc : 외부 , 내부 접근 허용
		 	-private : 외부의 접근을 막음 내부에서만 허용
		 	- protected : 상속받은 자식.
		 	- default: 선언 안하면 기본으로 붙음  동일한 패키지에서만 접근 가능
		 */
	
	
		Ex01_Class ex = new Ex01_Class();
		
		ex.name="안녕하세요";
		ex.age=12345;
		System.out.println(ex.name);
	}
}
