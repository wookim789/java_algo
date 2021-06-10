package backjoon.mathtwo;

import java.util.*;
import java.util.stream.Collectors;

public class Eretenethos {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);

        int T = Integer.parseInt(sc.nextLine());

        List<Integer> list = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int max = list.stream()
                .mapToInt(x->x)
                .max()
                .getAsInt();

        List<Integer> ereList = new ArrayList<>(Arrays.asList(2, 3));
        int x = 4;
        while(x <= max){
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

        int result = 0;
        for(Integer ele : list){
            if(ereList.contains(ele)){
                result ++;
            }
        }

        System.out.println(result);
    }
}
