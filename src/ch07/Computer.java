package ch07;

// 자손 클래스
public class Computer extends Calculator {
//	부모 클래스에서 상속받은 areaCircle() 메소드
//	오버라이딩을 하게 되면 상속받은 areaCircle() 메서드를 사용하지 않고(가려지고) 자손 클래스에서 재정의한 areaCircle() 메서드를 사용하게 됨
//	오버라이딩 : 부모 클래스에서 상속 받은 멤버를 그대로 사용하지 않고, 자손 클래스에 맞게 수정해서 사용하는 방식
	
//	어노테이션 : 컴파일러에게 특정 작업을 수행한다고 알려주는 메시지 ->없어도 동작이 됨. 그러나 내가 오버라이드 하는 것의 이름에 오타가 나지 않게 잡아주고, 개발자들간에 확인하기에도 좋아서 써준다.
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
	
	void printer(int result, char oper) {
		switch (oper) {
		case '+':
			System.out.println("두 수의 덧셈은 " + result);
			break;
			
		case '-':
			System.out.println("두 수의 뺄셈은 " + result);
			break;
			
		case '/':
			System.out.println("두 수의 나눗셈은 " + result);
			break;
			
		case '*':
			System.out.println("두 수의 곱셈은 " + result);
			break;
		}
	}

		@Override
		public int plus(int x, int y) {
			int result = x + y;
			printer(result, '+');
			
			return result;
		}
				
		@Override
		public int minus(int x, int y) {
			int result = x - y;
			printer(result, '-');
			
			return result;
			
		}
		
		@Override
		public int multi(int x, int y) {
			int result = x * y;
			printer(result, '*');
			
			return result;
		}
		
		@Override
		public int div(int x, int y) {
			int result = x / y;
			printer(result, '/');
			
			return result;
		}
}
