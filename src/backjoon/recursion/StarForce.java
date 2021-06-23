package backjoon.recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StarForce {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        for(int i = 0; i < n / 3; i ++){
            recurFnc(n);
        }

    }
    private static void recurFnc(int n){
        for(int i = 0; i < n; i++){
            printFRow(n);
        }
        System.out.println();
        for(int i = 0; i < n; i++){
            printSRow(n,i);
        }
        System.out.println();
        for(int i = 0; i < n; i++){
            printTRow(n);
        }
        System.out.println();
    }
    private static void printFRow(int n){
        if(n / 3 == 1){
            System.out.print("*");
            return;
        }
        printFRow(n / 3);
    }
    private static void printSRow(int n, int i){
        if(n / 3 == 1){
            if(i % 2 != 0){
                System.out.print(" ");
            }else{
                System.out.print("*");
            }
            return;
        }
        printSRow(n/3, i);
    }
    private static void printTRow(int n){
        if(n / 3 == 1){
            System.out.print("*");
            return;
        }
        printTRow(n / 3);
    }


}
