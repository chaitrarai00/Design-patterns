package structural;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
/*
 * This class behaves like a integration to compose all the parts or classes together
 * in this case savings and current account
 */

public class CombinedAccounts implements Account {

	private List<Account> accounts=new ArrayList<>();
	
	public void addaccount(Account account) {
		this.accounts.add(account);
	}
	
	public void remove(Account account) {
		this.accounts.remove(account);
	}
	@Override
	public void showaccountdetails() {
	
		for(Account acc:accounts) {
			acc.showaccountdetails();
		}
		
	}

}
