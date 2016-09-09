package lab1;

import java.util.Scanner;


public class lab1 {
	public static void main(String[] args) {
		Scanner answer= new Scanner(System.in);
		
		System.out.print("Enter how many years you plan to work: ");
		int work = answer.nextInt()*12;
		
		double returned1;
		do{
		System.out.print("Enter expected average return on investment: ");
		returned1 = answer.nextDouble();
		}while (returned1<=0 || returned1>20);
		returned1=returned1/ 1200;
		
		System.out.print("Enter how long you want to draw: ");
		int retired = answer.nextInt()*12;
		
		double returned2;
		do{
		System.out.print("Enter expected average return on investment: ");
		returned2 = answer.nextDouble();
		}while (returned2<=0 || returned2>3);
		returned2=returned2/ 1200;
		
		System.out.print("Enter required income: ");
		double income = answer.nextDouble();
		
		System.out.print("Enter expected SSI income: ");
		double ssi = answer.nextDouble();
		
		double total = income - ssi;
		
		double future = total * (1-1/(Math.pow((1+returned2), retired)))/returned2;
		
		double monthly = (future * returned1)/((Math.pow(1+returned1, work))-1);
		
		System.out.printf("What you should save every month $%.2f\n", monthly);
		
		System.out.printf("What you needed to save $%.2f", future);
	}
	
}

