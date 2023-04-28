package chapter04;

public class OpEx6_1 {

	public static void main(String[] args) {
		
		// << 연산
		System.out.println(3<<2);  // 12 (3의 2진수는 11, 11을 왼쪽으로 2만큼 이동하면 1100이 된다. 1100의 10진수는 12
		System.out.println("3의 이진수:"+Integer.toBinaryString(3));  // 11
		System.out.println("12의 이진수:"+Integer.toBinaryString(12));  // 1100
		
		// >> 연산
		System.out.println(8>>2);  // 2 (8의 2진수는 1000, 1000을 오른쪽으로 2만큼 이동하면 10이 된다. 10의 10진수는 2)
		System.out.println("8의 이진수:"+Integer.toBinaryString(8));  // 1000
		System.out.println("2의 이진수:"+Integer.toBinaryString(2));  // 10
		
		// >>> 연산
		System.out.println(-8>>>3);  // 536870911
		System.out.println("-8의 이진수:"+Integer.toBinaryString(-8));  // 11111111111111111111111111111000
		System.out.println("-8>>>3:"+Integer.toBinaryString(-8>>>3));  // 11111111111111111111111111111


	}

}
