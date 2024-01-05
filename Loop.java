import java.util.Scanner;
class Loop
{
	
	public static int add(int a,int b)
	{
		return a+b;
	}
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	int a;
	int b;
	System.out.println("enter a value");
	a=sc.nextInt();
	System.out.println("enter b value");
	b=sc.nextInt();
Loop.add(a,b);
System.out.println("value of a="+a+"  "+"value of b="+b+"  "+"sum of a,b="+(a+b));

for(int i=1;i<11;i++)
{
System.out.println(a+"*"+i+"="+(a*i));
}

}
}