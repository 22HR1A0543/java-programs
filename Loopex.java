import java.util.*;
class AccessModifierArrayEx
{
	private int id;
	private String name;
	public void setId( int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getId()
	{
		return this.id;
	}
	public String getName()
	{
		return this.name;
		
	}
}
	class Loopex
	{
		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			AccessModifierArrayEx[] ex=new AccessModifierArrayEx[3];
			for(int i=0;i<3;i++){
				ex[i]=new AccessModifierArrayEx();
				ex[i].setId(sc.nextInt());
				ex[i].setName(sc.next());
					}
			System.out.println("details are:\n");
			for(int j=0;j<3;j++)
			{
				System.out.println("id : "+ex[j].getId());
			System.out.println("name : "+ex[j].getName());
			}
			
			
			/*ex[0]=new AccessModifierArrayEx();
			ex[0].setId(27838);
			ex[0].setName("chaitu");
			System.out.println("id : "+ex[0].getId());
			System.out.println("name : "+ex[0].getName());
			//AccessModifierArrayEx ex1=new AccessModifierArrayEx();
			ex[1]=new AccessModifierArrayEx();
			ex[1].setId(27839);
			ex[1].setName("balaji");
			System.out.println("id : "+ex[1].getId());
			System.out.println("name : "+ex[1].getName());
			//AccessModifierArrayEx ex2=new AccessModifierEx();
			ex[2]=new AccessModifierArrayEx();
			ex[2].setId(27830);
			ex[2].setName("sai");
			System.out.println("id : "+ex[2].getId());
			System.out.println("name : "+ex[2].getName());*/
		}
	}

