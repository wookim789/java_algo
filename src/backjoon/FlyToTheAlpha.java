package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

            int st = list.get(0), ed = list.get(1), k = 0, result = 0, dist = 0, avg = (ed - st)/2;
            List<Integer> dpTable = new ArrayList<>();

            while(true){
                if(dpTable.size() == k){
                    if(dist < avg){
                        k++;
                        dist += k;
                        dpTable.add(dist);
                    }else if(result == 0){
                        result = 2 * k - 1;
                        dist = (k-1) * k/2 + dist;
                    }else if(st + dist == ed){
                        break;
                    }else {
                        result ++;
                        dist ++;
                    }
                }else{
                    if(dpTable.get(k-1) < avg){
                        k++;
                    }else if(result == 0){
                        result = 2 * k - 1;
                        dist = (k-1) * k/2 + dpTable.get(k);
                    }else if(st + dist == ed){
                        break;
                    }else {
                        result ++;
                        dist ++;
                    }
                }
            }
            t--;
            System.out.println(result);
        }
    }
}
