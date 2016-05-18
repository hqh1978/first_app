package hqh.account;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AccountTest extends TestCase {
	public AccountTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(AccountTest.class);
	}

	public void testAccount() {
		assertTrue(true);
	}

	public void testResetBalance() {
		Account a = new Account("1",0,8.0);
		a.resetBalance();
		assertEquals(0.0, (double) a.getBalance());
	}
}
