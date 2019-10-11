package hello;

public class Account {
	private String accNum;
	private String owner;
	private int balance;
	
	public Account() {}
	
	public Account(String accNum, String owner, int balance) {
		this.accNum = accNum;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance += balance;
	}

}
