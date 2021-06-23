
import java.util.ArrayList;

public class Main {
    public static void main (String[]args)
    {
        System.out.println("--Học sinh");
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student(01, "Nguyễn Văn Cường", "Hà Nội");
        Student s2 = new Student(02, "Nguyễn Thị Hoa", "Hà Nội");
        Student s3 = new Student(03, "Nguyễn Thị Hoa Hồng", "Hà Nam");
        PersonAction s4 = new Student(04, "Nguyễn Thị Hoa Hồng", "Hà Nam");

        students.add(s1);
        students.add(s2);
        students.add(s3);
        s4.Work();
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("--Giáo viên");
        ArrayList<Teacher> teachers = new ArrayList<>();
        Teacher t1= new Teacher(001,"Phạm Hồng Hà","Hà Nội", "10");
        Teacher t2= new Teacher(002,"Nguyễn Minh Hà","Hà Nội", "11");
        teachers.add(t1);
        teachers.add(t2);
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
        System.out.println("--Lớp");
        Class lop10 = new Class(1010, "10A1", "Phạm Hồng Hà");
        Class lop11 = new Class(1011, "11A1", "Nguyễn Minh Hà");
        Class lop12 = new Class(1012, "12A1", "Nguyễn Thị Minh Hoa");
        System.out.println(lop10);
        System.out.println(lop11);
        System.out.println(lop12);

    }
}
