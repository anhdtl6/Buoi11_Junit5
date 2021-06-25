import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class DataStructure {
    public static void main(String[]args) {
        ArrayList<Person> people = new ArrayList<>(List.of(
                new Person("Vinh", "Vietnam", 28),
                new Person("Lan", "Vietnam", 24),
                new Person("John", "USA", 27),
                new Person("Lee", "China", 67),
                new Person("Kim", "Korea", 22),
                new Person("Long", "Vietnam", 18),
                new Person("Jungho", "Korea", 19),
                new Person("Tian", "China", 20),
                new Person("Clara", "USA", 40),
                new Person("Mikura", "Japan", 27),
                new Person("Sony", "Japan", 29),
                new Person("Xiang", "China", 78),
                new Person("Peter", "France", 18),
                new Person("Haloy", "Malaysia", 20),
                new Person("Magie", "Malaysia", 32)
        ));
        //--1. Đếm số người theo từng quốc tịch in ra màn hình
        Map<String, Integer> countCountry = new HashMap<>();
        for (Person person : people) {
            if (countCountry.containsKey(person.nationality)) {
                countCountry.put(person.nationality, countCountry.get(person.nationality) + 1);
            } else {
                countCountry.put(person.nationality, 1);
            }
        }
        System.out.println("1. Số người theo từng quốc tịch ---");
        for (Map.Entry<String,Integer> entry : countCountry.entrySet()) {
            System.out.println(entry.getKey() + " : "+ entry.getValue());
        }

        //---2. Sắp xếp theo tên những người trên 25 tuổi rồi in ra màn hình
        ArrayList<Person> list25= new ArrayList<>();
        for(Person person  : people)
        {
            if(person.getAge()>25)
            {
                list25.add(person);
            }
        }
        System.out.println("2. Số người > 25 tuổi ---");
        for (Person person25: list25)
        {
            System.out.printf("\n- %s - %s - %d",person25.getName(), person25.getNationality(), person25.getAge());
        }
        //--3. Tính trung bình tuổi của người theo từng quốc gia
        Map<String, List<Person>> avgAgeNational = new HashMap<>();
        avgAgeNational = people.stream().collect(Collectors.groupingBy(a->a.getNationality()));
        System.out.println("\n3. Tuổi trung bình của người theo từng quốc gia---");
        for (Map.Entry<String,List<Person>> entry : avgAgeNational.entrySet())
        {
            // tính tổng theo nhóm
            int sumAge = 0;
            for ( Person agePerson : entry.getValue())
            {
                sumAge = sumAge+ agePerson.getAge();
            }
            double averageAge = (double) sumAge/entry.getValue().size();
            System.out.printf("\n- %s: %.1f", entry.getKey(), averageAge);
        }

        //--4. In ra màn hình đánh giá tuổi mỗi người
        System.out.println("\n4. Đánh giá tuổi cho mỗi người---");
        String textAge = "";
        for (Person person : people)
        {
            if(person.getAge() < 20)
                textAge ="nổi loạn";
            else if(person.getAge() >= 20 && person.getAge()<= 30)
                textAge ="việc làm";
            else if(person.getAge()>= 31 && person.getAge() <= 40 )
                textAge ="sự nghiệp";
            else
                textAge ="hưởng thụ";
            System.out.printf("\n- %s - %s - %d - %s",person.getName(), person.getNationality(), person.getAge(), textAge);
        }
    }
}
