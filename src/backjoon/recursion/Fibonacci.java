package backjoon.recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
1
        int n = sc.nextInt();
        sc.close();

        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n){
        if(n > 1){
            return n * fibonacci(n - 1);
        }
        return 1;
    }
}
