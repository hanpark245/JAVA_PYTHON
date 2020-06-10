
public class Operator {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		char ca='A';
		char cz='Z';
		
		int result;
		/*
		 * 1.산술연산
		 */
		result = a+b;
		System.out.println("a+b="+result);
		result = a-b;
		System.out.println("a-b="+result);
		result = a*b;
		System.out.println("a*b="+result);
		result = a/b;//???
		System.out.println("a/b="+result);
		result= a%b;
		System.out.println("a%b="+result);
		int year=2020;
		result = year%4;
		System.out.println("year%4="+result);
		result = year%100;
		System.out.println("year%100="+result);
		result = year%400;
		System.out.println("year%400="+result);
		
		System.out.println("------문자연산------");
		result= ca + 1;
		System.out.println("ca+1 --> "+result);
		char cb = (char)result;
		System.out.println("cb --> "+cb);
		
		
		
		
		
		
		
	}

}
