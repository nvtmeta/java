import java.util.Scanner;

public class Excercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Nhap so:");
        num =   scanner.nextInt();

        if(num > 0) {
            System.out.println("num is positive");
        } else {
            System.out.println("num is negative");
        }

        scanner.close();
    }
}
