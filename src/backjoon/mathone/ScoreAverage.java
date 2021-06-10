package backjoon.mathone;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class ScoreAverage {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<String> arr = new ArrayList<>();

        for(int i = 0; i < n; i++){
            arr.add(br.readLine());
        }

        arr.forEach(x->{
            List<Float> scoreList = Arrays.stream(x.split(" "))
                    .map(Float::parseFloat).collect(Collectors.toList());

            float m = scoreList.get(0);
            float avg = scoreList.stream().reduce(Float::sum).map(y->(y-m)/m).get();
            float cnt = scoreList.stream().filter(score -> score > avg).count();

            System.out.println(String.format("%.3f", cnt/m * 100f) + "%");
        });
    }
}
