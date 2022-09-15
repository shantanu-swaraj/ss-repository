//to reverse a number aalgorithm would be
//1.find reminder of given number 
//2.multiply the variables reverse by 10 and add the reminder into it
//3.divide the umber by 10
//
//1. ways tp reverse the number
//-using while loop
//-using for loop
//-using recursion

package java_number;
//using while loop


/*public class reverseanumber  {
	public static void main(String [] args) {
		int number=100345,reverse=0;
		
		
		
		while(number!=0)
		{ int remainder=number%10;
		reverse=reverse*10+remainder;
		number=number/10;
		}
		System.out.print("the reverse is"+reverse);
	}

}*/

//reverse a number by taking the input

//using recursion
/*
import java.util.*;
import java.util.Scanner;
public class reversenumber{


	public static void reversenumber (int number){
		if(number<10) { 
			System.out.println(number);
		return;
		}
		else {
			System.out.print(number%10);
			reversenumber(number/10);
		}
	}
	public static void main(String args []) {
		System.out.println("enter the number you want to reverse:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.print("the reverse of the given number is:");
		reversenumber(num);
	}
*/

//using for loop
/*
public class reversenumber{
	public static void main(String[] args) {
	int number=6785405,reverse=0;
	for(;number!=0;number=number/10)
		{
		int remainder=number%10;
		
	reverse=reverse*10+remainder;
			}
	System.out.println("the reverse of the given number is :"+reverse);

}
}
*/

//by taking input from use

import java.util.*;  
public class reversenumber
{   
public static void main(String args[])   
{  
System.out.print("Enter the number that you want to reverse: ");  
Scanner sc = new Scanner(System.in);  
int n = sc.nextInt();  
int reverse_number = reverseNumber(n);   
System.out.println("The reverse of the given number is: "+reverse_number);   
}  
//method to reverse a number  
public static int reverseNumber(int number)   
{  
boolean isNoNegative = number < 0 ? true : false;   
if(isNoNegative)  
{  
number = number * -1; //makes the number positive if the given number is negative  
}   
int reverse = 0;   
int lastDigit = 0;   
while (number >= 1)   
{  
lastDigit = number % 10; // gives the last digit of the number  
reverse = reverse * 10 + lastDigit;   
number = number / 10; // removes the last digit of the number  
}   
//makes the number negative   
return isNoNegative == true? reverse*-1 : reverse;   
}  
}  