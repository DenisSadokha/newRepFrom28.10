// Можно использовать импорты, например:
// import java.util.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntBinaryOperator;

public class Sol4 {
    ArrayList<Integer> arrayList = new ArrayList<>();

    public int solution(int[] a) {
        int maxDeep = -1;
        int localMin;
        for (int i = 0; i < a.length; i++) {
            int b = i;
            arrayList.add(a[i]);
            try {
                while (a[i] > a[b + 1]) {
                    arrayList.add(a[b+1]);
                    b++;
                }

            } catch (ArrayIndexOutOfBoundsException e) {
            }
            try {
                arrayList.add(a[b + 1]);
            }catch (ArrayIndexOutOfBoundsException e){

            }
            int control = findMin(arrayList);
            if(maxDeep<control){
                maxDeep=control;
            } else i=b;
            arrayList.clear();



        }

        return maxDeep;
    }


    public int findMin(ArrayList<Integer> arrayList) {
        if(arrayList.size()<=2){
            return 0;
        }
        int min = -1;
        int check;
        if (arrayList.get(0) > arrayList.get(arrayList.size()-1)) {
            check = arrayList.get(arrayList.size()-1);
        } else {
            check = arrayList.get(0);
        }
        for (int i = 1; i < arrayList.size() - 1; i++) {
            if (check -arrayList.get(i) > min) {
                min = check - arrayList.get(i);

            }
        }
        return min;

    }

}
