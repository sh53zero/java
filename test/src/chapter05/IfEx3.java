package chapter05;

public class IfEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int math= 90;
		int eng= 90;
		
		if (math>=60) {
			if (eng>=60) {
				System.out.println("통과");
			} else {
				System.out.println("탈락2");
			}
		} else {
			System.out.println("탈락");
		}

	}

}
