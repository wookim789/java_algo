package backjoon.mathtwo;

import java.util.*;

public class Eretenethos2 {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);

        int m = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());

        List<Integer> ereList = new ArrayList<>(Arrays.asList(2));

        int x = 3;

        while(x <= n){
            for(int i = 0; i < ereList.size(); i++){
                if(x % ereList.get(i) == 0){
                    break;
                }else if (i == ereList.size() - 1){
                    ereList.add(x);
                    break;
                }
            }
            x++;
        }

        int sum = 0;
        int min = 0;
        boolean isEmpty = true;
        for(Integer ele : ereList){
            if(ele >= m && ele <= n){
                if(sum == 0){
                    min = ele;
                }
                sum += ele;
                isEmpty = false;
            }
        }
        if(isEmpty){
            System.out.println(-1);
            return;
        }
        System.out.println(sum);
        System.out.println(min);
    }
}
