/**
 * 
 */
package addressbook.app;
import lib.Address;

/**
 * @author 1539613
 *
 */
public class AddressBook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Address myAddress = new Address("3040","Sherbrooke");
		System.out.println(myAddress.getAddress());

	}

}
