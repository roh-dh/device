package opp.methodtask;

public class Score_programming {
public static void main(String[] args) {
	
	Score s1 = new Score();
	Score s2 = new Score();
	Score s3 = new Score();
	Score s4 = new Score();
	Score s5 = new Score();
	
	s1.setting("통키", 80, 85, 82);
	s2.setting("슛돌이", 55, 90, 85);
	s3.setting("피카츄", 77, 65, 23);
	
	
	s1.total();
	s2.total();
	s3.total();
	
	s1.avg();
	s2.avg();
	s3.avg();
	
	s1.output();
	s2.output();
	s3.output();
	
}

}

