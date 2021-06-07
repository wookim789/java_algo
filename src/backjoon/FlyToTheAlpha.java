package backjoon;

import java.util.Scanner;

//public class Main {
public class FlyToTheAlpha {
    public static void main(String[] args) throws Exception{
        // k - 1, k, k + 1
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0){
            int st = Integer.parseInt(sc.next());
            int ed = Integer.parseInt(sc.next());
            int k = 0;
            int distance = st;
            int result = 0;
            boolean isAccelerate = true;

            while(distance < ed){
                if(k * (k+1)/2 < (ed-st)/2 && isAccelerate){
                    k++;
                }else if(k > 1){
                    isAccelerate = false;
                    k--;
                }
//                System.out.println(k + " " + distance);
                distance += k;
                result++;
            }
            System.out.println(result);
            t--;
//            System.out.println();
        }
    }
}
