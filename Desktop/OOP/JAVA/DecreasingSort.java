public class DecreasingSort {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};
        decreasing(numbers);
        
        System.out.println("Decreasing Order: ");
        printArray(numbers);
    }
    
    public static void decreasing(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}