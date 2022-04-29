public class Student implements Comparable<Student>{
	public int age;
	public String name;
	
	/* Parameterized Constructor */
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Student s) {
		
		return age > s.age ? 1 : age < s.age ? -1 : 0;
	}
	
	
}