package day4;

import java.util.Scanner;

public class Average {
	int num1,num2,num3;
	public void area()
	{
		int avg;
		avg=(num1+num2+num3)/3;
		System.out.println("Average of three number is="+avg);
		
		
	}
	

	public static void main(String[] args) {
		Average obj1=new Average();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the three number");
		obj1.num1=scan.nextInt();
		obj1.num2=scan.nextInt();
		obj1.num3=scan.nextInt();
		obj1.area();
		
		
		
		
	}

}
