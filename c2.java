class c1
{
	void meth1()
	{
		System.out.println("this is method 1");
	}
	void meth2()
	{
		System.out.println("this is method 2");
	}
	void meth3()
	{
		System.out.println("this is method 3");
	}
	void meth4()
	{
		System.out.println("this is method 4");
	}
	void meth5()
	{
		System.out.println("this is method 5");

	}
}
class c2
{
	public static void main(String args [])
	{
		c1 ref=new c1();
		ref.meth1();
		ref.meth2();
		ref.meth3();
		ref.meth4();
		ref.meth5();
	}
}