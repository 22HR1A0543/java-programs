//static nested class
class StaticClass
{
	static int data=30;
	static class StaticClass2
	{
		static void msg()
		{
			System.out.println("this is static class StaticClass2  =  "+data);
		}
	}
		public static void main(String[]args)
		{
			//StaticClass.StaticClass2 sc=new StaticClass.StaticClass2();
			//sc.msg();
			StaticClass.StaticClass2.msg();
		}
	}
	