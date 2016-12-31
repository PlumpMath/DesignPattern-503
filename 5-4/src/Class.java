import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


public class Class {
	private ArrayList<Student> students = new ArrayList<Student>();
	
	public void addStudent(Student student){
		students.add(student);
	}
	
      public void displayStudents(){
		Comparator<Student> comp = new MyComparator();
		Collections.sort(students,comp);
		Iterator<Student> i = students.iterator();
		while(i.hasNext()){
			Student student = (Student)i.next();
			System.out.println("姓名:"+student.getsName()+"  年龄："+student.getsAge());
		}
	}
}
