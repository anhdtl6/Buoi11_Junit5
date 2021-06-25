import java.time.LocalDate;

public class Person implements PersonAction {
    long id;
    String fullName;
    String address;
    public Person(long id,String fullName, String address) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
    }

    @Override
    public void Eat() {

    }

    @Override
    public void Drink() {

    }

    @Override
    public void Sleep() {

    }

    @Override
    public void Work() {

    }
}
