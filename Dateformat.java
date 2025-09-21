package Codechef;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Dateformat {


    public static void main(String[] args) {

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String Str = sdf.format(date);
        System.out.println("Current date is: " + Str);

        sdf = new SimpleDateFormat("MM-dd-yyyy");
        Str = sdf.format(date);
        System.out.println("Current date is: " + Str);

        sdf = new SimpleDateFormat("EEEE MMMM dd yyyy");
        Str = sdf.format(date);
        System.out.println("Current date is: " + Str);

        sdf = new SimpleDateFormat("E MMMM dd HH:mm:ss z yyyy");
        Str = sdf.format(date);
        System.out.println("Current date and time is: " + Str);

        sdf = new SimpleDateFormat("dd/MM/yy HH:mm:ss a Z");
        Str = sdf.format(date);
        System.out.println("Current date and time is: " + Str);

        sdf = new SimpleDateFormat("hh:mm:ss");
        Str = sdf.format(date);
        System.out.println("Current time is: " + Str);

        sdf = new SimpleDateFormat("w");
        Str = sdf.format(date);
        System.out.println("Current week of year is: " + Str);

        sdf = new SimpleDateFormat("W");
        Str = sdf.format(date);
        System.out.println("Current week of the month is: " + Str);

        sdf = new SimpleDateFormat("D");
        Str = sdf.format(date);
        System.out.println("Current day of the year: " + Str);
    }
}
