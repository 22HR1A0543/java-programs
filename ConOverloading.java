class ConOverloading
{ 
	String name;
	int id;
	int age;
	ConOverloading(String n,int i){
		name=n;
		id=i;
		
	}
	ConOverloading(int i,int a,String n){
		id=i;
		age=a;
		name=n;
	}
	void display(){
		System.out.println(id+" "+" "+name+" "+age);
		
	}
	public static void main(String[]args){
		ConOverloading co=new ConOverloading(27838,19,"chaitu");
		ConOverloading co1=new ConOverloading("chaitu",27838);
		co.display();
		co1.display();
	}
}