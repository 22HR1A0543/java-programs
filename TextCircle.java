class Circle
{
 int radius;
 
 void area(int r)
 {
	radius=r;
	
 }
 void calculate()
 {
	System.out.println("area of circle is="+3.14f*radius*radius);
 }
 void perimeter()
 {
	 System.out.println("perimeter of circle is="+2*3.14*radius);
 }
}
class TestCircle
{
public static void main(String []args)
{
Circle r1=new Circle();
r1.area(5);
r1.calculate();
r1.perimeter();
}
}