package day3;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		int num ;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		num=scan.nextInt();
		for(int i=1;i<=num;i++)
		{
			System.out.print("\n");
			for(int j=1;j<=num-i;j++)
			{
			System.out.print(" ");
			}

			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
		}
		for(int i=1;i<=num-1;i++)
		{
			System.out.print("\n");
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			
			}
			for(int k=num-i;k>=1;k--)
			{
				System.out.print("* ");
			}
		}
		
	}

}
