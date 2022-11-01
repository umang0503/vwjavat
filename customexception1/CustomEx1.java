package customexception1;

import java.util.Scanner;

import customexception1.Account1;
import customexception1.InsufficientBalanceException1;

public class CustomEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account1 ob = new Account1("Prateek Joshi",1001,2000);
		
		Scanner sc = new Scanner(System.in);
		String r;
		
		do
		{
			System.out.println("Enter the amt to withdraw in multiples of 1000:");
			double amt = sc.nextDouble();
			
			try
			{
			amt = ob.withdraw(amt);
			}
			catch(ZeroBalanceException e1)
			{
				System.out.println(e1);
				break;
			}
			catch(InsufficientBalanceException1 e)
			{
				System.out.println(e);
				
			}
			System.out.println("Do you wish to continue:(y/n):");
			 r =  sc.next();
			
			
		}while(r.charAt(0)=='y'||r.charAt(0)=='Y');

		
		sc.close();
		System.out.println("program ends here..");
	}
	}


