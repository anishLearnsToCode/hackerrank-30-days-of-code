public class Day27 {
    static class TestDataEmptyArray {
        public static int[] get_array() {
            return new int[0];
        }
    }

    static class TestDataUniqueValues {
        public static int[] get_array() {
            return new int[] {0, 1};
        }

        public static int get_expected_result() {
            return 0;
        }
    }

    static class TestDataExactlyTwoDifferentMinimums {
        public static int[] get_array() {
            return new int[] {10, 10};
        }

        public static int get_expected_result() {
            return 0;
        }
    }
}
