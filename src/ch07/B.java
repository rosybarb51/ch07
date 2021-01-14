package ch07;

// 클래스 B에서 클래스 A를 기반으로 객체를 생성함
public class B {
	public void method() {
//		기본타입으로 생각하고 있지만 사실은 클래스이다. String, int,.. 등 자바에 존재하는 모든 것은 사실 클래스이다. object 클래스라는 곳에서 만들어진다. 
//		in은 클래스 뒤에 적혀져 있으니까 객체이다.
//		클래스를 통해서 객체를 생성한다는 것은 해당 클래스 타입의 변수를 생성하는 것이다. 
//		Integer in = 0;
//		String str = "";
//		A타입의 b를 만든것이다. b는 변수이다. 초기화가 안돼서 객체가 아니다.
//		A b;
//		new를 통해서 생성자를 실행하면서 객체가 만들어지고, A 클래스 타입의 변수 a에 대입을 해준다. 
		A a = new A();
		a.field = "value";
		a.method();
	}
}
