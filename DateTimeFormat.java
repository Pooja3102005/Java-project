package Practical;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeFormat {
    public static void main(String[] args) {
        Date now = new Date();

        SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat f2 = new SimpleDateFormat("MM-dd-yyyy");
        SimpleDateFormat f3 = new SimpleDateFormat("EEEE MMMM dd yyyy");
        SimpleDateFormat f4 = new SimpleDateFormat("EEE MMMM dd HH:mm:ss z yyyy");
        SimpleDateFormat f5 = new SimpleDateFormat("dd/MM/yy HH:mm:ss a Z");

        System.out.println("Current date is : " + f1.format(now));
        System.out.println("Current date is : " + f2.format(now));
        System.out.println("Current date is : " + f3.format(now));
        System.out.println("Current date and time is : " + f4.format(now));
        System.out.println("Current date and time is : " + f5.format(now));
    }
}
