import java.util.*;
class C
{
	public static void main(String[]args)
	{
		/*int i=50;
		while(++i<=100)
		{
		System.out.print(i+",");
		i++;	
		}*/
//1+2+3+....+20 printing
int i=0;
int sum=0;
while(i<=100)
{

sum +=i;
System.out.print(i+"+");
i=i+5;
}
System.out.print("\b"+"="+sum);	
}
}