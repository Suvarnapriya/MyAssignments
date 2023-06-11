package org.bank;

public class AxisBank extends BankInfo{

	public void deposit()
	{
		System.out.println("AxisBank deposit account");
	}
	
	public static void main(String[] args) {
	
		AxisBank Acc = new AxisBank();
		Acc.deposit();
		Acc.fixed();
		Acc.saving();
		
	}

}
