package Demoo;
import java.util.Scanner;
public class Swmonth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the month");
		String month=sc.next();
		switch (month)
		{
		case "January":System.out.println(31);
		break;
		case "February":System.out.println(28-29);
		break;
		case "March":System.out.println(31);
		break;
		case "April":System.out.println(30);
		break;
		case "May":System.out.println(31);
		break;
        case "June":System.out.println(30);
        break;
        case "July":System.out.println(31);
		break;
        case "August":System.out.println(31);
		break;
        case "September":System.out.println(30);
		break;
        case "October":System.out.println(31);
		break;
        case "November":System.out.println(30);
		break;
        case "December":System.out.println(31);
		break;
		
		}
		sc.close();
	}

}
