package BinarySearch;

import java.util.Scanner;

public class Obc {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in);
        System.out.println(" Here we wish to do order agnoistic BS  : ");
        //int []  a = {2,4,6,8,10,12,13,14};
        int[] a = {9,8,7,6,5,4,3,2,1};
        int target = 6;
        boolean isAs = a[0] < a[a.length-1];

        int start =0;
        int end = a.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;


            if(isAs){
                if(target > a[mid])
                    start= mid+1;
                else if(target < a[mid])
                    end= mid-1;
                else {
                    System.out.println("Element found at index : " + mid);
                    break;
                }
            }
            else{
                if(target > a[mid])
                    end = mid - 1;
                else if(target < a[mid])
                    start = mid + 1;
                else {
                    System.out.println("Element found at index : " + mid);
                    break;
                }
            }

        }
    }
}
