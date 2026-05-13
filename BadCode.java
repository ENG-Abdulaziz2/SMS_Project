package test;

public class BadCode {

    String password = "admin123";

    public void calc(int a, int b, int c) {

        int x = 5;
        int y = 10;

        if(a > 10) {

            if(b > 20) {

                if(c > 30) {

                    System.out.println(a + b + c);

                } else {

                    System.out.println(a * b * c);

                }

            } else {

                System.out.println("Error");

            }

        } else {

            System.out.println("Wrong");

        }

        if(a == 1) {
            System.out.println("A");
        }

        if(a == 2) {
            System.out.println("B");
        }

        if(a == 3) {
            System.out.println("C");
        }

        if(a == 4) {
            System.out.println("D");
        }

        if(a == 5) {
            System.out.println("E");
        }

    }

    public void duplicateCode() {

        int total = 0;

        for(int i = 0; i < 10; i++) {

            total += i;

        }

        System.out.println(total);

    }

    public void duplicateCode2() {

        int total = 0;

        for(int i = 0; i < 10; i++) {

            total += i;

        }

        System.out.println(total);

    }

}
