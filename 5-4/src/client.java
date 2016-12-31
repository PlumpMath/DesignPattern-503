
public class client {

	public static void main(String[] args) {
		Class obj = new Class();
		Student student1,student2,student3,student4;
		student1 = new Student("蛇精",26,"女");
		student2 = new Student("妖精",22,"男");
		student3 = new Student("贱人",20,"女");
		student4 = new Student("八婆",18,"女");
		obj.addStudent(student1);
		obj.addStudent(student2);
		obj.addStudent(student3);
		obj.addStudent(student4);
		obj.displayStudents();
	}

}
