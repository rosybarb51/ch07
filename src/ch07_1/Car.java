package ch07_1;

public class Car {
	Tire frontLeftTire = new Tire("앞 왼쪽", 6);
	Tire frontRightTire = new Tire("앞 오른쪽", 2);
	Tire backLeftTire = new Tire("뒤 왼쪽", 3);
	Tire backRightTire = new Tire("뒤 오른쪽", 4);
	
	int run() {
		System.out.println("[자동차가 달립니다.]");
//		변수 이름이 네 개라서 반복문을 돌릴 수 없다. 그래서 if문을 네 번 적어줬다. Car2와 실질적인 로직은 똑같지만 식이다른 이유.
		if (frontLeftTire.roll() == false) {
			stop();
//			return 실행되면 결과값을 메서드를 호출한 곳으로 돌려주고, 해당 메서드 종료
			return 1;
		}
		
		if (frontRightTire.roll() == false) {
			stop();
			return 2;			
		}
		
		if (backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		
		if (backRightTire.roll() == false) {
			stop();
			return 4;
		}
		
		return 0;
	}
	void stop() {
		System.out.println("[자동차가 멈췄습니다.]");
		
	}
}
