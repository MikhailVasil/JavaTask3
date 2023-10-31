package StandartInterface;

public class Program {
    public static void main(String[] args) {
        StudentGroup studentGroup1 = new StudentGroup(1);
        StudentGroup studentGroup2 = new StudentGroup(2);
        Student st1 = new Student(1,"1", "1", "1");
        Student st2 = new Student(2,"2", "2", "2");
        Student st3 = new Student(3,"3", "3", "3");
        Student st4 = new Student(4,"4", "4", "4");
        studentGroup1.addStudent(st1);
        studentGroup1.addStudent(st2);
        studentGroup2.addStudent(st3);
        studentGroup2.addStudent(st4);
        System.out.println(studentGroup1.toString());


    }
}
