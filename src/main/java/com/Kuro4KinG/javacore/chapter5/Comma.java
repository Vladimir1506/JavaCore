package main.java.com.Kuro4KinG.javacore.chapter5;

// Использование запятой в операторе цикла for
class Comma {
    public static void main(String[] args) {
        int a, b;

        for (a = 1, b = 4; a < b; a++, b--) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}
