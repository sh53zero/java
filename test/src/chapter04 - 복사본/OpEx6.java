package chapter04;

public class OpEx6 {

	public static void main(String[] args) {
		
		System.out.println("2:"+Integer.toBinaryString(2));  // 10 / 10진수 2를 2진수로 변환
		System.out.println("3:"+Integer.toBinaryString(3));  // 11 / 10진수 3을 2진수로 변환
	
		// 비트 논리연산
		System.out.println("2&3:"+(2&3));  // 2
		System.out.println("2|3:"+(2|3));  // 3
		System.out.println("2^3:"+(2^3));  // 1
		System.out.println("~3:"+~3);  //-4
		
		// 첫자리는 부호를 나타내는 비트를 포함하여 모든 비트를 반대로 변환
		System.out.println("~3을 이진수로:"+Integer.toBinaryString(~3));  //~3을 이진수로:11111111111111111111111111111100

		//~3의 2진수값의 길이
		// 첫자리는 부호를 나타내는 비트 나머지 31자리로 정수자료형을 메모리에 저장
		System.out.println(Integer.toBinaryString(~3).length());  // 32
		System.out.println(Integer.MAX_VALUE);  // 정수 자료형의 최대값 (2의 31승 -1) / 2147483647
		System.out.println(Integer.parseInt("1111111111111111111111111111100",2)
				-Integer.MAX_VALUE-1);  // 31자리여야 함
		
	}

}
