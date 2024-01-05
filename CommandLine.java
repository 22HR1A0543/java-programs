class CommandLine
{
int a,b;
void add()
{
	System.out.println("addition="+(a+b));
}
void sub()
{
	System.out.println("sub"+(a-b));
}
void mul()
{
	System.out.println("mul"+(a*b));
}
void div()
{
	System.out.println("div"+(a/b));
}
void mod()
{
	System.out.println("mod"+(a%b));
}
public static void main(String[]args)
{
CommandLine cl=new CommandLine();
cl.a=Integer.parseInt(args[0]);
cl.b=Integer.parseInt(args[1]);
cl.add();
cl.sub();
cl.div();
cl.mul();
cl.mod();
}
}