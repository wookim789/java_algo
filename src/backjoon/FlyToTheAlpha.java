package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//public class Main {
public class FlyToTheAlpha {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t > 0){
            List<Integer> list = Arrays.stream(br.readLine().split(" "))
                                    .map(Integer::parseInt)
                                    .collect(Collectors.toList());

            int st = list.get(0), ed = list.get(1), k = 0, result = 0, dist = 0, bet = ed - st;

            while(true){
                if(k * (k+1)/2 < (bet)/2 ){
                    k++;
                }else if(result == 0 && dist == 0){
                    result = 2 * k - 1;
                    dist = (k-1) * k/2 + k * (k+1)/2 + st;
                }else if(dist == ed){
                    break;
                }else {
                    result ++;
                    dist ++;
                }
            }
            t--;
            System.out.println(result);
        }
    }
}
