package ch07_1;

public class HankookTire extends Tire {
	
//	HankookTire 클래스의 생성자
	public HankookTire(String location, int maxRotation) {
//		super() 부모 클래스의 생성자를 호출
//		부모 클래스에 기본 생성자가 아닌, 매개변수가 들어간 타입의 생성자를 썼기 때문에, 자식클래스인 여기에서는 super라고하는 부모클래스의 생성자를 불러오는 것을 직접 명시해줘야한다.
//		부모 클래스에서 기본 생성자를 구현하지 않고 다른 생성자를 사용했을 경우 super(매개변수, ...) 형식으로 부모 클래스의 생성자를 직접 호출해야 함
		super(location, maxRotation);
	}
	
//	오버라이딩을 하겠다는 어노테이션
//	컴파일러에서 한 번 더 확인해준다. 저것과 똑같이 생긴 메서드가 부모 클래스에 존재하는지 확인해준다. 존재하면 문제없이 넘어간다. 만약에 오류표시가 나면 동일한 게 없다는 뜻.(오버라이딩하는데 문제가 있다는 뜻)
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
//			오버라이딩을 통해서 내용 변경
			System.out.println(location + "HankookTire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		}
		else {
			System.out.println("*** " + location + "HankookTire 펑크 ***");
			return false;
		}
	}
}
