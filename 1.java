
import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    int res;

    public int solution(int[] a) {
//        Arrays.sort(a);
//        int res=-1;
//        for (int i = 1; i<a.length; i++){
//            if(a[i]-a[i-1]!=1){
//                res = i+1;
//                break;
//            }
//        }
//        return res;
//         }
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if (a[i] == i + 1) {
            } else {
                res = i + 1;
                break;
            }
        }

        return res;
    }


}
