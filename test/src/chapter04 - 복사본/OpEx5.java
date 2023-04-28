package chapter04;

public class OpEx5 {

	public static void main(String[] args) {
		
		int a= 10;
		int b= 5;
		
		//AND 연산 / 둘 다 true
		System.out.println(a>b && a==10);  //true
		System.out.println(a>b && a==b);  //false
		
		//OR 연산 / 둘 중 하나이상 true
		System.out.println(a>b || a==b);  //true
		System.out.println(a<b || a==b);  //false
		
		//XOR 연산 / 한 항목만 true
		System.out.println(a>b ^ a==10);  //false
		System.out.println(a>b ^ a==b);  //true
		
		//NOT 연산 / 반대 값
		System.out.println(!(a>b));  //false
		System.out.println(!(a<b));  //true


	}

}
