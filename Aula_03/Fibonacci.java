package Aula_03;

public class Fibonacci {
    public static void main(String[] args) {
        int num1 = 1, num2 = 0;

        System.out.println(num2);
        System.out.println(num1);

        
        for(int i = 0; i < 9; i++) {
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);
        }
    }
}
