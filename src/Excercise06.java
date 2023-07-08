import java.util.Scanner;

public class Excercise06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int input;
    int output;
    int count = 0;

        System.out.println("Nhap so thu nhat: ");
        input = scanner.nextInt();

        if(1 < input && input < 99999) {
            while(input != 0 )   {
              input =   input /10 ;
                count ++;
            }
            System.out.println("It is " + count + "digit number");
        } else {
            System.out.println("number is not between 1 -> 99999");
        }

    }
}
