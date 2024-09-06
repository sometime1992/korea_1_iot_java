package chapter05;

class BaseballPlayer {
	String name;
	double battingAverage;
	int homeRuns;
	// 인스턴스 변수
	// 선수 이름(name - 문자열)
	// 타율(battingAverage - 실수)
	// 홈런 수(homeRuns - 정수)
	
	// 정적(클래스) 변수
	static int playerCount;
	
	// : 생성된 선수의 총 인원(playerCount - 정수)
	BaseballPlayer(String name, double battingaverage, int homeRuns){
		this.name = name;
		this.battingAverage = battingaverage;
		this.homeRuns = homeRuns;
		playerCount++;
	}
	// >> 모든 인스턴스에서 공유
	
	// 생성자 >> 인스턴스 변수 초기화 & 정적 변수 후위 증가(변수명++)
	
	// 인스턴스 메서드
	// : 선수와 타율과 홈런 수를 업데이트하는 메서드
	// >> 매개변수로 newBattingAverage, newHHomeRuns를 받아
	//	  기존의 인스턴스 변수에 재할당
	void updatesStatus(double newBattingAverage, int newHomeRuns) {
		// 인스턴스 변수 = 매개변수;
		battingAverage = newBattingAverage;
		homeRuns = newHomeRuns;
	}
}

public class MethodPractice {
	public static void main(String[] args) {
		// 인스턴스 생성
		BaseballPlayer player1 = new BaseballPlayer("홍동현", 0.325, 16);
		BaseballPlayer player2 = new BaseballPlayer("최윤선", 0.293, 7);
		BaseballPlayer player3 = new BaseballPlayer("성찬영", 0.301, 11);
		BaseballPlayer player4 = new BaseballPlayer("박영준", 0.274, 3);
		
		System.out.println("총 생성된 선수의 수: " + BaseballPlayer.playerCount);
		
	}
}
