package backjoon.mathtwo;

import java.util.Scanner;

public class SoinsuBunHea {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        if(n == 1){
            return;
        }

        int x = 2;
        while (x <= n){
            if(n % x == 0){
                System.out.println(x);
                n = n / x;
                x = 1;
            }
            x++;
        }
    }
}
