

//without using recursion
/*
 package basic_java;

public class fibbonocci_series {
	public static void main(String args[]) {
		int n1=0,n2=1,n3,i,count=20;
		System.out.println(n1 + "  " +n2); 
		for(i=2;i<count;i++)//=++i
			{
			n3=n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
			
		}
	}
}
ion*/

//with recursion
package basic_java;
public class fibbonocci_series {
	static int n1=0,n2=1,n3=0;
	static void printfibonacci(int count) {
		if(count>0) {
			n3=n1+n2;
			n1=n2;n2=n3;
			System.out.print(" "+n3);
			printfibonacci(count-1); // not able to understand this line
			
			
		}
	}
	public static void main(String args[]) {
		int count=20;
		System.out.println(n1+"  "+n2);
		printfibonacci(count-2);
		
		
	}
}
