import java.util.Scanner;

class MergeSort {

    /*Here LB = Lower Bound (first index)
     * UB = Upper Bound (last index)
     * mid = index of the element at the middle of the array
     */

    public static void mergeSort(int arr[], int LB, int UB) {
        if (LB < UB) {

            int mid = (LB + UB) / 2;
            
            mergeSort(arr, LB, mid);
            mergeSort(arr, mid + 1, UB);
            
            merge(arr, LB, mid, UB);
        }
    }

    public static void merge(int arr[], int LB, int mid, int UB){

        int n1 = mid-LB+1;
        int n2 = UB-mid;
        int L[] = new int[n1+1];
        int R[] = new int[n2+1];

        for(int i = 0 ; i < n1 ; i++){
            L[i] = arr[LB+i];
        }
        for(int j = 0 ; j < n2 ; j++){
            R[j]=arr[mid+1+j];
        }

        int i = 0, j = 0, k = LB;

        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }
    }


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i = 0; i< n; i++){
            System.out.println("Enter the values of the array : ");
            arr[i]=sc.nextInt();
        }
        
        int LB = 0;
        int UB = n-1;
        
        mergeSort(arr, LB, UB);
        
        System.out.println("The sorted array is : ");
        
        for (int i =0 ; i<UB+1 ; i++){
            System.out.print(" "+arr[i]+" ");
        }

        sc.close();
    }

}