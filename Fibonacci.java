import java.util.*;
class Fibonacci
{
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
int a=1;
int b=1;

System.out.println(a+"\n"+b);
for(int i=2;i<n;i++)
{
int c=a+b;
a=b;
b=c;
System.out.println(c);
}

}}