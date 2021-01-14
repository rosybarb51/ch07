package ch07_1;

public class Car2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 car2 = new Car2();
		
		for (int i = 1; i <= 5; i++) {
			int problemLocation = car2.run();
			
//			Car2에서 정상종료 return 0이면. 
			if (problemLocation != 0) {
				System.out.println(car2.tires[problemLocation -1 ].location + "HankookTire로 교체");
//				car2의 tires에 한국타이어나 금호타이어를 넣은 부분. 이게 다형성...관련된 부분.. 
				car2.tires[problemLocation - 1] = new HankookTire(car2.tires[problemLocation - 1].location, 15);
			}
			
			System.out.println("--------------------");
		}
	}

}
