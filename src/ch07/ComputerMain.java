package ch07;

public class ComputerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 10;
		
		Calculator cal = new Calculator();
		System.out.println("원 면적 : " + cal.areaCircle(r));
		System.out.println();
		
		Computer com = new Computer();
		System.out.println("원 면적 : " + com.areaCircle(r));
		
		com.plus(10, 5);
		com.minus(100, 20);
	}

}

// 문제 3) Calculator 클래스를 상속받아 사칙연산을 하는 프로그램을 작성하시오.
// 조건1. Computer 클래스가 Calculator 클래스를 상속받음
// 조건2. 사칙 연산 메서드를 모두 override 함
// 조건3. Computer 클래스에는 화면에 결과를 프린트 하기위한 printer() 메서드가 존재함
// 조건4. 오버라이딩한 메서드는 printer() 메서드를 사용하여 결과를 출력함.
// 조건5. printer() 메서드는 매개변수를 2개 입력받고, 그 중 1개를 이용하여 사칙연산 중 어떤 것인지 판단하여 화면에 결과를 출력

// 카톡으로 보낼 때 양식 : 20201221_3번_이름.zip









