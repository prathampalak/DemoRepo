package day3;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		int num ;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		num=scan.nextInt();
		for(int i=1;i<=num;i++)
		{
			System.out.println("\n");

			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
		}
	}

}
