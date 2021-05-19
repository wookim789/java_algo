package backjoon;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HoneyHouse {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if(n == 1){
            System.out.println(1);
            return;
        }

        int m = 1;
        int multSix = 6;

        while(n > m){
            m += multSix;
            multSix += 6 ;
        }
        System.out.println(multSix/6);
    }
}
