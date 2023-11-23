package hsw.gradle.template;

public class Division{
    public int divide(int a, int b) throws Exception {
        if (b != 0) {
            return  a / b;
        } else {
            throw new Exception();
        }
    }
    public double divide(int a, double b) throws Exception {
        if (b != 0) {
            return  a / b;
        } else {
            throw new Exception();
        }
    }
    public double divide(double a, int b) throws Exception {
        if (b != 0) {
            return  a / b;
        } else {
            throw new Exception();
        }
    }
    public double divide(double a, double b) throws Exception {
        if (b != 0) {
            return  a / b;
        } else {
            throw new Exception();
        }
    }
}
