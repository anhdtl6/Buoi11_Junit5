
public class Student extends Person {

    public Student(long id, String fullName, String address) {
        super(id, fullName, address);
    }

    @Override
    public String toString()
    {
        return  "Id:" + id + ", Họ tên:" + fullName + ", Địa chỉ:" + address;

    }

    @Override
    public void Work() {
        System.out.println("Học");
    }
}
