import java.util.Scanner;

public class Excercise05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 ;
        int num2;
        int num3;

        System.out.println("Nhap so thu nhat: ");
        num1 = scanner.nextInt();
        int maxNum;
        System.out.println("Nhap so thu hai: ");
        num2 = scanner.nextInt();
        System.out.println("Nhap so thu ba: ");
        num3 = scanner.nextInt();

        if(num1 > num2 && num1 > num3) {
            maxNum = num1;
        } else {
            int i = num2 > num3 ?  num2 : num3;
            maxNum = i;
        }
        System.out.println("so lon nhat la: " + maxNum);

        scanner.close();
    }
}
