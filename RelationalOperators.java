import java.util.Scanner;
class RelationalOperators
{
	public static void main(String[]args)
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter first value");
		int n1=sc.nextInt();
		System.out.println("enter second value");
		int n2=sc.nextInt();
		System.out.println("n1>n2 is"+(n1>n2));
		System.out.println("n1<n2 is"+(n1<n2));
		System.out.println("n1>=n2 is"+(n1>=n2));
		System.out.println("n1<=n2 is"+(n1<=n2));
		System.out.println("n1!=n2 is"+(n1!=n2));*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first value");
		int n1=sc.nextInt();
		System.out.println("enter second value");
		int n2=sc.nextInt();
		System.out.println("enter third value");
		int n3=sc.nextInt();
		if((n1>n2)&&(n1>n3))
		{
			System.out.println("first number largest"+n1);
		}
		 if((n2>n1)&&(n2>n3))
		{
			System.out.println("second number largest"+n2);
		}
			else if((n3>n1)&&(n3>n2))
			{
				System.out.println("third number largest"+n3);
			}
		
	}
}