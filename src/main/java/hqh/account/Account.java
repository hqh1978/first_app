package hqh.account;

public class Account {
	private String id;
	private int type;
	private double balance;
	public String getId() {
		return id;
	}
	public Account(){
	}
	public Account(String id,int type,double balance){
		this.id=id;
		this.type=type;
		this.balance=balance;
	}
	public void resetBalance(){
		this.balance=0;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
