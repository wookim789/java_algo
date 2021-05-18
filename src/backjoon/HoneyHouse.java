package backjoon;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HoneyHouse {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int result = 1;
        int m = 6;
        int k = 1;
        if(n == 1){
            System.out.println(result);
            return;
        }

        while(n > m){
            n -=  m;
            k ++;
            m *= k;
            result ++;
        }

        if(n > 0){
            result ++;
        }

        System.out.println(result);
    }
}
