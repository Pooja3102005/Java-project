package Demoo;

import java.util.Scanner;

public class Swzodiac {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Month 1-12");
		int Month=sc.nextInt();
		System.out.println("enter the Day");
		int day=sc.nextInt();
		switch(Month)
		{
		case 1:if(day>=1 && day<=19)
			    System.out.println("your zodiac sign is:Capricorn");
		      else
		        System.out.println("your zodiac sign is:Aquarius");
		break;
		case 2:if(day>=1 && day<=18)
		    System.out.println("your zodiac sign is:Aquarius");
	      else
	        System.out.println("your zodiac sign is:Pisces");
		break;
		case 3:if(day>=1 && day<=20)
		    System.out.println("your zodiac sign is:Pisces");
	      else
	        System.out.println("your zodiac sign is:Aries");
		break;
		case 4:if(day>=1 && day<=19)
		    System.out.println("your zodiac sign is:Aries");
	      else
	        System.out.println("your zodiac sign is:Taurus");
		break;
		case 5:if(day>=1 && day<=20)
		    System.out.println("your zodiac sign is:Taurus");
	      else
	        System.out.println("your zodiac sign is:Gemini");
		break;
		case 6:if(day>=1 && day<=20)
		    System.out.println("your zodiac sign is:Gemini");
	      else
	        System.out.println("your zodiac sign is:Cancer");
		break;
		case 7:if(day>=1 && day<=22)
		    System.out.println("your zodiac sign is:Cancer");
	      else
	        System.out.println("your zodiac sign is:Leo");
		break;
		case 8:if(day>=1 && day<=22)
		    System.out.println("your zodiac sign is:Leo");
	      else
	        System.out.println("your zodiac sign is:Vigro");
		break;
		case 9:if(day>=1 && day<=22)
		    System.out.println("your zodiac sign is:Vigro");
	      else
	        System.out.println("your zodiac sign is:Libra");
		break;
		case 10:if(day>=1 && day<=22)
		    System.out.println("your zodiac sign is:Libra");
	      else
	        System.out.println("your zodiac sign is:Scorpio");
		break;
		case 11:if(day>=1 && day<=21)
		    System.out.println("your zodiac sign is:Scorpio");
	      else
	        System.out.println("your zodiac sign is:Sagittarius");
		break;
		case 12:if(day>=1 && day<=21)
		    System.out.println("your zodiac sign is:Sagittarius");
	      else
	        System.out.println("your zodiac sign is:Capricorn");
		break;
		default:System.out.println("Invalid month");
		
		}
		sc.close();
		
	}

}
