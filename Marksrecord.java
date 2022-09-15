//q.3> accept 10 student marks in arrau......
//

import java.util.*;

public class Marksrecord {
	public static void main(String[] args) {
	Scanner scanner ;
	scanner=new Scanner(System.in);
	int arr[]=new int[10];
	
	
	System.out.println("enter marks of 10 student :");
	for(int i=0;i<10;i++) {
		arr[i]=scanner.nextInt();
		
	}
	for(int i=0;i<10;i++) {
		for(int j=i+1;j<10;j++) {
			int temp=0;
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
	}//sorting end here
	{
		System.out.println("the Remarks are :");
	}
	for(int i=0;i<10;i++) {
		if(arr[i]<40) { System.out.println(arr[i]+"FAIL");
	}
		else if(arr[i]>=40 && arr[i]<=50) { System.out.println(arr[i]+"pass");
		}
		else if(arr[i]>=51 && arr[i]<=75) {
			System.out.println(arr[i]+"MERIT");
		} else {
			System.out.println(arr[i]+"DISTINCTION");
		}
		
		}
	
	}
}
