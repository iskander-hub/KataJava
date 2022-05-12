
import java.util.ArrayList;
import java.util.List;

public class Account {
	
	
	private Long id;
	private float balance;
	
	
	private List<Operation> listOperation;
	
	

	public Account(Long id, float balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public List<Operation> getListOperation() {
		return listOperation;
	}

	public void setListOperation(List<Operation> listOperation) {
		this.listOperation = listOperation;
	}
	
	public void deposit(float mnt) {
		this.balance+= mnt;
		
	}
	
	public void retrive(float mnt) {
		if(this.balance>= mnt) 
			this.balance-=mnt;
		else 
			System.out.println("Solde Insuffisant!!!");
	}
	
	public void virerVers(float mnt, Account dest) {
		
		this.retrive(mnt);
		dest.deposit(mnt);
		
	}



	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + "]";
	}
	

}
