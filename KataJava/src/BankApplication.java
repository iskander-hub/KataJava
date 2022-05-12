import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------compte intial-----");
		Account compte1 = new Account(1L, 1000);
		System.out.println(compte1.toString());
		System.out.println("-------compte après retrait-----");
		List<Operation> operations = new ArrayList<Operation>();
		Operation retrait = new Operation(11L, new Date(), 500, compte1, "Retrait");
		operations.add(retrait);
		
		compte1.retrive(500);
		System.out.println(compte1.toString());
		System.out.println("-------compte après depot-----");
		Operation depot = new Operation(22L, new Date(), 500, compte1, "Depot");
		operations.add(depot);
		compte1.deposit(500);
		System.out.println(compte1.toString());
		System.out.println("-------Liste des opérations sur Compte-----");
		compte1.setListOperation(operations);
		for (int i = 0; i < compte1.getListOperation().size(); i++) {
			
			System.out.println(compte1.getListOperation().get(i).toString());
			
		}
		
		
		
		

	}

}
