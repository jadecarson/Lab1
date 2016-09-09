package lab1;

import java.util.Scanner;


public class lab1 {
	public static void main(String[] args) {
		Scanner answer= new Scanner(System.in);
		
		System.out.print("Enter how many years you plan to work: ");
		int work = answer.nextInt()*12;
		
		System.out.print("Enter expected average return on investment: ");
		double returned1 = answer.nextDouble()/1200;
		
		System.out.print("Enter how long you want to draw: ");
		int retired = answer.nextInt()*12;
		
		System.out.print("Enter expected average return on investment: ");
		double returned2 = answer.nextDouble()/1200;
		
		System.out.print("Enter required income: ");
		double income = answer.nextDouble();
		
		System.out.print("Enter expected SSI income: ");
		double ssi = answer.nextDouble();
		
		double total = income - ssi;
		
		double future = total * (1-1/(Math.pow((1+returned2), retired)))/returned2;
		
		double monthly = (future * returned1)/((Math.pow(1+returned1, work))-1);
		
		System.out.printf("What you should save every month " + monthly+"\n");
		
		System.out.printf("What you needed to save " + future);
	}
	
}

