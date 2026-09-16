public class StringSort {
    public static void main(String[] args) {
        String[] names = {"Harry", "Hermione", "Draco", "Ginny", "Albus"};
        
        sortAlphabetically(names);
        
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
    
    public static void sortAlphabetically(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIdx]) < 0) {
                    minIdx = j;
                }
            }
            String temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}