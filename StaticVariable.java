class StaticVariable
{


	int rollno;
	String name;
	static String clgeName="MTIEAT";
	StaticVariable(int rollno,String name)
	{
		this.name=name;
		this.rollno=rollno;
	}
	void display(){
		System.out.println(rollno+" "+name+" "+clgeName);
	}
	public static void main(String[]args){
		StaticVariable sv=new StaticVariable(8,"chaitu");
		StaticVariable sv1=new StaticVariable(8,"chaitu");
		
		StaticVariable.clgeName="vani";
		sv.display();
		sv1.display();
	}
}