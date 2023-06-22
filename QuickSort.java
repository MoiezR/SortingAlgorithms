import java.util.Scanner;

class test {
    public static int partition(int arr[], int LB, int UB) {
        int start, end, pivot;
        start = LB;
        end = UB;
        pivot = LB;

        while (start < end) {

            while (arr[start] <= arr[pivot] && start < UB) {

                start++;
            }

            while (arr[end] >= arr[pivot] && end > LB) {
                end--;
            }
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            } else if (start >= end) {
                int temp = arr[pivot];
                arr[pivot] = arr[end];
                arr[end] = temp;
            }
        }

        return end;
    }

    public static void quickSort(int arr[], int LB, int UB) {

        if (LB < UB) {
            int loc = partition(arr, LB, UB);
            quickSort(arr, LB, loc - 1);
            quickSort(arr, loc + 1, UB);
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the values for the array : ");
            arr[i] = sc.nextInt();
        }
        int LB = 0;
        int UB = n - 1;

        quickSort(arr, LB, UB);

        System.out.println("/");

        System.out.println("The elements of the sorted array are : ");

        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i] + " ");
        }

        sc.close();

    }
}
