import java.util.Scanner;
class Student
{
	int id;
	String name;
public static void main(String[]args)
	{
		//Scanner sc=new Scanner(System.in);
	//String name;
	//int id;
	//System.out.println("enter a string");
	
	//System.out.println("enter ur id");
	
		Student s1=new Student();
		Student s2=new Student();//creating multiple objects
		s1.name="chaitu";//initializing through reference
		s1.id=543;
		s2.name="shiva";
		s2.id=01;
		System.out.println("name of the student="+s1.name+" "+"student id is="+s1.id);
		System.out.println("name of the student="+s2.name+" "+"student id is="+s2.id);
		//System.out.println();
	}
}