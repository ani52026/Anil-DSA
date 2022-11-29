package BinarySearch;

public class FloorOfNumber {
    public static int floor(int[] arr, int target){
       /* if(target>arr[arr.length - 1]){
            return -1;
        }*/
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start]<arr[end];
        while(start<=end){
            int mid = start + (end - start)/2;
            if(isAsc){
                if(target>arr[mid]){
                    start = mid + 1;
                }
                else if (target<arr[mid]){
                    end = mid - 1;
                }
                else {
                    return mid;
                }
            }
            else{
                if(target>arr[mid]){
                    end = mid - 1;
                }
                else if (target<arr[mid]){
                    start = mid + 1;
                }
                else {
                    return mid;
                }
            }
        }
        return end;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 1;
        int ans = floor(arr,target);
        System.out.println(ans);

    }
}


