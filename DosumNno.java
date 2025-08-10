package While;

import java.util.Scanner;

public class DosumNno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of value N:");
	   
		int N =sc.nextInt();
		int sum=0;
		int i=1;
		do {
			sum=sum+i;
			i++;
		}
		while(i<=N);
		System.out.println("sum of N numbers:"+sum);
		sc.close();
	}

}
