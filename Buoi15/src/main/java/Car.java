import java.util.ArrayList;
import java.util.Collections;

public class Car {
    void Car()
    {
        String[] cars = {"Toyota", "Volvo", "BMW", "Ford", "Mazda"};
        String temp = cars[0];
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].compareTo(cars[j]) > 0) {
                    temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }
            }
        }
        System.out.println("Danh sách sắp xếp alphabe là: ");
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + "\t");
        }
    }
}

