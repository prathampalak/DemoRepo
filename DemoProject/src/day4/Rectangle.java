package day4;

public class Rectangle {
		int length;
		int width;
		public  Rectangle(int l,int w)
		{
		length=l;
		width=w;
		}
		public int  area()
		{
		return length*width;
		}
		
	public static void main(String[] args) 
	{
	Rectangle r1=new Rectangle(4,5);
	Rectangle r2=new Rectangle(5,8);
	int x=r1.area();
	int y=r2.area();
	System.out.println("Area of Rectangle1="+x);
	System.out.println("Area of Rectangle2 ="+y);
	
		
		
	}

}
