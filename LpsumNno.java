package Demoo;
import java.util.Scanner;
public class LpsumNno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of value N:");
	   
		int N =sc.nextInt();
		int sum=0;
		for( int i=1;i<=N;i++) {
			sum= sum+i;
		}
		
			System.out.println("sum of natural number is:"+sum );
			sc.close();
		}
	
	}


