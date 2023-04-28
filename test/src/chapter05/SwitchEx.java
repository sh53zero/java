package chapter05;

import java.util.Scanner;

public class SwitchEx {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("점수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		
		int score=scan.nextInt();
		String grade="";
		switch (score/10) {  // score/10을 넣는 이유는 학점 나누기 10해서 정수만으로 grade 판단하기 위해서 
		case 9:
			grade="A";
			break;
		case 8:
			grade="B";
			break;
		case 7:
			grade="C";
			break;
		case 6:
			grade="D";
			break;
		default:
			grade="F";
		
		}
		System.out.println("학점:"+grade);

	}

}
