public class Selectionsort {
    public static void Selectionsort(int[] arr) {
        int i, j, min, temp;
        for (i = 0; i < arr.length; i++) {
            min = i;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i])
                    min = j;
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        int arr[]={3,60,35,2,45,320,5};
        System.out.println("array before sort");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        Selectionsort(arr);
        System.out.println("array after  sort");
        for( int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
