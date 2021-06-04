package backjoon;

import java.util.*;
import java.util.stream.*;
/***/
public class ApartPeople {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        List<List<Integer>> dpList = new ArrayList<>();
        dpList.add(Stream.iterate(1, x -> x + 1).limit(14)
                        .collect(Collectors.toList()));

        for(int i = 0; i < 15; i++){
            List<Integer> underFloor = dpList.get(i);
            List<Integer> curFloor = new ArrayList<>();

            int a = 0;
            for(int j = 0; j < 14; j++){
                a = a + underFloor.get(j);
                curFloor.add(a);
            }
            dpList.add(curFloor);
        }
        while (t > 0){
            int k = sc.nextInt();
            int n = sc.nextInt();

            System.out.println(dpList.get(k).get(n-1));
            t--;
        }
    }
}
