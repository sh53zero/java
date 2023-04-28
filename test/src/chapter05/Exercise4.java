package chapter05;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=5; i++) { // 
			for (int j=1;j<=i;j++) {  // j가 i보다 작거나 클 때 * 이 찍힘
				System.out.print("*"); // 줄바꿈 없이 *가 같은 줄에서 출력됨
			}
			System.out.println(""); // j가 i보다 클때 줄바꿈돼서 i가 올라감
		}

	}

}
