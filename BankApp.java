public class BankApp{
	public static void main(String[] args) {
		BankAccount ba = null;
		int choice = 0;
		
		//input choice from user
		// if choice = 1 then use savings
		//if choice = 2 then use current
		choice = 1;// assuming user input 
		
		if(choice == 1) {
			ba = new SavingAc("Harrish", 20000, .00);
		}else {
			ba = new CurrentAc();
		}
		
		//ba.getRateofInterest(); cannot be use child class functionality
		ba.withdraw(2000); // this functionality execution gets changed based on its data
		
	}
}
