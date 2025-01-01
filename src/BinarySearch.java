public class BinarySearch {
    public static void main(String[] args) {
        int []arr={1,2,3,34,75,133,234,346,765,98};
        int target=34;
        int ans=binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=1) {
            //(start+end)/2=S+(E-S)/2
            int mid = start+(end-start)/2;
            if (target < mid) {
                end = mid - 1;
            } else if (target > mid) {
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}