package com.talif;
public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 3, 2, 1};
        int target=1;
        int ans = peakIndexInMountainArray(arr,target);
        System.out.println(ans);
    }
    static int peakIndexInMountainArray(int[] arr,int target) {
        int i=0;
        while ( i < arr.length){
            if(arr[i]==target){
                return i;
            }
            else{
                i++;
            }
        }
        return -1;
   }
}