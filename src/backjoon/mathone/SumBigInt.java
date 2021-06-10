package backjoon.mathone;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumBigInt {
    public static void main(String [] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<BigInteger> arr = Arrays.stream(br.readLine().split(" ")).map(s->new BigInteger(s)).collect(Collectors.toList());

        System.out.println(arr.get(0).add(arr.get(1)));
    }
}
