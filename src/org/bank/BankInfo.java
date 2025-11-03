package org.bank;

public class BankInfo extends AxisBank{
	private void saving() {
		System.out.println("Savings");
	}
	private void fixed() {
		System.out.println("Fixed");
	}
	@Override
	public void deposit() {
		super.deposit();
	}
	public static void main(String[] args) {
		BankInfo bank1 = new BankInfo();
		bank1.saving();
		bank1.fixed();
		bank1.deposit();	
		
	}
}
