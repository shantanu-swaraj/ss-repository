//q.2>
//program to calculate sum,product,subtraction and division

import java.util.*;

public class Calc {
	public static void main(String[] args) {
		float num1,num2;
		Scanner scanner;
		scanner=new Scanner(System.in);
		System.out.println("enter two number:");
		num1=scanner.nextFloat();
		num2=scanner.nextFloat();
		
		System.out.println("enter operators (+,-,*,/)");
		char op=scanner.next().charAt(0);
		double o=0;
		switch(op) {
		//cases
		case '+':
			o=num1+num2;
			break;
		case '-' :
			o=num1-num2;
			break;
		case '*' :
			o=num1*num2;
			break;
		case '/' :
			o=num1/num2;
			break;
		default :
			System.out.println("wrong input , man !!");
			break;
			
		}
		System.out.println("your answer is: ");
		System.out.println();
		//final result
		System.out.println(num1+" "+ op +" "+ num2 + "=" + o);
	}
}
