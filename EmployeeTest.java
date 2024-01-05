import java.util.*;
class Employee
{
	private int EmpId;
	private String Empname;
	private String EmpDept;
	public void setEmpId( int EmpId)
	{
		this.EmpId=EmpId;
	}
	public void setEmpname(String Empname)
	{
		this.Empname=Empname;
	}
	public void setEmpDept( String EmpDept)
	{
		this.EmpDept=EmpDept;
	}
	public int getEmpId()
	{
		return this.EmpId;
	}
	public String getEmpname()
	{
		return this.Empname;
		
	}
	public String getEmpDept()
	{
		 return this.EmpDept;
	}
}
	class EmployeeTest
	{
		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			Employee[] ex=new Employee[5];
			for(int i=0;i<5;i++){
				ex[i]=new Employee();
				ex[i].setEmpId(sc.nextInt());
				ex[i].setEmpname(sc.next());
				ex[i].setEmpDept(sc.next());
					}
			System.out.println("details are:\n");
			for(int j=0;j<5;j++)
			{
				System.out.println("id : "+ex[j].getEmpId());
			System.out.println("name : "+ex[j].getEmpname());
			System.out.println("department : "+ex[j].getEmpDept());
			}
		}
	}		