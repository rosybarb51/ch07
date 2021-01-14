package ch07;

// 부모 클래스로써 Student클래스에게 멤버변수와 메서드를 상속해줌
public class People {
	public String name;
	public String ssn;
	
//	다른 생성자가 존재할 경우에 자손 클래스에서 super()를 통해서 기본 생성자를 호출하고자 하면 아무런 기능이 없더라도 부모 클래스에서 기본 생성자를 생성하여야 함.
//	public People() {
//		
//	}
//	부모클래스에 위와같은 기본 생성자가 없이 아래와 같은 매개 변수를 입력하는 생성자가 있으면, 자손 클래스에서도 매개 변수 부분 다 적어줘야 한다. 안 그럼 오류난다. 
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}
