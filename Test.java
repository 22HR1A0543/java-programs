import java.util.*;
class Demo{
public void display()//no arguments no return value function
{
	System.out.println("no arguments no return value function+");
System.out.println("+");
System.out.println("-");
System.out.println("*");
System.out.println("/");
}
public void add(int a,int b)//with arguments no return value function
{
	System.out.println("with arguments no return value function");
	int c=a+b;
	System.out.println(c);
}
public int sub(int a,int b)//with arguments with return value function
{
	System.out.println("with arguments with return value function");
	int c=a-b;
	return c;
}
public int mul()//no arguments with return value
{
	System.out.println("no arguments with return value function");
	Scanner sc=new Scanner(System.in);
	int temp=sc.nextInt();
	return temp;
}
}
class Test{
public static void main(String[]args)
{
Demo d=new Demo();
d.display();
Scanner sc=new Scanner(System.in);
//no arguments with return value
int n1=d.mul();
int n2=d.mul();


//int n1=sc.nextInt();
//int n2=sc.nextInt();
d.add(n1,n2);
int sub=d.sub(n1,n2);
System.out.println("subtraction="+n1+"-"+n2+"="+sub);
//int mul=d.mul();
//System.out.println("multiplication="+n1+"*"+n2+"="+mul);
}}