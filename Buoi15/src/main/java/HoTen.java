import java.util.Scanner;
import static java.lang.Character.isDigit;
public class HoTen {

    void HoTen()
    {
        inputName();
    }
    public static void inputName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng họ tên: ");
        int n = sc.nextInt();
        String [] hoten= new String[n];
        Scanner sc1= new Scanner(System.in);
        while (containsDigit(hoten[n])) {
            for (int i = 0; i < hoten.length; i++) {
                System.out.println("Họ tên " + i);
                hoten[i] = sc1.nextLine();
            }
        }
        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (hoten[i].compareTo(hoten[j]) > 0) {
                    temp = hoten[i];
                    hoten[i] = hoten[j];
                    hoten[j] = temp;
                }
            }
        }
        System.out.println("Danh sách sắp xếp alphabe là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(hoten[i] + "\t");
        }

    }

    public static boolean containsDigit(String s) {
        boolean containsDigit = false;
        if (s != null && !s.isEmpty()) {
            for (char c : s.toCharArray()) {
                if (containsDigit = Character.isDigit(c)) {
                    break;
                }
            }
        }
        return containsDigit;
    }
}
