package chapter05;

public class IfEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 80;
		String grade ="";
		
		System.out.println("학점부여 시작");
		if (score>=95){
			grade="A+";
		} else if (score>=90) {
			grade="A";
		} else if (score>=85) {
			grade="B+";
		} else if (score>=80) {
			grade="B";
		} else if (score>=75) {
			grade="C";
		} else if (score>=60) {
			grade="D";
		} else {
			grade="F";
		}
		
		System.out.println("당신의 학점은 "+grade+"입니다.");
		System.out.println("학점부여 끝");
	}

}
