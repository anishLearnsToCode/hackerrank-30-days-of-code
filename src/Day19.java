public class Day19 {
    interface AdvancedArithmetic{
        int divisorSum(int n);
    }

    @SuppressWarnings("InnerClassMayBeStatic")
    class Calculator implements AdvancedArithmetic {
        public int divisorSum(int n) {
            int sum = 0;
            for (int divisor = 2 ; divisor < n ; divisor++) {
                if (n % divisor == 0) {
                    sum += divisor;
                }
            }
            return sum + n + (n == 1 ? 0 : 1);
        }
    }
}
