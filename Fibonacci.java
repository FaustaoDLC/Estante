package com.mycompany.trabalho;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scan.nextInt();

        boolean found = false;
        int a = 0, b = 1, c = 1;

        while (c <= num) {
            if (c == num) {
                found = true;
                break;
            }
            a = b;
            b = c;
            c = a + b;
        }

        if (found) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
    }
}
