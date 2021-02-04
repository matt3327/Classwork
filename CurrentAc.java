
public class CurrentAc extends BankAccount{
	public boolean deposit(double amt) {
		return false;
	}
	public int withdraw(double amt) {
		if(amt < 0) {
			return -1;
		}else if(amt > getBal()) {
			return 0;
		}
		
		super.withdraw(amt);
		return 1;
	}
}
