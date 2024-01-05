//java program to illustrate the use of static variable which is shared with all objects
class Counter1
{
	//without static keyword
	/*int count=0;
	 Counter1(){
		 count++;
		 System.out.println(count);
	 }
	 public static void main(String[]args)
	 {
		 Counter1 c1=new Counter1();
		 Counter1 c2=new Counter1();
		 Counter1 c3=new Counter1();
		 
	 }*/
	 
	 
	 //with static keyword
	static int count=0;
	 Counter1(){
		 count++;
		 System.out.println(count);
	 }
	 public static void main(String[]args)
	 {
		 Counter1 c1=new Counter1();
		 Counter1 c2=new Counter1();
		 Counter1 c3=new Counter1();
		 
	 }
}