package com.talif;

import java.io.OptionalDataException;

public class Rotated_array {
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 10, 11, 12, 13, 4, 5, 6};
        System.out.println(findPivot(arr));
        int target=11;
       int ans=Search(arr,target);
        System.out.println(ans);

    }
    static int Search(int[]arr,int target){
        int pivot=findPivot(arr);
        if(pivot==-1){
          return binarySearch(arr,target,0,arr.length-1);
        }
        // pivot is found
        if(arr[pivot]==target){
            return pivot;
        }
        if (target >= arr[0]) {
            return binarySearch(arr,target ,0, pivot-1);
        }
        return binarySearch(arr,target, pivot+1,arr.length-1);

    }
    static int binarySearch(int[]arr,int target,int start,int end){
        //Normal Binary search
        while(start<=end) {
            //(start+end)/2=S+(E-S)/2
            int mid = start+(end-start)/2;
            if (target <arr[mid]) {
                end = mid - 1;
            } else if (target >arr[mid]) {
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //4 cases will be there to find Pivot element
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid-1;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = end - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }
}
