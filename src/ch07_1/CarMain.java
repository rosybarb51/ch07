package ch07_1;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car 클래스 타입으로 객체 생성
		Car car = new Car();
		
		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
//			Car에서 넘겨준 1,2,3,4 에 따른..
			case 1:
				System.out.println("앞 왼쪽 HankookTire로 교체");
//				Car에서 Tire 클래스 타입으로 Tire 객체를 만들어줬는데, Tire 클래스를 상속받은 HankookTire와 KumhoTire가 그대로 사용해줬다. 
				car.frontLeftTire = new HankookTire("앞 왼쪽", 15);
				break;
			case 2:
				System.out.println("앞 오른쪽 HankookTire로 교체");
				car.frontRightTire = new KumhoTire("앞 오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤 왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire("뒤 왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤 오른쪽 HankookTire로 교체");
				car.backRightTire = new KumhoTire("뒤 오른쪽", 17);
				break;
			}
			
			System.out.println("----------------------------");
		}
	}

}