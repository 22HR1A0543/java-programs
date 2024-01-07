class Employee{
float salary=4000;
}
class Programmer extends Employee
{
	int bonus=50;
public static void main(String[]args){

Programmer p=new Programmer();
System.out.println("Programmer salary="+p.salary);
System.out.println("programmer bonus="+p.bonus);
}
}