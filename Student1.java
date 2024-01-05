//initialing through method
class Student1
{
int rn;
String name;
void details(int r,String n)
	{
		rn=r;
		name=n;
	}
void display()
{
System.out.println(rn+""+name);
}
}
class Student2{ 
public static void main(String[]args)
{
Student1 s1=new Student1();
Student1 s2=new Student1();
s1.details(43,"chaitu");
s1.display();
s2.details(44,"mahadev");
s2.display();
}

}