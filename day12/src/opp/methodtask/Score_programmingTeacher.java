package opp.methodtask;

public class Score_programmingTeacher {
	public static void main(String[] args) {
		ScoreTeacher2 a = new ScoreTeacher2();
		ScoreTeacher2 b = new ScoreTeacher2();
		ScoreTeacher2 c = new ScoreTeacher2();
		
		a.setting("통키",80,85,82);
		b.setting("슛돌이",55, 90, 85);
		c.setting("피카츄",77,65,23);
		
		
		a.korean = 100;
		
		a.output();
		b.output();
		c.output();

		
		
	}

}
