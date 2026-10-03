package homework;

public class Homework1 {
    public static void main(String[] args) {
        int x = 20;
        int y = 30;

        if (x > y) {
            System.out.println("x-ը մեխ ե y-ից");
        } else if (x < y) {
            System.out.println("x-ը փոքր ե y-ից");
        } else {
            System.out.println("x - ը հավասար է y -ին");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1);
        }

        int a = 5;
        int b = 7;

        System.out.println("(a + b) հավասար  է " + (a + b));


        int n = 3;
        for (int i = 0; i < 10; i++) {
            System.out.println(n + "*" + i + " = " + n * i);

        }
    }
}