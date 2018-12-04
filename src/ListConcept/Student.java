package ListConcept;

public class Student {
    
	String Name;
	int Age;
	int standard;
	
	public Student (String x, int y, int z)
	{
		this.Name = x;
		this.Age = y;
		this.standard=z;
		
	}
	
	public void PrintDetails (Student dtl)
	{
		System.out.println("Name of student is"+ dtl.Name);
		System.out.println("Age of student is "+ dtl.Age);
		System.out.println("Standard of student is "+ dtl.standard);
		//modification text
		
	}
	
	
}
