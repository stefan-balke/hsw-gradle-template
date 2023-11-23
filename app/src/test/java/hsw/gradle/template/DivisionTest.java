package hsw.gradle.template;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DivisonTest {
    @Test void divisionIntInt() throws Exception {
        Division div = new Division();
        int a = 15;
        int b = 3;
        int c = 5;
        assertEquals(div.divide(a,b),c);
    }

    @Test void divisionIntDouble() throws Exception {
        Division div = new Division();
        int a = 14;
        double b = 3.5;
        double c = 4;
        assertEquals(div.divide(a,b),c);
    }

    @Test void divisionDoubleInt() throws Exception {
        Division div = new Division();
        double a = 7.5;
        int b = 3;
        double c = 2.5;
        assertEquals(div.divide(a,b),c);
    }

    @Test void divisionDoubleDouble() throws Exception {
        Division div = new Division();
        double a = 10.5;
        double b = 3.5;
        double c = 3;
        assertEquals(div.divide(a,b),c);
    }
}
