package Day2;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.id=1;
		student1.firstName="G�nnur";
		student1.lastName="Aksoy";
		
		Student student2=new Student();
		student2.id=2;
		student2.firstName="�zge";
		student2.lastName="Aksoy";
		
		
		
		
		Course course1= new Course(1,"C#",100,"Engin Demiro�");
		Course course2 =new Course(2,"Java",35,"Engin Demiro�");
		
		Course [] courses= {course1,course2};
		for(Course course: courses) {
			System.out.println(course.name);
		}
		
		
		Student[] students= {student1,student2};
		for(Student student:students) {
			System.out.println(student.firstName);
		}
		
		CommentManager commentManager= new CommentManager();
		commentManager.add(student1);
		

	}

}
