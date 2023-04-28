package chapter04;

public class OpEx3 {

	public static void main(String[] args) {
		
		int a =10;
		int b =++a;
		
		System.out.println("a:"+a);  //11
		System.out.println("전위연산 결과:"+b);  //11
		
		// 전위연산은 대입(변수애 값을 넣는 것)보다 먼저 되어서, b는 a값보다 먼저 +1을 연산하고 a값인 10을 더해서 b는11, a도 1+10이 되어서 11
		
		
		int x=10;
		int y=x++;
		
		System.out.println("후위연산 결과:"+y);  //10
		System.out.println("x:"+x);  //11
		
		// 후위연산은 대입(변수에 값을 넣는 것)보다 나중에 되어서, y는 x=10 값이 y에 먼저 들어가서 10이고 x는 10+1이되어서 11
		
		
		int c=10;
		c++;
		System.out.println("c++:"+c);  //11  
		int d=10;
		d+=1;
		System.out.println("d+=1:"+d);  //11  		
		int e=10;
		e=e+1;
		System.out.println("e=e+1:"+e);  //11

	}

}
