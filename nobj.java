class A
{
public static void meth1()
{
	System.out.println("27 december,method1");
}
public static void meth2()
{
	System.out.println("27 december,method2");
}
}
class nobj
{
	public static void main(String[]args)
	{
		//A obj=new A();
		A.meth1();
		A.meth2();
	}
}
