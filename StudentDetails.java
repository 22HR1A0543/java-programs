class StudentDetails{
int rollno;
String name,course;
float fee;
StudentDetails(int rollno,String name,String course){
this.rollno=rollno;
this.name=name;
this.course=course;
}
StudentDetails(int rollno,String name,String course,float fee)
{
this(rollno,name,course);
this.fee=fee;
}
void display(){
System.out.println(rollno+" "+name+" "+course+" "+fee+" ");
}
}
class TestThis
{
	public static void main(String[]args)
	{
	StudentDetails sd1=new StudentDetails(543,"chaitu","fullstack");
	StudentDetails sd2=new StudentDetails(542,"chaitu","fullstack",60f);
	sd1.display();
	sd2.display();
	
	}
	
	
	}