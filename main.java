import java.io.*;
import java.util.*;
import xyz.add;
import xyz.division;
import xyz.subtract;
import xyz.multiplication;

class main
{
	public static void main(String[] args)
	{
		multiplication mult = new multiplication();
		add addi = new add();
		subtract sub = new subtract();
		division divi = new division();

		int number1=4, number2=2;
		Scanner obj = new Scanner(System.in);
			System.out.println("Enter two numbers:");
			//number1 = obj.nextInt();
			//number2 = obj.nextInt();
			System.out.println("Choose the operation");
			System.out.println("Enter Addition --> 1, Subtraction --> 2, Division --> 3, Multiplication --> 4");
			//int choice = obj.nextInt();
			int choice = 3;
			if(choice == 1)
			{
				int result = addi.addition(number1,number2);
				System.out.println(result);
			}
			else if(choice == 2)
			{
				int result = sub.subtract(number1,number2);
				System.out.println(result);
			}
			else if(choice == 3)
			{
				int result = divi.div(number1,number2);
				System.out.println(result);
			}
			else
			{
				int result = mult.multiply(number1,number2);
				System.out.println(result);
			}
	}
}	
