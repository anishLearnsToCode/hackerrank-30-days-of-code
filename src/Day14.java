import java.util.Arrays;

public class Day14 {
    class Difference {
        private int[] elements;
        public int maximumDifference;

        Difference(int[] elements) {
            this.elements = elements;
        }

        public void computeDifference() {
            int maximum = Arrays.stream(this.elements).max().getAsInt();
            int minimum = Arrays.stream(this.elements).min().getAsInt();
            this.maximumDifference = maximum - minimum;
        }
    }
}
