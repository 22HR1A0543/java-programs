class C
{
public void disp()
{
System.out.println("method of c");
}
}
class A extends C
{
public void disp()
{
System.out.println("method of a");
}
}
class B extends C
{
public void disp()
{
System.out.println("method of b");
}
}
class D extends C
{
public void disp()
{
System.out.println("method of d");
}
public static void main(String[]args)
{
D o=new D();
o.disp();
}
}