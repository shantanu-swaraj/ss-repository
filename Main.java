//q.1 > program to find largest of 3 numbers

import java.util.*;

public class Main{
	public static void main(String[] args) {
		int a,b,c,max;
		Scanner scanner;
		scanner=new Scanner(System.in);
		System.out.println("enter three number:");
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		
		//looping
		if(a>b) {
			if(a>c) {
				System.out.println("wifuuu a is greatest");
				max=a;
			}
			else
				max=c;
		}
		else {
			if(b>c)
				max=b;
			else
		max=c;
 	}
	System.out.println("largest number:"+max);
			
		
	}
}


