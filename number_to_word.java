package java_number;

//example no.1
public class number_to_word {
	//defining static method that converts number-> words.
	static void number_to_word(char num[]) {
		//determining the number of digits int the given number
		int len =num.length;
		if(len==0)//checking if number has number or not 
		{
			//if empty
			System.out.println("the String is empty");
			return;}
		if(len>4) { //fixing max strength of length to be 4
			System.out.println("\n the given number has more than 44 digits");
			return;
		}
		//String type array for one-digit number
		String[] onedigit = new String[] {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String[] twodigits = new String[] {" ","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String[] multipleoftens = new String[] {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
		String[] poweroftens = new String[] {"hundred","thousand"};
		
		System.out.println(String.valueOf(num)+"");
		//now checking wether length of the string is one or not
		if(len==1) { System.out.println(onedigit[num[0]-'0']);
		return;
		}int x=0;
		//this will executes untill num doesn't becomr npt'\0'
		while(x<num.length) {
			if(len>=3) {
				if(num[x]-'0'!=0) {
					System.out.println(onedigit[num[x]-'0']+"");
					System.out.println(poweroftens[len-3]+"");
				}
				--len;
			}
			if(num[x]-'0'==1) {
				int sum=num[x]-'0'+num[x+1]-'0' + num[x+1] -'0';
				System.out.println(twodigits[sum]);
				return;
			}else if (num[x]-'0'==2&&num[x+1]-'0'==0) {
				System.out.println("twenty"); return;
			}else {
				int i=(num[x]-'0');
				if(i>0)
					System.out.println(onedigit[num[x] - '0']);  	
			}
		}
		//increments the variable i by 1  
		++x;  
	}



	
//main() method  
	public static void main(String args[])  
	{  
	//calling the user-defined method and that invokes another predefined method toCharArray()  
	//the method toCharArray() converts the given number into character array  
	number_to_word("1111".toCharArray());  
	number_to_word("673".toCharArray());  
	number_to_word("85".toCharArray());  
	number_to_word("5".toCharArray());  
	number_to_word("0".toCharArray());  
	number_to_word("20".toCharArray());  
	number_to_word("1000".toCharArray());  
	number_to_word("12345".toCharArray());  
	//passing empty string   
	number_to_word("".toCharArray());  
		
	}
}
