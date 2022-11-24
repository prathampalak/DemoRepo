package day2;
import java.util.*;
public class Problem4 {

	public static void main(String[] args) {
		int area,w,l,p;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length and width of rectangle");
		l=scan.nextInt();
		w=scan.nextInt();
		area=w*l;
		p=2*(w+l);
		System.out.println("area of rectanle="+area);
		System.out.println("perimeter of rectangle"+p);
	}
}
