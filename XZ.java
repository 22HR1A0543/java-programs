import java.util.*;
class XZ
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		boolean cond=true;
		//int a=10,b=1;
		System.out.println(cond);
		System.out.println(a);
		System.out.println(b);
		System.out.println("now condition is"+ !cond);
		System.out.println("!(a<b)="+!(a<b));
		System.out.println("!a>b="+!(a>b));
	}
}