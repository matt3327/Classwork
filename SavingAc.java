public class SavingAc extends BankAccount {
private double rateofInterest;
	
	public SavingAc()
	{
		this("",0,0);//Calling same class constructor
		rateofInterest = 0.00;
	}
	
	public SavingAc(String name, double amt,double iRate) {
		super(name,amt); // calling super class constructor
		rateofInterest = iRate;
	}
	
	public double getRateofInterest() {
		return rateofInterest;
	}
	
	public void setRateofInterest(double rateofInterest) {
		this.rateofInterest = rateofInterest;
	}
	
	//Method overriding
	//Customized existing function
	public int withdraw(double amt) 
	{
		if(amt < 0)
		{
			return -1;
		}
		else if((getBal()-amt) < 5000)
		{
			return 0;
		}
		super.withdraw(amt);
		return 1;
	}
}