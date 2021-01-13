import java.util.Arrays;

public class Day12 {
    static class Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        Person(String firstName, String lastName, int identification){
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson(){
            System.out.println(
                    "Name: " + lastName + ", " + firstName
                            + 	"\nID: " + idNumber);
        }

    }

     class Student extends Person {
        private int[] testScores;

        /*
         *   Class Constructor
         *
         *   @param firstName - A string denoting the Person's first name.
         *   @param lastName - A string denoting the Person's last name.
         *   @param id - An integer denoting the Person's ID number.
         *   @param scores - An array of integers denoting the Person's test scores.
         */
        Student(String firstName, String lastName, int id, int[] testScores) {
            super(firstName, lastName, id);
            this.testScores = testScores;
        }

        /*
         *   Method Name: calculate
         *   @return A character denoting the grade.
         */
        public Character calculate() {
            double averageMarks = average(this.testScores);
            if (averageMarks >= 90 && averageMarks <= 100) {
                return 'O';
            } else if (averageMarks >= 80 && averageMarks < 90) {
                return 'E';
            } else if (averageMarks >= 70 && averageMarks < 80) {
                return 'A';
            } else if (averageMarks >= 55 && averageMarks < 70) {
                return 'P';
            } else if (averageMarks >= 40 && averageMarks < 55) {
                return 'D';
            }
            return 'T';
        }

        private double average(int[] array) {
            return Arrays.stream(array).asDoubleStream().sum() / array.length;
        }
    }
}
