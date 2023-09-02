import java.util.Scanner;

class CountingSort {

    /* Here the max integer denotes the highest value of a single element in the array
     * We use this to initialize the length of the new array named "newarr"
     */

    public static void CountingSort(int arr[], int n){

        int max = range(arr, n);

        int newarr[] = new int[max+1];

        System.out.println("");

        for(int i  = 0 ; i<n; i++){
            ++newarr[arr[i]];
        }

        System.out.println("The sorted array is : ");
        for(int i = 0; i<=max; i++){
            if(newarr[i]!=0){
                System.out.print(" "+i+" ");
                newarr[i]--;
            }
        }
    }

    public static int range(int arr[] , int n){

        int max = arr[0];

        for(int i =0; i<n ; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the values of the array : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("The inserted array is : ");
        for(int i = 0; i<n ; i++){
            System.out.print(" "+arr[i]+" ");
        }

        CountingSort(arr, n);
    }
}