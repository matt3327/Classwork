// Java Bean / POJO Plain Old Java Object 
//Complete class
public abstract class BankAccount {
	private int accNo;
	private String name;
	private double bal;
	
	private static int LastAcNo = 0;
	
	public BankAccount() {
		this("", 0);
	}
	
	public BankAccount(String name, double bal) {
		this.accNo = LastAcNo ++ ;
		this.name = name;
		this.bal = bal;
	}

	public BankAccount(String name) {
		this.name = name;
	}
	
	//Add, Modify, remove
	// Setter / Mutator methods
	private void setAccNo(int no) {
		
		accNo = no;
		
	}
	
	//Fetch data
	// Getter / Accessor methods
	public int getAccNo() {
		return accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBal() {
		return bal;
	}

	private void setBal(double bal) {
		if(bal > 0) {
			this.bal = bal;
		}
	}

	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", name=" + name + ", bal=" + bal + "]";
	}
	
	//Deposit Amount
	public boolean deposit(double amt) {
		if(amt < 0) {
			return false;
		}
		setBal(amt + getBal());
		return true;
	}
	
	public int withdraw(double amt) {
		if(amt < 0) {
			return -1;
		} else if(amt > getBal()) {
			return 0;
		}
		
		setBal(getBal() - amt);
		return 1;
	}
}