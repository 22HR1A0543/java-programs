import java.util.Scanner;
class EvenOdd5
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter A value");
		int a=sc.nextInt();
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