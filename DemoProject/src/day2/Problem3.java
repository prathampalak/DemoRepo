package day2;
import java.util.*;


public abstract class Problem3 {

	public static void main(String[] args) {
		float area;
		int radius;
		float pi=3.14f;
		System.out.println("enter the radius of circle");
		Scanner scan=new Scanner(System.in);
		radius=scan.nextInt();
		area=pi*(radius*radius);
		System.out.println("area of circle is="+area);
				
	}

}
