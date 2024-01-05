import java.util.*;
class DoubleDivCast
{
public static double div(int a,int b)
{
	 double c=(double)a/(double)b;//type casting
	 return c;

}
public static int add(int a,int b)
{
	 int c=a+b;
	 return c;

}
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a value");
	int a=sc.nextInt();
	System.out.println("enter b value");
	int b=sc.nextInt();
	//System.out.println(a+"+"+b+"="+add(a,b));
	//System.out.println(a+"/"+b+"="+div(a,b));
	DoubleDiv.add(a,b);
	System.out.println(a+b);
	DoubleDiv.div(a,b);
	System.out.println(a/b);
}

}