public class linearsearch {
    public static int linearsearch(int arr[],int key) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==key){
                return i;
            }
        }
    return-1;
    }

    public static void main(String[] args) {
        int[] a1 = {10, 20, 30, 40, 50};
        int key = 20;
        System.out.println(key + " is found at index: " + linearsearch(a1, key));
    }

    }
