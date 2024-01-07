//calling a function within its definition 
import java.util.*;
class Demo
{
	public long calculateFactorial(int n)
	{
		long res=1;
		if(n==0)
			return 1;
		else
		{
			for(int i=1;i<=n;i++)
			res=res*i;
		}
		return res;
	}
}
class Test3
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		Demo ob=new Demo();
		System.out.println(ob.calculateFactorial(p));
	}
}