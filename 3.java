
 class Solution {
    int res;
    int min;
    int lSum=0;
    int rSum=0;

    public int solution(int[] a) {
        for (int i =0; i<a.length; i++){
            min +=a[i];
        }
        lSum=min-a[a.length-1];
        rSum=a[a.length-1];
        for (int i = a.length-1; i>0; i--){
            if (Math.abs(lSum-rSum)<min){
                min=Math.abs(lSum-rSum);
            }
            lSum=lSum-a[i-1];
            rSum=rSum+a[i-1];
        }

        return min;
    }
}
