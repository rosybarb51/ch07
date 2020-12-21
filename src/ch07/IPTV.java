package ch07;

//문제 1) Television 클래스 상속받아 IPTV 클래스 만들고, VOD 채널 볼 수 있는 프로그램 작성하기. 
public class IPTV extends Television {
//	IPTV의 멤버 변수
	int channelVod;
	
//	생성자를 사용하여 기본값 입력
	IPTV() {
		channelVod = 101;
		channel = 1;
		volume = 0;
	}
	
	void turnOnVOD() {
		System.out.println("VOD를 시작합니다.");
	}
	
	void turnOffVOD() {
		System.out.println("VOD를 종료합니다.");
	}
	
	void changeChannelVod(int channelVod) {
		this.channelVod = channelVod;
		System.out.println(this.channelVod + "번 채널로 변경합니다.");
	}
	
	void channelVodUp() {
		if (channelVod < 100 || channelVod >= 200) {
			channelVod = 101;
			System.out.println("vod 채널을 101번으로 변경합니다.");
		}
		else {
			channelVod++;
			System.out.println("vod 채널을 " + channelVod + "번으로 변경 합니다.");
		}	
	}	
	
	void channelVodDown() {
		if (channelVod < 100 || channelVod >= 200) {
			channelVod = 101;
			System.out.println("vod 채널을 101번으로 변경합니다.");
		}
		else {
			channelVod++;
			System.out.println("vod 채널을 " + channelVod + "번으로 변경 합니다.");
		}	
	}
	
}
