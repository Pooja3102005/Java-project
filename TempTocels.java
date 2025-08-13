package Demo2;
import java.util.Scanner;
public class TempTocels {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter temprature in celsius");
			double celsius=sc.nextDouble();
			double farenheit=(celsius*9/5)+32;
			System.out.println("Temprature in faenheit:"+farenheit);
			sc.close();
		}
	}

