class Rectangle
{
 int length;
 int width;
 void area(int l,int w)
 {
	 
	length=l;
	width=w;
 }
 void calculate()
 {
	System.out.println(length*width);
 }
}
class TestRect
{
public static void main(String []args)
{
Rectangle r1=new Rectangle();
r1.area(5,8);
r1.calculate();
}
}