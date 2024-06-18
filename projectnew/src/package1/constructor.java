package package1;

public class constructor			//class creation 
{
	public constructor()
	{
		System.out.println("Default Constructor");
	}
	
	public constructor(int a)
	{
		System.out.println("One parameterized Constructor");
	}
	
	public constructor(int a, int b)
	{
		System.out.println("Two parameterizedconstructor");
	}
			//////////////////////////////////////
	
	public static void main(String[] args) 			//main method creation
	{
		constructor ob=new constructor();			//object creation
		constructor ob1=new constructor(5);			//we do not need to do calling in constructor
		constructor ob2=new constructor(1,2);	//infact values are put during object 
														//creation
	}

}
