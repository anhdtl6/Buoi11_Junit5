public class Person {
    String name;
    String nationality;
    int age;

    public Person(String name, String nationality, int age) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getNationality() {
        return nationality;
    }
}

