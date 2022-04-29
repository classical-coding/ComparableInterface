import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{
	
	public static void main(String args[]){
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(10,"Agnibha"));
		studentList.add(new Student(16,"Monami"));
		studentList.add(new Student(15,"Sriraj"));
		studentList.add(new Student(17,"Swapnil"));
		studentList.add(new Student(19,"Ritesh"));
		studentList.add(new Student(7,"Ramratan"));
		studentList.add(new Student(14,"Mritsha"));
		studentList.add(new Student(12,"Subhajit"));
		studentList.add(new Student(15,"Saheli"));
		
		/* Original List */
		System.out.println("---------------Original List:---------------");
		studentList.forEach(s->{
			System.out.println("Name: "+s.name+", Age: "+s.age);
		});
		
		/* Sorting using Comparable Interface (in ascending order of age) */
		Collections.sort(studentList);
		
		System.out.println("---------------Sorted List in ascending order of age:---------------");
		studentList.forEach(s->{
			System.out.println("Name: "+s.name+", Age: "+s.age);
		});
	}
}