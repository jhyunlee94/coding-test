package string;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
	public static void main(String[] args) {
		UniqueEmailAddresses uniqueEmailAddresses = new UniqueEmailAddresses();
		// localName@domainName
		String[] emails = {"test.email+james@coding.com", "test.e.mail+toto.jane@coding.com", "testemail+tom@cod.ing.com"};
		System.out.println(uniqueEmailAddresses.solve_split(emails));
	}

	private int solve_split(String[] emails) {
		Set<String> set = new HashSet<>();

		for (String email : emails) {
			String[] parts = email.split("@");
			String[] localName = parts[0].split("\\+");
			set.add(localName[0].replace(".","")+parts[1]);
		}

		return set.size();
	}

}
