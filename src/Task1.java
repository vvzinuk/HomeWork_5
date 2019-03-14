public class Task1 {
    public static void printReversedArray(int[] array){
        printArray(array);

        System.out.print("Reversed array: ");
        for (int i = array.length - 1; i>=0 ; i--){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("_________________________");
    }

    public static void printArray(int[] array){
        System.out.print("Created array: ");
        for (int arr : array) {
            System.out.print(arr + " ");
        }
        System.out.println();
    }
}
