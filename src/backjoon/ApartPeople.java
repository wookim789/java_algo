package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ApartPeople {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        List<List<Integer>> dpList = new ArrayList<>();
        dpList.add(Stream.iterate(1, x -> x + 1).limit(14)
                        .collect(Collectors.toList()));

        for(int i = 1; i < 14; i++){
            List<Integer> underFloor = dpList.get(i - 1);
            List<Integer> curFloor = Stream.iterate(-1, x -> {
                x++;
                return underFloor.stream().;
            }).collect(Collectors.toList());

        }

        while (t > 0){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());


            /**
             * 1 5 15 35
             * 1 4 10 20
             * 1 3 6 10
             * 1 2 3 4 5 6 7 ... 14
             */
        }
    }
}
