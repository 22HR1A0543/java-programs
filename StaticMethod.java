//use of static method
class StaticMethod
{
	int rollno;
	String name;
	static String clge="mtieat";
	static void change(){
		clge="mits";
	}
	StaticMethod(int rollno,String name)
	{
		this.name=name;
		this.rollno=rollno;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+clge);
	}
	public static void main(String[]args)
	{
		StaticMethod sm1= new StaticMethod(66,"chaitu6");
		sm1.display();
		StaticMethod sm2= new StaticMethod(67,"chaitu7");
		StaticMethod.change();
		StaticMethod sm3= new StaticMethod(68,"chaitu8");
		sm3.display();
		
		
		sm2.display();
		
	}
 
}