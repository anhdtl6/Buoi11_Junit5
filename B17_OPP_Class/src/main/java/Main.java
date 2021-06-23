
import java.util.ArrayList;

public class Main {
    public static void main (String[]args)
    {
        System.out.println("Lớp học");
        ArrayList<Student> students = new ArrayList<>();
        Student s1= new Student(01, "Nguyễn Văn Cường", "Hà Nội");
        Student s2= new Student(02, "Nguyễn Thị Hoa", "Hà Nội");
        Student s3= new Student(03, "Nguyễn Thị Hoa Hồng", "Hà Nam");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        for (Student student : students) {
            System.out.println(student);
        }
        Class lop10 = new Class(1010, "10A1", "Phạm Hồng Hà");
        Class lop11 = new Class(1011, "11A1", "Nguyễn Thị Hạnh");
        Class lop12 = new Class(1012, "12A1", "Nguyễn Thị Minh Hoa");
        System.out.println(lop10);
        System.out.println(lop11);
        System.out.println(lop12);
    }
}
