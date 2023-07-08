import java.util.Scanner;

public class Excercise03 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        boolean isAllow;
        int classHeld;

        System.out.println("Number of classes held: ");
        classHeld = scanner.nextInt();

         System.out.println("Number of classes attended: ");
        int classAttended = scanner.nextInt();

        isAllow = checkExam(classHeld, classAttended);

        System.out.println("can be sit in exam: " +  isAllow);
    }

    private static boolean checkExam(int classHeld, int classAttended) {
       return ((double) classAttended / classHeld) >= 0.75;
    }
}
