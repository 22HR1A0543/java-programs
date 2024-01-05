class CommandLine
{
public static void main(String[]chaitu)
{
int a=Integer.parseInt(chaitu[0]);
int b=Integer.parseInt(chaitu[1]);
//int c=Integer.parseInt(chaitu[2]);
//System.out.println(a+b);
CommandLine cl=new CommandLine();
cl.add();
cl.sub();
cl.div();
cl.mul();
cl.mod();
}
void add()
{
	System.out.println(a+b);
}
void sub()
{
	System.out.println(a-b);
}
void mul()
{
	System.out.println(a*b);
}
void div()
{
	System.out.println(a/b);
}
void mod()
{
	System.out.println(a%b);
}
}