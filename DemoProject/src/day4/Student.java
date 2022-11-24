package day4;

public class Student {
	/*String name;
	int roll_no;
	
	

	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="John";
		s1.roll_no=2;
		System.out.println("Name of student="+s1.name);
		System.out.println("Roll number="+s1.roll_no);
	}*/
	String name;
	String address;
	int phone_no;
	int roll_no;
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		s1.name="Sam";
		s1.address="364 Sunnyvale";
		s1.roll_no=11;
		s1.phone_no=982776;
		s2.name="John";
		s2.address="253 cupertino";
		s2.roll_no=22;
		s2.phone_no=98346;
		System.out.println("Name of first student="+s1.name);
		System.out.println("Address="+s1.address);
		System.out.println("Roll nubber="+s1.roll_no);
		System.out.println("Phone number="+s1.phone_no);
		System.out.println("\nName of Second student="+s2.name);
		System.out.println("Address="+s2.address);
		System.out.println("Roll nubber="+s2.roll_no);
		System.out.println("Phone number="+s2.phone_no);
	}
	
}
