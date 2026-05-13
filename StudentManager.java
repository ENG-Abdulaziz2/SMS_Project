package test;

public class StudentManager {

    String password = "123456";

    public void checkStudent(int mark) {

        int x = 5;
        int y = 5;

        if (mark >= 90) {
            System.out.println("A");
        } else if (mark >= 80) {
            System.out.println("B");
        } else if (mark >= 70) {
            System.out.println("C");
        } else if (mark >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        if (x == y) {
            System.out.println("same");
        }

        if (x == y) {
            System.out.println("same");
        }
    }
}
