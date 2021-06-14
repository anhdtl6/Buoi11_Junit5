import java.util.InputMismatchException;
import java.util.Scanner;

public class BMI {
    double bmiCalculator() {
        double cannang = 0;
        double chieucao = 0;
        double BMI;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cân nặng: ");
        while (true) {
            try {
                cannang = sc.nextDouble();
                if (cannang <= 0) throw new ArithmeticException();
                break;
            } catch (InputMismatchException ex1) {
                ex1.fillInStackTrace();
                continue;
            } catch (ArithmeticException ae) {
                System.out.println("Cân nặng phải >0");
                continue;
            }
        }
        System.out.println("Nhập chiều cao: ");
        while (chieucao <=0) {
            try {
                chieucao = sc.nextDouble();
                if (chieucao <= 0) throw new ArithmeticException();
                break;
            } catch (InputMismatchException ex4) {
                ex4.fillInStackTrace();
                continue;
            } catch (ArithmeticException ex5) {
                System.out.println("Chiều cao phải >0");
                continue;
            }
        }

        BMI = cannang / (chieucao * chieucao);
        if (BMI < 18.5) {
            System.out.println("Bạn thiếu cân, BMI của bạn là: " + BMI);
        } else {
            if (18.5 <= BMI && BMI <= 24.9) {
                System.out.println("Cơ thể bạn cân đối, BMI của bạn là: " + BMI);
            } else
                System.out.println("Thừa cân rồi bạn ơi!, BMI của bạn là: " + BMI);
        }
        return BMI;
    }
}

