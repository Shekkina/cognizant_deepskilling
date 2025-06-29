import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(1000);
    }
    
    @AfterEach
    void tearDown() {
        account = null;
    }
    
    @Test
    void testDeposit() {
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }


    @Test
    void testWithdraw() {
        account.withdraw(200);
        assertEquals(800, account.getBalance());
    }
}
