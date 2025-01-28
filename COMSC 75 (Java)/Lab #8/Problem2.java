/*
 * 
 * Niklas Feil-Ho
 * Id # 1057122
 * January 18, 2024
 * COMSC - 075
 * Prof. Ho
 * 
 * Lab 8 Problem 2
 * 
 * 2. The XYZZY Corporation wants to retain its most loyal customers. 
 * They launch a customer retention program and offer discounts to customers who have been purchasing from the company for at least one year. 
 * Write a subclass PrefCust that extends the Customer class, which has a couple of private attributes such as name and email. 

The PrefCust class should have two data fields: purchase amount and customer history (number of years they have been a customer). 
These are both private variables. These 2 data fields could be declared in PrefCust. 

Customers get a discount percentage based on their history and purchase amount. There are three levels of Preferred Customers: bronze, silver and
gold.
- Bronze: history ≥ 1 year and average purchase amount ≥ $5000 per year. 5%
- Silver: history ≥ 2 years and average purchase amount ≥ $10000 per year. 7.5%
- Gold: history ≥ 3 years and average purchase amount ≥ $15000 per year. 10%
The discount percentage is a derived attribute. It is never set directly but instead is computed based on other attributes.

Write the PrefCust class with all its data fields. Please write all the getter and setter methods. Write a method named getDiscount that uses the purchase
amount and customer history to return the discount percent (as a percentage).

Also, you should use super to call the super class's constructor from PrefCust class. 
 */
import java.util.Scanner;

public class Problem2 {
	private String name;
	private String email;
	
	public Problem2 (String name, String email) {
		this.name = name;
		this.email = email;
		
	}
	public String getName () {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}
	public String getEmail () {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
	
	public static class prefCust extends Problem2 {
		private double purchaseAmount;
		private int customerHistory;
		
		public prefCust(String name, String email, double purchaseAmount, int customerHistory) {
			super(name, email);
			this.purchaseAmount = purchaseAmount;
			this.customerHistory = customerHistory;
			
		}
		
		public double getPurchaseAmount() {
			return purchaseAmount;
		}
		public void setPurchaseAmount(double purchaseAmount) {
			this.purchaseAmount = purchaseAmount;
		}
		public int getCustomerHistory() {
			return customerHistory;
		}
		public void setCustomerHistory (int customerHistory) {
			this.customerHistory = customerHistory;
		}
		public void getDiscount() {
			
			System.out.println("Debug - Purchase Amount: " + purchaseAmount);
			System.out.println("Debug - Customer History: " + customerHistory);
			if (customerHistory >= 1 && purchaseAmount >= 5000)  {
				System.out.println("You are elligable a bronze(5%) dscount ");
			} else if (customerHistory >= 2 && purchaseAmount >= 10000) {
				System.out.println("You are elligable a silver(10%) dscount ");
			} else if (customerHistory >= 3 && purchaseAmount >= 15000) {
				System.out.println("You are elligable a gold(15%) dscount ");
			}	else {
					System.out.println("You are not elligable for a discount");
				}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter you name: ");
		String name = input.nextLine();
		
		System.out.println("Enter you email: ");
		String email = input.nextLine();
		
		System.out.println("Enter your purchase amount: ");
		double purchaseAmount = input.nextDouble();
		
		System.out.println("Enter the amount of years you have been a customer: ");
		int customerHistory = input.nextInt();
		
		prefCust Problem2 = new prefCust(name, email, purchaseAmount, customerHistory);
		Problem2.getDiscount();
		

	}
	}
