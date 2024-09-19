class BankAccount {
	private int balance = 0;
	private int minBalance = -5000;
	private String owner ;

	public String getowner() {
		return owner;
	}
	public String setowner() {
		return owner;
	}
	public int getBalance() {
		return balance;
	}
	public int getminBalance() {
		return minBalance;
	}


	public void setBalance(int number) {
		if (number>minBalance) {
			balance = number;
		}}


	/* balance mast be bigger then minbalance*/
	public BankAccount(int balance,int minBalance, String owner) {
		this.balance = balance;
		this.minBalance = minBalance;
		this.owner = owner;
	}


	public boolean withdraw(int amount) {
		if (balance - amount < minBalance)
			return false;
		balance = balance - amount;
		return true;
	}
	public void deposit (int amount) {
		balance += amount ;
	}

	public boolean transfer(BankAccount target, int amount) {
		if (withdraw(amount)==false) {
			System.out.println("you dont have enouth money to transfer");
			return false;
		}
		else {
			target.deposit(amount);
			return true;
		}
	}
	public void t_error(BankAccount target, int amount) {
		if(transfer(target,amount)==false) {
			System.out.println("I've exceeded your money limit");
		}
	}
	    public String toString() {
	return "balance of "+owner +"=" + balance;
}
}



