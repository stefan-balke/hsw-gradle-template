package hsw.gradle.template;

import org.junit.jupiter.api.DisplayName;
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
    void IBANisNotGerman() {
        String myIBAN = "ZZ68210501700012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertFalse(classUnderTest.checkForDE(myIBAN));
    }

    @Test
    void checkForEquality() {
        String myIBAN = "ZZ68210501700012345678";
        String comparatorIBAN = "ZZ68210501700012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertTrue(classUnderTest.checkForEquality(myIBAN, comparatorIBAN));
    }

    @Test
    @DisplayName("Soll fehlschlagen.")
    void checkForEqualityFalse() {
        String myIBAN = "ZZ68210501700012345678";
        String comparatorIBAN = "ZZ68210501700012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertFalse(classUnderTest.checkForEquality(myIBAN, comparatorIBAN));
    }
}