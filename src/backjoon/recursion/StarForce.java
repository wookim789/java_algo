package backjoon.recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StarForce {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        for(int i = 0; i < n / 3; i ++){
            recurFnc(n, i);
        }
    }
    private static void recurFnc(int n, int rdx){
        for(int i = 0; i < n; i++){
            printFRow(n, rdx, i / 3);
        }
        System.out.println();
        for(int i = 0; i < n; i++){
            printSRow(n, i, rdx, i / 3);
        }
        System.out.println();
        for(int i = 0; i < n; i++){
            printFRow(n, rdx, i / 3);
        }
        System.out.println();
    }
    private static void printFRow(int n, int rdx, int colSec){
        if(n / 3 == 1){

            if(rdx % 3 == 1 && colSec % 3 == 1) {
                System.out.print(" ");
            }else{
                System.out.print("*");
            }
            return;
        }
        printFRow(n / 3, rdx, colSec);
    }
    private static void printSRow(int n, int i, int rdx, int col){
        if(n / 3 == 1){
            if(i % 3 == 1 || (rdx % 3 == 1 && col % 3 == 1)){
                System.out.print(" ");
            }else{
                System.out.print("*");
            }
            return;
        }
        printSRow(n/3, i, rdx, col);
    }
}
