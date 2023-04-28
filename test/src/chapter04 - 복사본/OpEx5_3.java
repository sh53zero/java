package chapter04;

public class OpEx5_3 {

	public static void main(String[] args) {
		
		int a= 10;
		int b= 0;
		
		// & 연산
		System.out.println(b>0 & (a/b>0));
		
		// b값이 0이라서 연산 오류
		// &&라면 앞 연산만 확인하기 때문에 false 로 출력됨


	}

}
