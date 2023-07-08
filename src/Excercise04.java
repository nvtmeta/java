import java.util.Scanner;

public class Excercise04 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int day;
        String thu;
        System.out.println("Nhap so:");
        day = scanner.nextInt();


        thu = checkDay(day);
        System.out.println("this is: " + thu);
    }

    private static String checkDay(int day) {
            String weekDayName;

        switch (day) {
            case 1 -> weekDayName = "Monday";
            case 2 -> weekDayName = "Tuesday";
            case 3 -> weekDayName = "wed";
            case 4 -> weekDayName = "thurs";
            case 5 -> weekDayName = "Fri";
            case 6 -> weekDayName = "sat";
            case 7 -> weekDayName = "Sun";
            default -> weekDayName = "invalid input";
        }
        return weekDayName;
    }
}
