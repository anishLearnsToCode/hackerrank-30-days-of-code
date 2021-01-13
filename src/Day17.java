public class Day17 {
    class Calculator {
        int power(int base, int exponent) throws Exception {
            if (base < 0 || exponent < 0) {
                throw new Exception("n and p should be non-negative");
            }
            return (int) Math.pow(base, exponent);
        }
    }
}
