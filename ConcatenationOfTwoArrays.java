 class ConcatenationOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {50, 60, 70};
        
        // Create a new array to hold both
        int[] result = new int[arr1.length + arr2.length];
        
        int k = 0;
        // Copy first array
        for (int i = 0; i < arr1.length; i++) {
            result[k] = arr1[i];
            k++;
        }
        
        // Copy second array
        for (int i = 0; i < arr2.length; i++) {
            result[k] = arr2[i];
            k++;
        }
        
        // Print the concatenated array
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}