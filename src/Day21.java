public class Day21 {
}

class Printer <T> {
    /**
     *    Method Name: printArray
     *    Print each element of the generic array on a new line. Do not return anything.
     *    @param A generic array
     **/
    public static <E> void printArray(E[] array) {
        for (E element: array) {
            System.out.println(element);
        }
    }
}
