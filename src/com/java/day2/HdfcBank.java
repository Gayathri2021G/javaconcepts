package com.java.day2;

public class HdfcBank extends Bank {

	@Override
	public void LoanTerm(int a) {
System.out.println("loan 10%"+a);		
	}
	
	public void creditCard() {
System.out.println("Hdfc credit card");
	}
public static void main(String[] args) {
	HdfcBank n=new HdfcBank();
	n.LoanTerm(12);
	n.creditCard();
	
}

}
