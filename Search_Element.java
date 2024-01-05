import java.util.*;
class Search_Element
{
public static void main(String[]args)
{
	int n,x,flag=0,i=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size");
	n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter elements");
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
		System.out.println("enter key");
		x=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			if(a[i]==x)
			{
				flag=1;
				break;
			}
		}
		if(flag==1){System.out.println("elent fount at position:"+(i+1));}
		else{System.out.println("element not found");}
	
}
}