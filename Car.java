package Sample;
import java.util.Scanner;
public class Car {
    final int Max_speed=200;
    String model;
    int speed;
    Car (String model, int speed){
    	this.model=model;
    	this.speed=speed;
    }
    void checkspeed() {
    	System.out.println("Model:"+model);
    	System.out.println("Speed:"+speed);
    	if(speed>Max_speed)
    	{
    		System.out.println("over speed");
    	}
    	else {
    		System.out.println("speed witin a  limit");
    	}
    }
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter class model:");
        String model=sc.nextLine();
        System.out.println("Enter car speed");
        int speed=sc.nextInt();
        Car c=new Car(model,speed);
        c.checkspeed();
        sc.close();
	}

}
