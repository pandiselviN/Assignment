package week4day3;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("deposit");
	}
	
	public void main (String args[]) {
		AxisBank axis=new AxisBank();
		axis.saving();
		axis.fixed();
		axis.deposit();
		axis.deposit();
		
	}
}
