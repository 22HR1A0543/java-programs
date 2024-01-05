class Constructor
{
int Empid;
String Empname;
String EmpDepartment;
Constructor(int i,String n,String d)
{
		Empid=i;
		Empname=n;
		EmpDepartment=d;
		System.out.println(Empid+"  "+Empname+""+EmpDepartment);
	}
}
class Constructor1{ 
public static void main(String[]args)
{
Constructor s1=new Constructor(3,"abc","cse");
}
}