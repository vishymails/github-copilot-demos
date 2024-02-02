package org.example;

public class StudentGradeCalculator {

        public static String calculateGrade(int[] grades) {
            int sum = 0;
            for (int grade : grades) {
                sum += grade;
            }
            double average = (double) sum / grades.length;
            if (average >= 90) {
                return "A";
            } else if (average >= 80) {
                return "B";
            } else if (average >= 70) {
                return "C";
            } else if (average >= 60) {
                return "D";
            } else {
                return "F";
            }
        }

        //method for isExtraTrainingNeeded
    public static boolean isExtraTrainingNeeded(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100");
        }
        return score < 40;
    }

}
