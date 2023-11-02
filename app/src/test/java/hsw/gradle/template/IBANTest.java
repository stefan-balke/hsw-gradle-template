package hsw.gradle.template;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IBANTest {
    @Test void IBANDE() {
        String myIBAN = "DE68210501700012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertEquals(classUnderTest.check(myIBAN), true);
    }

    @Test void IBANWrong() {
        String myIBAN = "ZZ68210501700012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertEquals(classUnderTest.check(myIBAN), false);
    }

    @Test
    public void IBANisGerman() {
        String myIBAN = "DE89370400440532013000";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertTrue(classUnderTest.checkForDE(myIBAN));
    }

    @Test
    public void IBANisNotGerman() {
        String myIBAN = "ZZ68210501700012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertFalse(classUnderTest.checkForDE(myIBAN));
    }
}