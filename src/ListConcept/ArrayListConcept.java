package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(10);
		ar.add(20);
		ar.add(30);
		System.out.println(ar.size());
		ar.add(40);
		ar.add(50);
		System.out.println(ar.size());
		ar.get(4);
		
		for (int i = 0; i < ar.size(); i++) {
			
			System.out.println(ar.get(i));
			
			ArrayList<Integer> ar1 = new ArrayList<Integer>();	
			ar1.add(100);
			
			ArrayList<String> ar2 = new ArrayList<String>();	
			ar2.add("Test");
			
			ArrayList<E> ar3 = new ArrayList<E>();	// use 'E' if not sure what data type to use
			ar1.add(100);
			
			Student st1 =new Student("Deepak",23,12);
			Student st2 =new Student("TOM",22,10);
			Student st3 =new Student("Peter",21,9);
			
			ArrayList<Student> ar4 = new ArrayList<Student>();	
			ar4.add(st1);
			ar4.add(st2);
			ar4.add(st3);
			
			// Iterator example
			
			Iterator<Student> it= ar4.iterator(); 
			while(it.hasNext()) // Cannot use FOR loope because it contains objects
			{
				Student stud = it.next();
				System.out.println(stud.Name);
				System.out.println(stud.Age);
				System.out.println(stud.standard);
				
			}
		}
	}

}



//Array List is Dynamic Array- Changing length
//It can contain duplicate values
//Insert value in order i.e. It maintain insertion order
//It is not Synchronized : slow 
//It allows you random access to fetch any element. Because value is saved on index. 
//Uses For Loop & Iterator;
// We can store 'user defined objects'.