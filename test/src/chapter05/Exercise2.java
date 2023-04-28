package chapter05;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int evenSum =0;
		int oddSum=0;
		
		for(int i=1; i<=100; i++) {
			if (i%2==0) {  // i나누기2 했을시 나머지가 0인경우=짝수
				evenSum+=i;
			}else {  // if가 아닌 항목=홀수
				oddSum+=i;
			}

		}
		System.out.println("짝수의 합계는"+evenSum);
		System.out.println("홀수의 합계는"+oddSum);

	}

}
