package assignment3;
import java.util.Scanner;

public class assignment3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);


		System.out.print("Hours worked: ");
		

		int hours = input.nextInt();
		

		

	

		System.out.print("Pay Rate: ");

		double payRate = input.nextDouble();

		total(hours,payRate);

		double totalPay = getTotalPay(payRate, hours);

		double percentage = getPercentage(hours);
	   displayOutput(payRate,hours,percentage,totalPay);

		displayOutput(payRate, hours, percentage, totalPay);

	}




	private static void displayOutput(double payRate, int hours, double percentage, double totalPay) {
		// TODO Auto-generated method stub
		
	}




	private static double getTotalPay(double payRate, int hours) {
		// TODO Auto-generated method stub
		return 0;
	}








	




	private static double getTotalPay(double payRate, Scanner hours) {

		

		return 0;

	

	}

	public static double total(int hours, double payRate)

	{

		double c = hours*payRate;

		double d = (hours*payRate)+(hours-40)*1;

		double percentage= hours/40*100;

	

		if(hours <= 40)
           
		{

			System.out.println("Total pay earned is: $" +c);

			return c;

		}

		else
              
		{

			System.out.println("Total pay earned is: $" +d);

			return d;

        }
	}


		

		public static double getPercentage(int hours)

		{
		double percentage= (hours/40.0)*100;
		System.out.println(percentage);
		return percentage;
		
		
		
         

	}
}


