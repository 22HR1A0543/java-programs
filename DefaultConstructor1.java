class DefaultConstructor1
{
	int id;
	String name;
	DefaultConstructor1(int i,String n)
	{
		id=i;
		name=n;
		}
		DefaultConstructor1()
		{
			
		}
		void display()
		{
			System.out.println(id+" "+name);
	
		}
		public static void main(String[]args){
			DefaultConstructor1 cc=new DefaultConstructor1(8,"chaitu");
			DefaultConstructor1 cc1=new DefaultConstructor1();
			cc1.id=cc.id;
			cc1.name=cc.name;
			cc.display();
			cc1.display();
		}
}