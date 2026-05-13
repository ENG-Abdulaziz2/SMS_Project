package test;

public class Calculation {

    public int calculateGrade(int score) {

        if(score >= 90) {
            return 1;
        } else if(score >= 80) {
            return 2;
        } else if(score >= 70) {
            return 3;
        } else if(score >= 60) {
            return 4;
        } else if(score >= 50) {
            return 5;
        }

        return 0;
    }
}
