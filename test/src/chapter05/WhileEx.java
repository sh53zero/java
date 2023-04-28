package chapter05;

public class WhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		int i=1;
		
		while (i<=100) {
			sum+=i;
			i++;  // 홀수 합: i=i+2로 수정, 짝수 합: i=2, i=i+2로 수정
		}
		
		System.out.println("합계:"+sum);

	}

}
