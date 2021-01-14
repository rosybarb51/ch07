package ch07_1;

import ch07.A;

// 다른 패키지이지만 상속 받음.
public class D extends A {
//	그래서 protected로 막아놓은 것들 그대로 쓸 수 있다. 
	public D() {
		super();
		this.field = "value";
		this.method();
	}
}
