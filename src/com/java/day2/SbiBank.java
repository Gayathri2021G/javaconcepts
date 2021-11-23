package com.java.day2;

public class SbiBank implements Bank1 {

	@Override
	public void creditCard() {
System.out.println("sbi credit");		
	}

	@Override
	public void debitCard() {
System.out.println("sbi debit");		
	}

	@Override
	public void loanAmt() {
System.out.println("loam amt 10%");		
	}
	
public static void main(String[] args) {
	SbiBank f=new SbiBank();
	f.creditCard();
	f.debitCard();
	f.loanAmt();
}
}
