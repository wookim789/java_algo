package backjoon.mathone;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProfitPrice {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> num = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int a = num.get(0);
        int b = num.get(1);
        int c = num.get(2);
        if(b >= c){
            System.out.println(-1);
            return;
        }

        System.out.println(a / (c-b) + 1);
        return;
    }
}
