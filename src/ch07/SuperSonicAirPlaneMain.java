package ch07;

public class SuperSonicAirPlaneMain {
	public static void main(String[] args) {
		SupersonicAriplane sa = new SupersonicAriplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAriplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAriplane.NORMAL;
		sa.fly();
		sa.land();
		
	}
}
