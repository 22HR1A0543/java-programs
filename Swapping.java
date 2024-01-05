import java.util.*;
class Swapping{
	public static void main (String[]args){
		Scanner sc=new Scanner(System.in);
		int a,b,temp;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("before swaping"+a+"  "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swaping "+a+"  "+b);
		
	}
}