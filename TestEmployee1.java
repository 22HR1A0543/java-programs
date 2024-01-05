class Employee1
{
int Empid;
String Empname;
String EmpDepartment;
void details(int i,String n,String d)
	{
		Empid=i;
		Empname=n;
		EmpDepartment=d;
	}
void display()
{
System.out.println(Empid+"  "+Empname+""+EmpDepartment);
}
}
class TestEmployee1{ 
public static void main(String[]args)
{
Employee1 s1=new Employee1();
Employee1 s2=new Employee1();
s1.details(27838,"k.chaithanya","CSE");
s1.display();
s2.details(27850,"K.Chaitu","DS");
s2.display();
}

}