import java.util.Date;



public class Operation {
	
	private Long numero;
	private Date dateOperation;
	private float amount;
	private Account account;
	private String typeOperation;
	public Operation(Long numero, Date dateOperation, float amount, Account account, String typeOperation) {
		super();
		this.numero = numero;
		this.dateOperation = dateOperation;
		this.amount = amount;
		this.account = account;
		this.typeOperation = typeOperation;
		
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public Date getDateOperation() {
		return dateOperation;
	}
	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}
	public float getAmount() {
		return amount;
	}
	@Override
	public String toString() {
		return "Operation [numero=" + numero + ", dateOperation=" + dateOperation + ", amount=" + amount + ", account="
				+ account + ", typeOperation=" + typeOperation + "]";
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public String getTypeOperation() {
		return typeOperation;
	}
	public void setTypeOperation(String typeOperation) {
		this.typeOperation = typeOperation;
	}
	

}
