public class CielingofArray {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,6,7,8,88};
        int target=5;
        int ans=ceiling(arr,target);
        System.out.println(ans);

    }
    static int ceiling(int[]arr,int target){
        if(target>arr.length-1){
            return -1;
        }
        int start=0;
        int end= arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}
