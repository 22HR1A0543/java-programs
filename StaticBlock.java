class StaticBlock
{
static{
System.out.println("static block invoked");}
static{
	System.out.println("static block invoked1");
	System.exit(0);
}
public static void main(String[]args)
{
System.out.println("main method");}
}