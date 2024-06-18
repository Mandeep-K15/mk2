//We have 5 variables, we want to give the value to those variables & 
//we want to print the value of those variables

package package1;

public class objects_of_class      //class creation
{
	int a,b,c,d,e;
	public objects_of_class(int x1, int x2, int x3, int x4, int x5)   //parameterized constructor
	{
		a=x1;
		b=x2;
		c=x3;
		d=x4;
		e=x5;
	}
	
	public static void main(String[] args)       // main method
	{
		objects_of_class ob=new objects_of_class(10,20,30,40,50);   //object creation
		System.out.println("Value of a is "+ob.a);
		System.out.println("Value of b is"+ob.b);
		System.out.println("Value of c is"+ob.c);
		System.out.println("Value of d is"+ob.d);
		System.out.println("Value of e is"+ob.e);
	}
}
