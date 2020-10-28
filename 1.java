// Можно использовать импорты, например:
// import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 class Solution {
    public int solution(int[] a) {
        Arrays.sort(a);
        int res=-1;

        for (int i = 1; i<a.length; i++){
            if(a[i]-a[i-1]!=1){
                res= i+1;
                break;
            }
        }



        return res;
    }
}
