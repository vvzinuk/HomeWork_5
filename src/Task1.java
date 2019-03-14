class Task1 {
    static void printReversedArray(int[] array){
        System.out.println("TASK 1: REVERSE ARRAY");
        printArray("Generated array: ",array);

        System.out.print("Reversed array:  ");
        for (int i = array.length - 1; i>=0 ; i--){
            System.out.print(array[i] + ((array[i]/10)>0?" ":"  ")); //ternary operator is here to set equal interval between the elements
        }
        System.out.println();
        System.out.println("_________________________");
    }

    static void printArray(String message, int[] array){
        System.out.print(message);
        for (int arr : array) {
            System.out.print(arr + ((arr/10)>0?" ":"  "));
        }
        System.out.println();
    }
}
