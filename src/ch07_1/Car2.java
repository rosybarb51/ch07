package ch07_1;

public class Car2 {
//	중괄호 들어가면 선언과 동시에 사용
//	Tire 클래스의 배열로 해당 클래스의 객체 네 개가 배열로 저장됨.. Car와 다른 방식으로 객체를 저장해줌. 똑같은 이름인데도..
	Tire[] tires = {
			new Tire("앞 왼쪽", 6), 
			new Tire("앞 오른쪽", 2), 
			new Tire("뒤 왼쪽", 3), 
			new Tire("뒤 오른쪽", 4)
			};
	
//	위와 같은 방식말고 아래와 같은 방식으로 배열 만들어도 된다. 
//	Tire[] ti = new Tire[4];
//	ti[0] = new Tire("앞 왼쪽", 6);
	
	int run() {
		System.out.println("[자동차가 달립니다.]");
//		간단하게 배열로 돼 있어서 Car와 다르게 for 문 썼다.
//		근데 아래와 같이 if문도 적어줘도 된다. 배열이니까 인덱스 번호를 이용해서. 근데 if 문 네 번 적는 것보다, for 문 한 번 적는 게 소스를 줄이는 방법임. 그리고 if 문 두 번째에서 실수를 하면 아래로 계속 index 실수해서 그 아래로 3번이나 고쳐줘야한다. 그러나 for문으로 잘 못 적으면 한 번만 고쳐주면된다. 그래서 유지보수도 for문 사용이 더 좋다. 
//		if (tires[0].roll() == false) {
//			stop();
//			return 1;
//		}
//		
//		if (tires[1].roll() == false) {
//			stop();
//			return 2;
//		}
//		if (tires[2].roll() == false) {
//			stop();
//			return 3;
//		}
//		if (tires[3].roll() == false) {
//			stop();
//			return 4;
//		}
		
		for (int i = 0; i < tires.length; i++) {
			if (tires[i].roll() == false) {
//				i가 0부터 시작하기 때문에 +1해줘서 1부터 시작하게 했다. 왜냐하면 return 0 은 관례적으로 종료를 의미하기 때문.
				return (i + 1);
			}
		}
//		return 0 은 관례적으로 정상적인 종료
		return 0;
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
