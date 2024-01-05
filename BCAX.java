class StudentX
{
	private String clgename;
	private String clgeaddress;
	private int aystart;
	private int ayend;
	private int id;
	private String name;
	private String department;
public void setClgeName(String clgename)
{
	this.clgename=clgename;
	}
	public String getClgeName()
	{
		return clgename;
	}
	public void setClgeAddress(String clgeaddress)
{
	this.clgeaddress=clgeaddress;
	}
	public String getClgeAddress()
	{
		return clgeaddress;
	}
	public void setAyStart(int aystart)
{
this.aystart=aystart;
}
public int getAyStart()
{
return aystart;
}

public void setAyEnd(int ayend)
{
this.ayend=ayend;
}
public int getAyEnd()
{
return ayend;
}
public void setId(int id)
{
this.id=id;
}
public int getId()
{
return id;
}
public void setName(String name)
{
	this.name=name;
}
public String getName()
{
	return name;
}

public void setDepartment(String department)
{
	this.department=department;
}
public String getDepartment()
{
	return department;
}
}
class BCAX
{
public static void main(String [] args)
{
StudentX obj=new StudentX();
obj.setClgeName("MTIET");
obj.setClgeAddress("melumoi(v),(p)-palamaner");
obj.setAyStart(2022);
obj.setAyEnd(2026);
obj.setName("chaithanya");
obj.setId(27838);



obj.setDepartment("cse");
System.out.println("college name:"+obj.getClgeName());
System.out.println( "college address:"+obj.getClgeAddress());
System.out.println( "acedemic year start:"+obj.getAyStart());
System.out.println( "acedemic year end:"+obj.getAyEnd());
System.out.println( "Department:"+obj.getDepartment());
System.out.println("name:"+obj.getName());
System.out.println("id:"+obj.getId());
}
 }
