package backjoon;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HoneyHouse {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m  = n / 6;
        int g = n % 6;

        if(g != 0){
            m ++;
        }
        System.out.println(m);
    }
}
