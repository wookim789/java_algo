package backjoon.mathone;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class ArgumentScore {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        float n = Integer.parseInt(br.readLine());
        List<Float> scores = Arrays.stream(br.readLine().split(" "))
                .map(Float::parseFloat).collect(Collectors.toList());

        Optional<Float> optMaxV = scores.stream().reduce(Float::max);
        Optional<Float> optSum = scores.stream().reduce(Float::sum).map(x->x/n);
        if(optSum.isPresent() && optMaxV.isPresent())
            System.out.println(optSum.get() / optMaxV.get() * 100.0);
    }
}
