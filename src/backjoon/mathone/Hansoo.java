package backjoon.mathone;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hansoo {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        int result = 0;
        if(0 < n && n < 100) {
            result = n;
        }else if (100 <= n && n <= 1000){
            result += 99;
            for(int i = 100; i <= n; i++){
                int f = i / 100;
                int s = (i % 100) / 10;
                int t = (i % 10);
                if(f - s == s - t){
                    result += 1;
                }
            }
        }

        System.out.println(result);
        return;
    }
}
