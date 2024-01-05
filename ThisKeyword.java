class ThisKeyword//to refer current class instance variable
{
	int id;
	String name;
	int rollNo;
	ThisKeyword(int id,String name,int rollNo)
	{
		this.id=id;
		this.name=name;
		this. rollNo=rollNo;
		}
		
		void display()
		{
			System.out.println(id+" "+name+" "+rollNo);
	
		}
		public static void main(String[]args){
			ThisKeyword cc=new ThisKeyword(8,"chaitu",543);			
			cc.display();
		
		}
}