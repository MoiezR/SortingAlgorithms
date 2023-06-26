import java.lang.Math;
import java.util.Scanner;

class RadixSort{

    public static void radixSort(int arr[], int n){
        int max = maxElement(arr, n);
        int k = countDigits(max);
        sort(arr, n, k);
    }

    public static int maxElement(int arr[], int n){
        int max = arr[0];
        for(int i = 0; i<n ; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int countDigits(int max){
        int count = 1;
        int k = 0;
        while(max>0){
            max/=count;
            count*=10;
            k++;
        }
        return k;
    }

    public static void sort(int arr[], int n, int k){
        for(int x = 1; x<=k ; x++){
            for(int i = 0; i<n; i++){
                for(int j =i+1; j<n ; j++){
                    if(arr[j]<arr[i]){
                        int temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();

        int arr[]=new int[n];
        for(int i =0; i<n; i++){
            System.out.println("Enter the values of the array : ");
            arr[i]=sc.nextInt();
        }

        radixSort(arr, n);
        
        System.out.println("The sorted array is : ");

        for(int i =0; i<n; i++){
            System.out.print(" "+arr[i]+" ");
        }

        sc.close();
    }
}