import java.util.Scanner;
class EvenOdd
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter A value");
		double a=sc.nextDouble();
		if(a%2==0)
		{
			System.out.println("EVEN\n");
			System.out.println(a+"is EVEN\n");
		}
		else{
			System.out.println(" ODD\n ");
			System.out.println(a+"is ODD\n");
		}
	}
}