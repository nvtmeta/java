import java.util.Scanner;

public class Excercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;
        String toantu;
        System.out.println("nhap so dau tien: ");
        num1 =   scanner.nextInt();

        System.out.println("nhap so thu 2: ");
        num2 =   scanner.nextInt();

        System.out.println("nhap toan tu: ");
        toantu = scanner.next();


        double result  = (double)caculator(num1, num2,toantu);

        System.out.println("ket qua: " + result);

    }

    private static int caculator(int num1, int num2, String toantu) {
    int result = 0;

        switch (toantu) {
            case "+" -> {
                result = num1 + num2;
                break;
            }
            case "-" -> {
                result = num1 - num2;
                break;
            }
            case "*" -> {
                result = num1 * num2;
                break;
            }
            case "/" -> {
                result = num1 / num2;
                break;
            }
        }
    return result;
    }
}
