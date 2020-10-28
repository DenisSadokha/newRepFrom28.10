import java.util.ArrayList;

public class Sol2 {
    int res = -1;
    ArrayList<Integer> arr = new ArrayList<>();


    public int solution(int[] a) {
        int maxDeep=-1;
        for (int i = 0; i < a.length-1; i++) {
            arr.add(a[i]);
            for (int b =1; b<a.length; b++){
                arr.add(a[b]);
                int control = findMin(arr);
                if(maxDeep<control){
                    maxDeep=control;
                }

            }
            arr.clear();
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

