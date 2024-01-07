//calling a function within its definition is recursive function
import java.util.*;
class Demo{
public double calculateFactorial(int n)
{
if(n==0)
return 1;
else
return n*calculateFactorial(n-1);
}}
class Test2{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
Demo ob=new Demo();
System.out.println(ob.calculateFactorial(p));
}}