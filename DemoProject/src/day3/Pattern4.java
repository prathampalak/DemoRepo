package day3;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		int num ;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		num=scan.nextInt();
		for(int i=5;i>=1;i--)
		{
			System.out.print("\n");

			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
		}

	}

}
