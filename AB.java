class B
{
	B()
	{
		System.out.println("hello default constructor");
	}
	B(int x)
	{

		this();
		System.out.println(x);
	}
}
class AB
{
	public static void main(String[]args){
		B a=new B(100);
		
		
		
	}
}