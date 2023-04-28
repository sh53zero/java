package chapter06;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] lotto= new int[6];
		int idx=0;
		while (true) {  // 무한 반복
			int number=(int)(Math.random()*45)+1; // Math.random <- 숫자 뽑아내는 함수 (0부터 1사이의 숫자를 랜덤으로 뽑음) / 0이 나왔을 경우 +1을해서 1이 나오고, 0.99*45=44.**라서 +1해서 45로 만듦
			
			boolean insert=true;
			for (int i=0; i<=idx; i++) {
				if (lotto[i]==number){
					insert=false;
					break;
				}
			}
			
			if (insert==true) {
				lotto[idx]=number;
				idx++;
			}
			
			if (idx==6) break;
		}
		
		for (int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}

	}

}
