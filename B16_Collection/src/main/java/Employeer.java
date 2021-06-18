public class Employeer {
    int id;
    String name;
    int old;
    String address;
    String phone;

    public Employeer(int id, String name, int old, String address, String phone) {
        this.id = id;
        this.name = name;
        this.old = old;
        this.address = address;
        this.phone = phone;
    }
    @Override
    public String toString() {
        return id+"-"+name+"-"+old+" tuổi -"+address+"-"+phone;
    }
}
