class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int m = s+((e-s)/2);
        int max = Integer.MIN_VALUE;
        int maxIdx = -1;
        if(arr[m]<arr[m+1]){
            for(int i=m+1; i<n; i++){
                if(arr[i]>max){
                    max = arr[i];
                    maxIdx = i;
                }
            }
        }
        else {
            for(int i=0; i<=m; i++){
                if(arr[i]>max){
                    max = arr[i];
                    maxIdx = i;
                }
            }
        }
        return maxIdx;  
    }
}