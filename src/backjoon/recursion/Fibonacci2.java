package backjoon.recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fibonacci2 {
    public static void main(String[]args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        if(n == 0){
            System.out.println(0);
            return;
        }
        int[] dpArr = new int[n + 1];
        dpArr[0] = 0;
        dpArr[1] = 1;

        for(int i = 2; i <= n; i++){
            dpArr[i] = dpArr[i-1] + dpArr[i-2];
        }
        System.out.println(dpArr[n]);
    }
}
