				/*Find the index of an array element*/

package Day5;

import java.util.Scanner;

public class Pro3 {

	public static void main(String[] args) {
		int[] a=new int[10];
		int ans=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the element in array");
		for(int i=0;i<10;i++)
		{
			a[i]=scan.nextInt();
			
		}
		System.out.println("enter the element whose index you want to know");
		int ele=scan.nextInt();
		for(int j=0;j<10;j++)
		{
			if(ele==a[j])
			{
				System.out.println("index of number of "+ele+" is "+j);
				ans=1;
				break;
			}
		}
		if (ans==0)
			System.out.println("element not found");
	}

}
