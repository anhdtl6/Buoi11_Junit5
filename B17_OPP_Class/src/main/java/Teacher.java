
public class Teacher extends Person {

    private String lop;
    public Teacher(long id, String fullName, String address, String lop) {
        super(id, fullName, address);
        this.lop=lop;
    }
    @Override
    public String toString()
    {
        return  "Id:" + id + ", Họ tên:" + fullName + ", Địa chỉ:" + address+", Lớp:"+lop;

    }

    @Override
    public void Work() {
        System.out.println("Dạy học");
    }
}
